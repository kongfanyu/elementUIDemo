package com.yxzx.ebs.service.imp;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxzx.ebs.entity.TGoods;
import com.yxzx.ebs.mapper.TGoodsMapper;
import com.yxzx.ebs.service.TGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TGoodsServiceImpl extends ServiceImpl<TGoodsMapper, TGoods> implements TGoodsService {
    @Autowired
    private TGoodsMapper goodsMapper;
    @Override
    public IPage<TGoods> findByPage(IPage<TGoods> page) {
        return goodsMapper.findByPage(page);
    }
}
