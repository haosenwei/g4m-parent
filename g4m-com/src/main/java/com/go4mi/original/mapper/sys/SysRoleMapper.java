package com.go4mi.original.mapper.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.go4mi.original.entity.sys.SysRole;


/**
 * 角色管理,角色管理数据库接口类
 * @author hsw
 *
 */
@Mapper
public interface SysRoleMapper {
	/**
	 * 根据id查询角色管理,角色管理实体
	 * @param id
	 * @return
	 */
	public SysRole selectSysRoleById(Long id);

	/**
	 * 根据条件查询角色管理,角色管理实体
	 * @param map
	 * @return
	 */
	public List<SysRole> selectSysRoleByCondition(Map<String, Object> map);
	
	/**
	 * 分页查询角色管理,角色管理实体
	 * @param map
	 * @return
	 */
	public List<SysRole> selectSysRoleByPager(Map<String, Object> map);

	/**
	 * 分页查询角色管理,角色管理实体条数
	 * @param condition
	 * @return
	 */
	public int selectSysRoleCountByPager(Map<String, Object> condition);

	/**
	 * 更新角色管理,角色管理实体
	 * @param sysRoleForm
	 */
	public void updateSysRole(SysRole sysRoleForm);

	/**
	 * 插入角色管理,角色管理实体
	 * @param sysRoleForm
	 */
	public void insertSysRole(SysRole sysRoleForm);

	/**
	 * 根据条件更新角色管理,角色管理实体
	 * @param condition
	 */
	public void updateSysRoleByCondition(Map<String, Object> condition);

	/**
	 * 删除角色管理,角色管理实体
	 * @param ids
	 */
	public void delSysRoleByIds(String ids);

}
