package cn.hnzj.mapper;

import cn.hnzj.pojo.Concept;

public interface ConceptMapper {
	/**
	 * Title: findNumberById Description: 通过id查找概念
	 */
	public Concept findConceptById(int id);

	/**
	 * Title: findNumberById Description: 通过名称找概念
	 */
	public Concept findConceptByName(String name);

}
