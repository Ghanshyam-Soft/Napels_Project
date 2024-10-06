package com.kpn.napels.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.kpn.napels.dto.ServiceNummerSearchDTO;
import com.kpn.napels.entity.NumServiceNummerEntity;


@Service
public class ServiceNumServiceImpl implements ServiceNumService{
	
	
	private static final Logger LOG = LoggerFactory.getLogger(ServiceNumServiceImpl.class);
	
	@Autowired
	final EntityManager em = null;

	@Override
	public Page<NumServiceNummerEntity> getServiceNumList(ServiceNummerSearchDTO servicenumSearch, Pageable page) {
		// TODO Auto-generated method stub
		Page<NumServiceNummerEntity> serviceNummerList = null;
		
		try {
			LOG.info("In Service -->" + servicenumSearch.toString());
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<NumServiceNummerEntity> cq = cb.createQuery(NumServiceNummerEntity.class);
			Root<NumServiceNummerEntity> root = cq.from(NumServiceNummerEntity.class);
			List<Predicate> predicates = new ArrayList<Predicate>();
			Predicate cond = null;
			
			if(null != servicenumSearch.getServiceNumLow()) {
				cond = cb.like(root.get("snrNumberLow"), servicenumSearch.getServiceNumLow().concat("%"));
				predicates.add(cond);
			}if(null != servicenumSearch.getServiceNumHigh()) {
				cond = cb.like(root.get("snrNumberHigh"), servicenumSearch.getServiceNumHigh().concat("%"));
				predicates.add(cond);
			}if(null != servicenumSearch.getMutatieVan()) {
				cond = cb.greaterThanOrEqualTo(cb.function("TO_CHAR", String.class, root.get("snrLaatsteMut")),servicenumSearch.getMutatieVan());
				predicates.add(cond);
			} if(null != servicenumSearch.getMutatieTm()) {
				cond = cb.lessThanOrEqualTo(cb.function("TO_CHAR", String.class, root.get("snrLaatsteMut")),servicenumSearch.getMutatieTm());
				predicates.add(cond);

			}
				

			 /*
				 * if(null != servicenumSearch.getBestemming()) { cond =
				 * cb.like(root.get("snrBestemmingId"),
				 * servicenumSearch.getBestemming().concat("%")); predicates.add(cond); }if(null
				 * != servicenumSearch.getMutatieVan()) { cond =
				 * cb.like(root.get("snrNumberHigh"),
				 * servicenumSearch.getMutatieVan().concat("%")); predicates.add(cond); }if(null
				 * != servicenumSearch.getGebruikerId()) { cond =
				 * cb.like(root.get("snrGebIdMut"),
				 * servicenumSearch.getGebruikerId().concat("%")); predicates.add(cond);
				 * }if(null != servicenumSearch.getOperatorId()) { cond =
				 * cb.like(root.get("fkNopInterneOpId"),
				 * servicenumSearch.getOperatorId().concat("%")); predicates.add(cond); }
				 */
			

			
			Predicate[] predArray = new Predicate[predicates.size()];
			predicates.toArray(predArray);
			cq.where(predArray);
			TypedQuery<NumServiceNummerEntity> query = em.createQuery(cq);

			query.setFirstResult(page.getPageNumber() * page.getPageSize());
			query.setMaxResults(page.getPageSize());
			
			serviceNummerList = new PageImpl<NumServiceNummerEntity>(query.getResultList(),page,200000);
			
			em.close();
			
			
		}catch (Exception e) {
			LOG.error("Exception occured  :"+ e.getMessage());
			e.printStackTrace();
			return serviceNummerList;
		
		}
		return serviceNummerList;


		}
	}



