package com.hxzy.mapper;

import com.hxzy.entity.Item;

public interface ItemMapper extends CommonMapper<Item>{

	/**
	 * ����itemId��ѯ��Ʒ��Ϣ
	 * @param id
	 * @return
	 */
	public Item findItemById(Integer id);
}
