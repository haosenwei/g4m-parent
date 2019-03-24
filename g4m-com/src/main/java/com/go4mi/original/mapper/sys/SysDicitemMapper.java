package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.go4mi.original.entity.sys.SysDicitem;


/**
 * 数据字典项,数据字典项数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysDicitemMapper {
	/**
	 * 根据id查询数据字典项,数据字典项实体
	 * @param id
	 * @return
	 */
	public SysDicitem selectSysDicitemById(Long id);

	/**
	 * 根据条件查询数据字典项,数据字典项实体
	 * @param map
	 * @return
	 */
	public List<SysDicitem> selectSysDicitemByCondition(Map<String, Object> map);
	
	/**
	 * 分页查询数据字典项,数据字典项实体
	 * @param map
	 * @return
	 */
	public List<SysDicitem> selectSysDicitemByPager(Map<String, Object> map);

	/**
	 * 分页查询数据字典项,数据字典项实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysDicitemCountByPager(Map<String, Object> condition);

	/**
	 * 更新数据字典项,数据字典项实体
	 * @param sysDicitemForm
	 */
	public void updateSysDicitem(SysDicitem sysDicitemForm);

	/**
	 * 插入数据字典项,数据字典项实体
	 * @param sysDicitemForm
	 */
	public void insertSysDicitem(SysDicitem sysDicitemForm);

	/**
	 * 根据条件更新数据字典项,数据字典项实体
	 * @param condition
	 */
	public void updateSysDicitemByCondition(Map<String, Object> condition);

	/**
	 * 删除数据字典项,数据字典项实体
	 * @param ids
	 */
	public void delSysDicitemByIds(String ids);

	/**
	 * 查询所有数据字典项,数据字典项实体
	 * @return
	 */
	public List<SysDicitem> selectSysDicitemAll();

}
