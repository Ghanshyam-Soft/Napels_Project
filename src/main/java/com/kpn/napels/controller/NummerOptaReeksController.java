package com.kpn.napels.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kpn.napels.entity.NumOptaReeksEntity;


@RestController
@RequestMapping("/napels-numbes/optareeks")
public class NummerOptaReeksController {

	@Autowired
	final EntityManager em = null;
	
	@RequestMapping("/zoeken")
	public ResponseEntity<Page<NumOptaReeksEntity>> getOptaReeksList(
			@PageableDefault(size = 50) Pageable page
			){
		
		Page<NumOptaReeksEntity> optaReeksList = null;
		try {
			List<String> queryParam = new ArrayList<String>();
			Map<String, String> map = new HashMap<String, String>();
			
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<NumOptaReeksEntity> cq = cb.createQuery(NumOptaReeksEntity.class);
			Root<NumOptaReeksEntity> root = cq.from(NumOptaReeksEntity.class);
			List<Predicate> predicates = new ArrayList<Predicate>();
			
			Predicate cond = null;
			
			Predicate[] predArray = new Predicate[predicates.size()];
			predicates.toArray(predArray);
			cq.where(predArray);
			TypedQuery<NumOptaReeksEntity> query = em.createQuery(cq);
			query.setFirstResult(page.getPageNumber() * page.getPageSize());
			query.setMaxResults(page.getPageSize());
			
			optaReeksList = new PageImpl<NumOptaReeksEntity>(query.getResultList(),page,50);
			
			em.close();
			
			return new ResponseEntity<Page<NumOptaReeksEntity>>(optaReeksList, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Page<NumOptaReeksEntity>>(optaReeksList, HttpStatus.NOT_FOUND);
		}
		
	}
	
}
