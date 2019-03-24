package com.go4mi.original.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.go4mi.original.entity.common.Pager;
import com.go4mi.original.entity.sys.SysDic;
import com.go4mi.original.mapper.sys.SysDicMapper;

/**
 * 数据字典,数据字典表服务实现类
 * @author hsw
 *
 */
@Service
@Transactional
public class SysDicServiceImpl {

	/**数据字典,数据字典表实体操作类**/
	@Autowired
	private	SysDicMapper sysDicMapper;

	/**
	 * 根据id查询数据字典,数据字典表对象
	 * @param id
	 * @return
	 */
	public SysDic findSysDicById(Long id) {
		return sysDicMapper.selectSysDicById(id);
	}

	/**
	 * 分页查询数据字典,数据字典表实体
	 * @param condition
	 * @param pager
	 */
	public void findSysDicByPager(Map<String, Object> condition,Pager pager) {
		condition.put("start", pager.getOffset());
		condition.put("length", pager.getLength());
		List<SysDic> list=sysDicMapper.selectSysDicByPager(condition);
		int count=sysDicMapper.selectSysDicCountByPager(condition);
		pager.setData(list);
		pager.setRecordsTotal(count);
		pager.setRecordsFiltered(count);
	}

	/**
	 * 更新数据字典,数据字典表实体
	 * @param sysDicForm
	 */
	public void modifySysDic(SysDic sysDicForm) {
		sysDicMapper.updateSysDic(sysDicForm);
	}

	/**
	 * 根据条件更新数据字典,数据字典表实体
	 * @param condition
	 */
	public void modifySysDicByCondition(Map<String, Object> condition) {
		sysDicMapper.updateSysDicByCondition(condition);
	}

	/**
	 * 新增数据字典,数据字典表实体
	 * @param sysDicForm
	 */
	public void addSysDic(SysDic sysDicForm) {
		sysDicMapper.insertSysDic(sysDicForm);
	}

	/**
	 * 根据ids删除数据字典,数据字典表实体
	 * @param ids
	 */
	public void removeSysDicByIds(String ids) {
		sysDicMapper.delSysDicByIds(ids);
	}
	
	/**
	 * 根据条件查询数据字典,数据字典表实体
	 * @param condition
	 * @return
	 */
	public List<SysDic> findSysDicByCondition(Map<String, Object> condition) {
		return sysDicMapper.selectSysDicByCondition(condition);
	}
	
	/**
	 * 查询所有数据字典,数据字典表实体
	 * @return
	 */
	public List<SysDic> findSysDicAll() {
		return sysDicMapper.selectSysDicAll();
	}
}