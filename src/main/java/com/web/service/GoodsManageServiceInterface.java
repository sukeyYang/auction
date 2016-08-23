package com.web.service;

import com.web.model.Goods;
import org.springframework.stereotype.Service;

/**
 * Created by sukey on 2016/8/18.
 */
@Service
public interface GoodsManageServiceInterface {

    public void addGoods(Goods goods);

    public void  modifyGoods(String id , int num);

    public void deleteGoods(String id);

    public Goods findGoods(Goods goods);




}
