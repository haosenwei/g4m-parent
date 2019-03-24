package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.go4mi.original.entity.sys.SysDic;


/**
 * 数据字典,数据字典表数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysDicMapper {
	/**
	 * 根据id查询数据字典,数据字典表实体
	 * @param id
	 * @return
	 */
	public SysDic selectSysDicById(Long id);

	/**
	 * 根据条件查询数据字典,数据字典表实体
	 * @param map
	 * @return
	 */
	public List<SysDic> selectSysDicByCondition(Map<String, Object> map);
	
	/**
	 * 分页查询数据字典,数据字典表实体
	 * @param map
	 * @return
	 */
	public List<SysDic> selectSysDicByPager(Map<String, Object> map);

	/**
	 * 分页查询数据字典,数据字典表实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysDicCountByPager(Map<String, Object> condition);

	/**
	 * 更新数据字典,数据字典表实体
	 * @param sysDicForm
	 */
	public void updateSysDic(SysDic sysDicForm);

	/**
	 * 插入数据字典,数据字典表实体
	 * @param sysDicForm
	 */
	public void insertSysDic(SysDic sysDicForm);

	/**
	 * 根据条件更新数据字典,数据字典表实体
	 * @param condition
	 */
	public void updateSysDicByCondition(Map<String, Object> condition);

	/**
	 * 删除数据字典,数据字典表实体
	 * @param ids
	 */
	public void delSysDicByIds(@Param("ids")String ids);

	/**
	 * 查询所有数据字典,数据字典表实体
	 * @return
	 */
	public List<SysDic> selectSysDicAll();

}
