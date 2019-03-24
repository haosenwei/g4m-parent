package com.go4mi.original.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.go4mi.original.entity.common.Pager;
import com.go4mi.original.entity.sys.SysRole;
import com.go4mi.original.mapper.sys.SysRoleMapper;

/**
 * 角色管理,角色管理服务实现类
 * @author hsw
 *
 */
@Service
@Transactional
public class SysRoleServiceImpl {

	/**角色管理,角色管理实体操作类**/
	@Autowired
	private	SysRoleMapper sysRoleMapper;

	/**
	 * 根据id查询角色管理,角色管理对象
	 * @param id
	 * @return
	 */
	public SysRole findSysRoleById(Long id) {
		return sysRoleMapper.selectSysRoleById(id);
	}

	/**
	 * 分页查询角色管理,角色管理实体
	 * @param condition
	 * @param pager
	 */
	public void findSysRoleByPager(Map<String, Object> condition,Pager pager) {
		condition.put("start", pager.getOffset());
		condition.put("length", pager.getLength());
		List<SysRole> list=sysRoleMapper.selectSysRoleByPager(condition);
		int count=sysRoleMapper.selectSysRoleCountByPager(condition);
		pager.setData(list);
		pager.setRecordsTotal(count);
		pager.setRecordsFiltered(count);
	}

	/**
	 * 更新角色管理,角色管理实体
	 * @param sysRoleForm
	 */
	public void modifySysRole(SysRole sysRoleForm) {
		sysRoleMapper.updateSysRole(sysRoleForm);
	}

	/**
	 * 根据条件更新角色管理,角色管理实体
	 * @param condition
	 */
	public void modifySysRoleByCondition(Map<String, Object> condition) {
		sysRoleMapper.updateSysRoleByCondition(condition);
	}

	/**
	 * 新增角色管理,角色管理实体
	 * @param sysRoleForm
	 */
	public void addSysRole(SysRole sysRoleForm) {
		sysRoleMapper.insertSysRole(sysRoleForm);
	}

	/**
	 * 根据ids删除角色管理,角色管理实体
	 * @param ids
	 */
	public void removeSysRoleByIds(String ids) {
		sysRoleMapper.delSysRoleByIds(ids);
	}
	
	/**
	 * 根据条件查询角色管理,角色管理实体
	 * @param condition
	 * @return
	 */
	public List<SysRole> findSysRoleByCondition(Map<String, Object> condition) {
		return sysRoleMapper.selectSysRoleByCondition(condition);
	}
}