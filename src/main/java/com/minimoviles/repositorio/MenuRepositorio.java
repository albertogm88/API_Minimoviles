package com.minimoviles.repositorio;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.minimoviles.entidades.BerryAppMenuItem;

import org.springframework.stereotype.Repository;


@Repository
public class MenuRepositorio extends AbstractRepository<BerryAppMenuItem, Integer> {

    public Iterable<BerryAppMenuItem> getMenuByIdWeb(int id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BerryAppMenuItem> q = cb.createQuery(BerryAppMenuItem.class);
        Root<BerryAppMenuItem> root = q.from(BerryAppMenuItem.class);
        q.select(root).where(cb.equal(root.get("idWeb"), id));
		return em.createQuery(q).getResultList();
    }
    
    public Iterable<BerryAppMenuItem> getMenuByIdMenu(int id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BerryAppMenuItem> q = cb.createQuery(BerryAppMenuItem.class);
        Root<BerryAppMenuItem> root = q.from(BerryAppMenuItem.class);
        q.select(root).where(cb.equal(root.get("idMenu"), id));
		return em.createQuery(q).getResultList();
	}


}
