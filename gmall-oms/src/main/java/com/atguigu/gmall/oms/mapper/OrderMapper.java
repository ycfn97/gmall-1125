package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunqi
 * @email ycfn97@qq.com
 * @date 2021-08-04 14:18:40
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
