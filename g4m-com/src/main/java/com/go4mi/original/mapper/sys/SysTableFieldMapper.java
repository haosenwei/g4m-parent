package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.go4mi.original.entity.sys.SysTableField;

/**
 * 字段表,字段表数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysTableFieldMapper {
	/**
	 * 根据id查询字段表,字段表实体
	 * @param id
	 * @return
	 */
	public SysTableField selectSysTableFieldById(Long id);

	/**
	 * 根据条件查询字段表,字段表实体
	 * @param map
	 * @return
	 */
	public List<SysTableField> selectSysTableFieldByCondition(Map<String, Object> map);
	
	/**
	 * 分页查询字段表,字段表实体
	 * @param map
	 * @return
	 */
	public List<SysTableField> selectSysTableFieldByPager(Map<String, Object> map);

	/**
	 * 分页查询字段表,字段表实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysTableFieldCountByPager(Map<String, Object> condition);

	/**
	 * 更新字段表,字段表实体
	 * @param sysTableFieldForm
	 */
	public void updateSysTableField(SysTableField sysTableFieldForm);

	/**
	 * 插入字段表,字段表实体
	 * @param sysTableFieldForm
	 */
	public void insertSysTableField(SysTableField sysTableFieldForm);

	/**
	 * 根据条件更新字段表,字段表实体
	 * @param condition
	 */
	public void updateSysTableFieldByCondition(Map<String, Object> condition);

	/**
	 * 删除字段表,字段表实体
	 * @param ids
	 */
	public void delSysTableFieldByIds(@Param("ids")String ids);

	/**
	 * 查询所有字段表,字段表实体
	 * @return
	 */
	public List<SysTableField> selectSysTableFieldAll();

}
