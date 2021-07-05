package com.zsf.mssc.service;

import com.zsf.mssc.entitys.Goods;

public interface GoodsService {

    /**
     * 减掉商品库存——悲观锁
     * @param goods
     * @return
     */
    int updateGoodsCount(Goods goods);

    /**
     * 减掉商品库存——乐观锁
     * @param goods
     * @param version
     * @return
     */
    int updateGoodsCountOptimisticLock(Goods goods,int version);

    /**
     * 查询商品
     * @return
     */
    Goods getGoods();
}
