package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.go4mi.original.entity.sys.SysUser;

/**
 * 数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysUserMapper {
	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public SysUser selectSysUserById(Long id);

	/**
	 * 根据条件查询实体
	 * @param map
	 * @return
	 */
	public List<SysUser> selectSysUserByCondition(Map<String, Object> condition);
	
	/**
	 * 分页查询实体
	 * @param map
	 * @return
	 */
	public List<SysUser> selectSysUserByPager(Map<String, Object> condition);

	/**
	 * 分页查询实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysUserCountByPager(Map<String, Object> condition);

	/**
	 * 更新实体
	 * @param sysUserForm
	 */
	public void updateSysUser(SysUser sysUserForm);

	/**
	 * 插入实体
	 * @param sysUserForm
	 */
	public void insertSysUser(SysUser sysUserForm);

	/**
	 * 根据条件更新实体
	 * @param condition
	 */
	public void updateSysUserByCondition(Map<String, Object> condition);

	/**
	 * 删除实体
	 * @param ids
	 */
	public void delSysUserByIds(String ids);

}
