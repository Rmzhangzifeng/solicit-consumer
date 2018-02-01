package org.maker.controller;

import org.maker.pojo.Edits;
import org.maker.pojo.Essaythemes;
import org.maker.pojo.Solicitarticless;
import org.maker.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 查询index首页菜单列表
     */
    @RequestMapping("index/queryIndexMenuList")
    @ResponseBody
    public Object queryIndexMenuList(){
        List<Edits> IndexMenuList = null;
        try {
            IndexMenuList = indexService.queryIndexMenuList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IndexMenuList;
    }

    /**
     * 查询首页征文本期话题title
     */
    @RequestMapping("index/queryEssaythemesTitleSpan")
    @ResponseBody
    public Object queryEssaythemesTitleSpan(HttpServletRequest request){
        List<Essaythemes> essaythemesList = null;
        try {
            essaythemesList = indexService.queryEssaythemesTitleSpan();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return essaythemesList.get(0);
    }

    /**
     * 查询首页征文内容
     */
    @RequestMapping("index/queryIndexSolicitarticlesUl")
    @ResponseBody
    public Object queryIndexSolicitarticlesUl(HttpServletRequest request,Solicitarticless solicitarticless){
        List<Solicitarticless> solicitarticlessList = null;
        List<Solicitarticless> resultSolicitartList = new ArrayList<Solicitarticless>();
        try {
            solicitarticlessList = indexService.queryIndexSolicitarticlesUl(solicitarticless);
            for (int i=0;i<solicitarticlessList.size();i++){
                if(i<3){
                    if(solicitarticlessList.get(i).getContentStr().length()>40){
                        solicitarticlessList.get(i).setContentStr(solicitarticlessList.get(i).getContentStr().substring(0,40));
                    }
                    resultSolicitartList.add(solicitarticlessList.get(i));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSolicitartList;
    }

    /**
     * 查询首页下期征文标题以及已投稿个数
     */
    @RequestMapping("index/queryNextEssayAndNumber")
    @ResponseBody
    public Object queryNextEssayAndNumber(HttpServletRequest request){
        Map<String,Object> resultMap = null;
        try {
            resultMap = indexService.queryNextEssayAndNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultMap;
    }

    /**
     * 查询首页往期征文展示
     * @return
     */
    @RequestMapping("index/queryPastArtWITHfive")
    @ResponseBody
    public Object queryPastArtWITHfive(){
        List<Solicitarticless> solicitarticlessList = null;
        try {
            solicitarticlessList = indexService.queryPastArtWITHfive();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return solicitarticlessList;
    }

}
