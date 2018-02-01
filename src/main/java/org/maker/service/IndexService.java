package org.maker.service;

import org.maker.pojo.Edits;
import org.maker.pojo.Essaythemes;
import org.maker.pojo.Solicitarticless;

import java.util.List;
import java.util.Map;

public interface IndexService {
    List<Edits> queryIndexMenuList() throws Exception;

    List<Essaythemes> queryEssaythemesTitleSpan() throws Exception;

    List<Solicitarticless> queryIndexSolicitarticlesUl(Solicitarticless solicitarticless) throws Exception;

    Map<String,Object> queryNextEssayAndNumber() throws Exception;

    List<Solicitarticless> queryPastArtWITHfive() throws Exception;
}
