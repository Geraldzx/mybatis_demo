package com.hxzy.mapper;

import com.hxzy.entity.OrdersDetail;

public interface OrdersDetailMapper extends CommonMapper<OrdersDetail> {
	/**
	 * ���ݶ�����ϸ��Ų�ѯ������ϸ
	 * @param id
	 * @return
	 */
	public OrdersDetail findDetailById(Integer id);
}
