package com.infoage.repository;

import java.util.List;

public interface GenericRepository<T> {
	
	public T findOne(long id);

	public List<T> findAll();

	public T save(T entity);

	public T update(T entity);

	public void delete(T entity);

	public void deleteById(long id);

	public Integer countAll();

}
