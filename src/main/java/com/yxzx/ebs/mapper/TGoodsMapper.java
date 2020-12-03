package com.yxzx.ebs.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yxzx.ebs.entity.TGoods;
import org.springframework.stereotype.Component;
@Component
public interface TGoodsMapper extends BaseMapper<TGoods> {
    /**
     * 多表分页查询
     */
    IPage<TGoods> findByPage(IPage<TGoods> page);
}
