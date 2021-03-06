package com.fallllllll.lipper.data.network.model;

import com.fallllllll.lipper.data.databean.ShotBean;
import com.fallllllll.lipper.data.local.user.LipperUser;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by fallllllll on 2017/3/8.
 * GitHub :  https://github.com/348476129/Lipper
 */

public interface DribbbleModel {
    Flowable<List<ShotBean>> getShot(String list, String timeframe,String sort,String page);

    Flowable<LipperUser> getUserInfo();

}
