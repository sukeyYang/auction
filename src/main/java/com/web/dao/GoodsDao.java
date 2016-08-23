package com.web.dao;

import java.util.List;

import com.sun.org.apache.xpath.internal.operations.String;
import com.web.model.Goods;

/**
 * Created by sukey on 2016/8/23.
 */
public interface GoodsDao {

    /**
     * 添加商品
     * @param goods
     */
    public void saveGoods(Goods goods);

    /**
     * 删除商品
      * @param id
     */
    public void deleteGoods(String id);


    /**
     * 查找商品
     * @param goods
     * @return
     */
    public List<Goods> findGoods(Goods goods);



}
