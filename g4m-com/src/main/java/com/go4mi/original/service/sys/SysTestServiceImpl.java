package com.go4mi.original.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.go4mi.original.entity.common.Pager;
import com.go4mi.original.entity.sys.SysTest;
import com.go4mi.original.mapper.sys.SysTestMapper;

/**
 * 测试,测试服务实现类
 * @author hsw
 *
 */
@Service
@Transactional
public class SysTestServiceImpl {

	/**测试,测试实体操作类**/
	@Autowired
	private	SysTestMapper sysTestMapper;

	/**
	 * 根据id查询测试,测试对象
	 * @param id
	 * @return
	 */
	public SysTest findSysTestById(Long id) {
		return sysTestMapper.selectSysTestById(id);
	}

	/**
	 * 分页查询测试,测试实体
	 * @param condition
	 * @param pager
	 */
	public void findSysTestByPager(Map<String, Object> condition,Pager pager) {
		condition.put("start", pager.getOffset());
		condition.put("length", pager.getLength());
		List<SysTest> list=sysTestMapper.selectSysTestByPager(condition);
		int count=sysTestMapper.selectSysTestCountByPager(condition);
		pager.setData(list);
		pager.setRecordsTotal(count);
		pager.setRecordsFiltered(count);
	}

	/**
	 * 更新测试,测试实体
	 * @param sysTestForm
	 */
	public void modifySysTest(SysTest sysTestForm) {
		sysTestMapper.updateSysTest(sysTestForm);
	}

	/**
	 * 根据条件更新测试,测试实体
	 * @param condition
	 */
	public void modifySysTestByCondition(Map<String, Object> condition) {
		sysTestMapper.updateSysTestByCondition(condition);
	}

	/**
	 * 新增测试,测试实体
	 * @param sysTestForm
	 */
	public void addSysTest(SysTest sysTestForm) {
		sysTestMapper.insertSysTest(sysTestForm);
	}

	/**
	 * 根据ids删除测试,测试实体
	 * @param ids
	 */
	public void removeSysTestByIds(String ids) {
		sysTestMapper.delSysTestByIds(ids);
	}
	
	/**
	 * 根据条件查询测试,测试实体
	 * @param condition
	 * @return
	 */
	public List<SysTest> findSysTestByCondition(Map<String, Object> condition) {
		return sysTestMapper.selectSysTestByCondition(condition);
	}
	
	/**
	 * 查询所有测试,测试实体
	 * @return
	 */
	public List<SysTest> findSysTestAll() {
		return sysTestMapper.selectSysTestAll();
	}
}