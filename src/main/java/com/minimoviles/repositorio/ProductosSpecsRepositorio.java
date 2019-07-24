package com.minimoviles.repositorio;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.minimoviles.entidades.AppProductsSpec;

@Repository
public class ProductosSpecsRepositorio extends AbstractRepository<AppProductsSpec, Integer> {
	
	public List<AppProductsSpec> getProductosByIdProducto(int idProduct){
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<AppProductsSpec> q = cb.createQuery(AppProductsSpec.class);
		Root<AppProductsSpec> c = q.from(AppProductsSpec.class);
		q.select(c).where(cb.equal(c.get("idProduct"), idProduct));
		
		return em.createQuery(q).getResultList();
	}

}
