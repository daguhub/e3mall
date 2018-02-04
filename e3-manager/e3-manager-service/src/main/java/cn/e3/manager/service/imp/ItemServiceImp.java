package cn.e3.manager.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImp implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;
	@Override
	public TbItem findTbItemById(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

	
}
