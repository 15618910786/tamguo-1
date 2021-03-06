package com.tamguo.admin.service;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.tamguo.admin.model.MenuEntity;

/**
 * Service - 类型
 * 
 * @author candy.tam
 *
 */
public interface IMenuService {

	/** 获取类型数结构 */
	public List<MenuEntity> findMenus();
	
	/** 获取所有头部菜单 */
	public List<MenuEntity> findAllMenus();

	/** 获取左侧菜单*/
	public List<MenuEntity> findLeftMenus();
	
	/** 资格考试专区*/
	public List<MenuEntity> findFooterMenus();

	/** 根据名称查询*/
	public Page<MenuEntity> list(String name, Page<MenuEntity> page);

	/** 获取菜单树*/
	public List<MenuEntity> getMenuTree();
	
	/** 获取菜单*/
	public MenuEntity findById(String uid);

	/** 保存*/
	public void save(MenuEntity menu);

	/** 修改*/
	public void update(MenuEntity menu);

	/** 删除*/
	public void deleteBatch(String[] menuIds);
}
