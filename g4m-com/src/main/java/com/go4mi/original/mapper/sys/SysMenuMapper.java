package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.go4mi.original.entity.sys.SysMenu;

/**
 * 数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysMenuMapper {
	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public SysMenu selectSysMenuById(Long id);

	/**
	 * 根据条件查询实体
	 * @param map
	 * @return
	 */
	public List<SysMenu> selectSysMenuByCondition(Map<String, Object> map);
	
	/**
	 * 分页查询实体
	 * @param map
	 * @return
	 */
	public List<SysMenu> selectSysMenuByPager(Map<String, Object> map);

	/**
	 * 分页查询实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysMenuCountByPager(Map<String, Object> condition);

	/**
	 * 更新实体
	 * @param sysMenuForm
	 */
	public void updateSysMenu(SysMenu sysMenuForm);

	/**
	 * 插入实体
	 * @param sysMenuForm
	 */
	public void insertSysMenu(SysMenu sysMenuForm);

	/**
	 * 根据条件更新实体
	 * @param condition
	 */
	public void updateSysMenuByCondition(Map<String, Object> condition);

	/**
	 * 删除实体
	 * @param ids
	 */
	public void delSysMenuByIds(@Param("ids")String ids);

}
