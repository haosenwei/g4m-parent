package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.go4mi.original.entity.sys.SysTable;

/**
 * 数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysTableMapper {
	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public SysTable selectSysTableById(Long id);

	/**
	 * 根据条件查询实体
	 * @param map
	 * @return
	 */
	public List<SysTable> selectSysTableByCondition(Map<String, Object> map);
	
	/**
	 * 分页查询实体
	 * @param map
	 * @return
	 */
	public List<SysTable> selectSysTableByPager(Map<String, Object> map);

	/**
	 * 分页查询实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysTableCountByPager(Map<String, Object> condition);

	/**
	 * 更新实体
	 * @param sysTableForm
	 */
	public void updateSysTable(SysTable sysTableForm);

	/**
	 * 插入实体
	 * @param sysTableForm
	 */
	public void insertSysTable(SysTable sysTableForm);

	/**
	 * 根据条件更新实体
	 * @param condition
	 */
	public void updateSysTableByCondition(Map<String, Object> condition);

	/**
	 * 删除实体
	 * @param ids
	 */
	public void delSysTableByIds(String ids);

	public void createTableById(SysTable sysTable);

}
