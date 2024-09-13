package com.rays.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public abstract class BaseDAOImpl<T extends BaseDTO> implements BaseDAOInt<T> {
	@PersistenceContext
	public EntityManager entityManager;

	public abstract Class<T> getDTOClass();

	public abstract List<Predicate> getWhereClause(T dto, CriteriaBuilder builder, Root<T> qRoot);

	public void populate(T dto) {

	}

	protected boolean isEmptyString(String val) {
		return val == null || val.trim().length() == 0;
	}

	protected boolean isZeroNumber(Long val) {
		return val == null || val == 0;
	}

	@Override
	public long add(T dto) {
		populate(dto);
		entityManager.persist(dto);
		return dto.getId();
	}

	@Override
	public void update(T dto) {
		populate(dto);
		entityManager.merge(dto);

	}

	@Override
	public void delete(T dto) {
		entityManager.remove(dto);

	}

	@Override
	public T findByPk(Long pk) {
		T dto = entityManager.find(getDTOClass(), pk);
		return dto;
	}

	@Override
	public List search(T dto, int pageNo, int pageSize) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = builder.createQuery(getDTOClass());
		Root<T> qRoot = cq.from(getDTOClass());
		List<Predicate> whereClause = getWhereClause(dto, builder, qRoot);
		cq.where(whereClause.toArray(new Predicate[whereClause.size()]));
		TypedQuery<T> query = entityManager.createQuery(cq);
		if (pageNo > 0) {
			query.setFirstResult(pageNo * pageSize);
			query.setMaxResults(pageSize);
		}

		List<T> list = query.getResultList();
		return list;
	}

}
