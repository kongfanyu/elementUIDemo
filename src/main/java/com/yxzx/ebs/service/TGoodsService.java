package com.yxzx.ebs.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yxzx.ebs.entity.TGoods;
public interface TGoodsService extends IService<TGoods> {
    /**
     * 多表分页查询
     */
    IPage<TGoods> findByPage(IPage<TGoods> page);
}
