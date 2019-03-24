package com.go4mi.original.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.go4mi.original.entity.common.Pager;
import com.go4mi.original.entity.sys.SysMenu;
import com.go4mi.original.mapper.sys.SysMenuMapper;

/**
 * 服务实现类
 * @author hsw
 *
 */
@Service
@Transactional
public class SysMenuServiceImpl {

	/**实体操作类**/
	@Autowired
	private	SysMenuMapper sysMenuMapper;

	/**
	 * 根据id查询对象
	 * @param id
	 * @return
	 */
	public SysMenu findSysMenuById(Long id) {
		return sysMenuMapper.selectSysMenuById(id);
	}

	/**
	 * 分页查询实体
	 * @param condition
	 * @param pager
	 */
	public void findSysMenuByPager(Map<String, Object> condition,Pager pager) {
		condition.put("start", pager.getOffset());
		condition.put("length", pager.getLength());
		List<SysMenu> list=sysMenuMapper.selectSysMenuByPager(condition);
		int count=sysMenuMapper.selectSysMenuCountByPager(condition);
		pager.setData(list);
		pager.setRecordsTotal(count);
		pager.setRecordsFiltered(count);
	}

	/**
	 * 更新实体
	 * @param sysMenuForm
	 */
	public void modifySysMenu(SysMenu sysMenuForm) {
		sysMenuMapper.updateSysMenu(sysMenuForm);
	}

	/**
	 * 根据条件更新实体
	 * @param condition
	 */
	public void modifySysMenuByCondition(Map<String, Object> condition) {
		sysMenuMapper.updateSysMenuByCondition(condition);
	}

	/**
	 * 新增实体
	 * @param sysMenuForm
	 */
	public void addSysMenu(SysMenu sysMenuForm) {
		sysMenuMapper.insertSysMenu(sysMenuForm);
	}

	/**
	 * 根据ids删除实体
	 * @param ids
	 */
	public void removeSysMenuByIds(String ids) {
		sysMenuMapper.delSysMenuByIds(ids);
	}
	
	/**
	 * 根据条件查询实体
	 * @param condition
	 * @return
	 */
	public List<SysMenu> findSysMenuByCondition(Map<String, Object> condition) {
		return sysMenuMapper.selectSysMenuByCondition(condition);
	}
}