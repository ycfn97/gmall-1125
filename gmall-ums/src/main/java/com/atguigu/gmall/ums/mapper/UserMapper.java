package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author sunqi
 * @email ycfn97@qq.com
 * @date 2021-08-04 14:25:39
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
