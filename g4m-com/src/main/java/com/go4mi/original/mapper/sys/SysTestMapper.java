package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.go4mi.original.entity.sys.SysTest;

/**
 * 测试,测试数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysTestMapper {
	/**
	 * 根据id查询测试,测试实体
	 * @param id
	 * @return
	 */
	public SysTest selectSysTestById(Long id);

	/**
	 * 根据条件查询测试,测试实体
	 * @param map
	 * @return
	 */
	public List<SysTest> selectSysTestByCondition(Map<String, Object> map);
	
	/**
	 * 分页查询测试,测试实体
	 * @param map
	 * @return
	 */
	public List<SysTest> selectSysTestByPager(Map<String, Object> map);

	/**
	 * 分页查询测试,测试实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysTestCountByPager(Map<String, Object> condition);

	/**
	 * 更新测试,测试实体
	 * @param sysTestForm
	 */
	public void updateSysTest(SysTest sysTestForm);

	/**
	 * 插入测试,测试实体
	 * @param sysTestForm
	 */
	public void insertSysTest(SysTest sysTestForm);

	/**
	 * 根据条件更新测试,测试实体
	 * @param condition
	 */
	public void updateSysTestByCondition(Map<String, Object> condition);

	/**
	 * 删除测试,测试实体
	 * @param ids
	 */
	public void delSysTestByIds(@Param("ids")String ids);

	/**
	 * 查询所有测试,测试实体
	 * @return
	 */
	public List<SysTest> selectSysTestAll();

}
