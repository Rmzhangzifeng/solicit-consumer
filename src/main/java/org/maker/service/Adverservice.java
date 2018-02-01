package org.maker.service;

import org.maker.pojo.Advertisement;
import org.maker.pojo.Solicitarticless;

import java.util.List;

public interface Adverservice {

    List<Solicitarticless> querySpread();

    List<Advertisement> queryAd();
}
