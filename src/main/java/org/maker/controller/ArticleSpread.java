package org.maker.controller;


import org.maker.pojo.Advertisement;
import org.maker.pojo.Solicitarticless;
import org.maker.service.Adverservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 文章管理controller
 * Andy
 */
@Controller
public class ArticleSpread {

    @Autowired
    private Adverservice adverservice;

    /**
     * 推广轮播图
     * @return
     */
    @RequestMapping("/Spread/querySpread")
    @ResponseBody
    public Object querySpread() {
        List<Solicitarticless> spread=adverservice.querySpread();
        return spread;
    }

    /**
     * 查询广告
     * @return
     */
 @RequestMapping("/Spread/queryAd")
    @ResponseBody
    public Object queryAd() {
        List<Advertisement> Ad=adverservice.queryAd();
        return Ad;
    }


}
