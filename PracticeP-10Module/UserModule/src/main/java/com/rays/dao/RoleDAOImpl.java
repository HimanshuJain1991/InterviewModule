package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RoleDTO;

@Repository
public class RoleDAOImpl extends BaseDAOImpl<RoleDTO> implements RoleDAOInt {

	@Override
	public Class<RoleDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return RoleDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(RoleDTO dto, CriteriaBuilder builder, Root<RoleDTO> qRoot) {
		List<Predicate> whereCondition=new ArrayList<Predicate>();
		return whereCondition;
	}

}
