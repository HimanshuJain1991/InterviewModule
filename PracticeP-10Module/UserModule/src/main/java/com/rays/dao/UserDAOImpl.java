package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl extends BaseDAOImpl<UserDTO> implements UserDAOInt {

	@Override
	public Class<UserDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return UserDTO.class;
	}

	@Autowired
	public RoleDAOInt roleDao;
	
	@Override
	public void populate(UserDTO dto) {
		if(dto.getRoleId()!=null && dto.getRoleId()>0) {
		RoleDTO roleDTO=roleDao.findByPk(dto.getRoleId());
		dto.setRoleName(roleDTO.getName());
		}
		
		if(dto.getId()!=null && dto.getId()>0) {
			UserDTO userData=findByPk(dto.getId());
			dto.setImageId(userData.getImageId());
		}

	}

	@Override
	public List<Predicate> getWhereClause(UserDTO dto, CriteriaBuilder builder, Root<UserDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getFirstName())) {
			whereCondition.add(builder.like(qRoot.get("firstName"), dto.getFirstName() + "%"));
		}

		return whereCondition;
	}

	@Override
	public UserDTO findByUniqueKey(String attribute, String value) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();

		CriteriaQuery<UserDTO> cq = builder.createQuery(UserDTO.class);

		Root<UserDTO> qRoot = cq.from(UserDTO.class);

		Predicate condition = builder.equal(qRoot.get(attribute), value);

		cq.where(condition);

		TypedQuery<UserDTO> tq = entityManager.createQuery(cq);

		List<UserDTO> list = tq.getResultList();

		UserDTO dto = null;

		if (list.size() > 0) {

			dto = list.get(0);

		}

		return dto;

	}

}
