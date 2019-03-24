package com.go4mi.original.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.go4mi.original.entity.common.Pager;
import com.go4mi.original.entity.sys.SysDicitem;
import com.go4mi.original.mapper.sys.SysDicitemMapper;

/**
 * 数据字典项,数据字典项服务实现类
 * @author hsw
 *
 */
@Service
@Transactional
public class SysDicitemServiceImpl {

	/**数据字典项,数据字典项实体操作类**/
	@Autowired
	private	SysDicitemMapper sysDicitemMapper;

	/**
	 * 根据id查询数据字典项,数据字典项对象
	 * @param id
	 * @return
	 */
	public SysDicitem findSysDicitemById(Long id) {
		return sysDicitemMapper.selectSysDicitemById(id);
	}

	/**
	 * 分页查询数据字典项,数据字典项实体
	 * @param condition
	 * @param pager
	 */
	public void findSysDicitemByPager(Map<String, Object> condition,Pager pager) {
		condition.put("start", pager.getOffset());
		condition.put("length", pager.getLength());
		List<SysDicitem> list=sysDicitemMapper.selectSysDicitemByPager(condition);
		int count=sysDicitemMapper.selectSysDicitemCountByPager(condition);
		pager.setData(list);
		pager.setRecordsTotal(count);
		pager.setRecordsFiltered(count);
	}

	/**
	 * 更新数据字典项,数据字典项实体
	 * @param sysDicitemForm
	 */
	public void modifySysDicitem(SysDicitem sysDicitemForm) {
		sysDicitemMapper.updateSysDicitem(sysDicitemForm);
	}

	/**
	 * 根据条件更新数据字典项,数据字典项实体
	 * @param condition
	 */
	public void modifySysDicitemByCondition(Map<String, Object> condition) {
		sysDicitemMapper.updateSysDicitemByCondition(condition);
	}

	/**
	 * 新增数据字典项,数据字典项实体
	 * @param sysDicitemForm
	 */
	public void addSysDicitem(SysDicitem sysDicitemForm) {
		sysDicitemMapper.insertSysDicitem(sysDicitemForm);
	}

	/**
	 * 根据ids删除数据字典项,数据字典项实体
	 * @param ids
	 */
	public void removeSysDicitemByIds(String ids) {
		sysDicitemMapper.delSysDicitemByIds(ids);
	}
	
	/**
	 * 根据条件查询数据字典项,数据字典项实体
	 * @param condition
	 * @return
	 */
	public List<SysDicitem> findSysDicitemByCondition(Map<String, Object> condition) {
		return sysDicitemMapper.selectSysDicitemByCondition(condition);
	}
	
	/**
	 * 查询所有数据字典项,数据字典项实体
	 * @return
	 */
	public List<SysDicitem> findSysDicitemAll() {
		return sysDicitemMapper.selectSysDicitemAll();
	}
}