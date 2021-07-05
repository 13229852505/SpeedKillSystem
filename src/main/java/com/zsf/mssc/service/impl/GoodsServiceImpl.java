package com.zsf.mssc.service.impl;

import com.zsf.mssc.dao.GoodsMapper;
import com.zsf.mssc.entitys.Goods;
import com.zsf.mssc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int updateGoodsCount(Goods goods) {
        return goodsMapper.updateGoodsCount(goods);
    }

    @Override
    public int updateGoodsCountOptimisticLock(Goods goods, int version) {
        return goodsMapper.updateGoodsCountOptimisticLock(goods,version);
    }

    @Override
    public Goods getGoods() {
        return goodsMapper.getGoods();
    }
}
