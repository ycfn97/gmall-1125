package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UserEntity;

import java.util.Map;

/**
 * 用户表
 *
 * @author sunqi
 * @email ycfn97@qq.com
 * @date 2021-08-04 14:25:39
 */
public interface UserService extends IService<UserEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

