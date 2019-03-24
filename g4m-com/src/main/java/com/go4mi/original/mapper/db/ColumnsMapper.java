package com.go4mi.original.mapper.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.go4mi.original.entity.db.Columns;

/**
 * 数据字典项,数据字典项数据库接口类
 * 
 * @author hsw
 *
 */
@Mapper
public interface ColumnsMapper {
	/**
	 * 根据id查询数据字典项,数据字典项实体
	 * 
	 * @param id
	 * @return
	 */
	public List<Columns> selectColumnsByName(String name);

}
