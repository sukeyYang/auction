package com.web.model;

/**
 * Created by sukey on 2016/8/21.
 */
public class StockGoods extends Goods {

    private int stock ;


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static void main(String[] args){
        StockGoods  goods = new StockGoods();
    }
}
