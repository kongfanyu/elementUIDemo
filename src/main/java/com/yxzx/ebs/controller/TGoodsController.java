package com.yxzx.ebs.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxzx.ebs.entity.Result;
import com.yxzx.ebs.entity.TGoods;
import com.yxzx.ebs.service.TGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/ebs/goods")
public class TGoodsController {
    @Autowired
    private TGoodsService goodsService;
    @GetMapping("{currentPage}/{pageSize}")
    public Result findByPage(@PathVariable Long currentPage,
                             @PathVariable Long pageSize){
        //创建分页对象
        Page<TGoods> pageParam = new Page<>(currentPage,pageSize);
        IPage<TGoods> page = goodsService.findByPage(pageParam);
        return Result.ok().data("total",page.getTotal()).data("rows",page.getRecords());
    }
}

