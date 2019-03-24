package com.go4mi.original.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.go4mi.original.entity.common.Pager;
import com.go4mi.original.mapper.sys.SysUserMapper;
import com.go4mi.original.entity.sys.SysUser;

/**
 * 服务实现类
 * @author hsw
 *
 */
@Service
@Transactional
public class SysUserServiceImpl {

	/**实体操作类**/
	@Autowired
	private	SysUserMapper sysUserMapper;

	/**
	 * 根据id查询对象
	 * @param id
	 * @return
	 */
	public SysUser findSysUserById(Long id) {
		return sysUserMapper.selectSysUserById(id);
	}

	/**
	 * 分页查询实体
	 * @param condition
	 * @param pager
	 */
	public void findSysUserByPager(Map<String, Object> condition,Pager pager) {
		condition.put("start", pager.getOffset());
		condition.put("length", pager.getLength());
		List<SysUser> list=sysUserMapper.selectSysUserByPager(condition);
		int count=sysUserMapper.selectSysUserCountByPager(condition);
		pager.setData(list);
		pager.setRecordsTotal(count);
		pager.setRecordsFiltered(count);
	}

	/**
	 * 更新实体
	 * @param sysUserForm
	 */
	public void modifySysUser(SysUser sysUserForm) {
		sysUserMapper.updateSysUser(sysUserForm);
	}

	/**
	 * 根据条件更新实体
	 * @param condition
	 */
	public void modifySysUserByCondition(Map<String, Object> condition) {
		sysUserMapper.updateSysUserByCondition(condition);
	}

	/**
	 * 新增实体
	 * @param sysUserForm
	 */
	public void addSysUser(SysUser sysUserForm) {
		sysUserMapper.insertSysUser(sysUserForm);
	}

	/**
	 * 根据ids删除实体
	 * @param ids
	 */
	public void removeSysUserByIds(String ids) {
		sysUserMapper.delSysUserByIds(ids);
	}
	
	/**
	 * 根据条件查询实体
	 * @param condition
	 * @return
	 */
	public List<SysUser> findSysUserByCondition(Map<String, Object> condition) {
		return sysUserMapper.selectSysUserByCondition(condition);
	}
}