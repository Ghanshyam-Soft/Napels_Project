package com.kpn.napels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kpn.napels.common.Utils;
import com.kpn.napels.repository.NumAangeslotenNumRepo;
import com.kpn.napels.service.NumberDetailServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NummerDetailsScreenTests extends NumbesApiSvcApplicationTests{
	
	
private static final Logger LOG = LoggerFactory.getLogger(NumbesApiSvcApplicationTests.class);
	
	@Autowired
	NumberDetailServiceImpl numberDetailServiceImpl;

	@Autowired
	NumAangeslotenNumRepo numAangeslotenNrRepo;
	
	@Test
	public void contextLoads() {
	}
	
	
	/*@Test
	public void searchByNumLowTestSuccess() {
		
		try {
			String numberLow="0773082000";
			boolean isOk=false;
			List<Object[]> numAangeslotenNrList=numAangeslotenNrRepo.getNumLaag(numberLow);
			
			if(!Utils.IsNullOrEmpty(numAangeslotenNrList)) {
				isOk=true;
				LOG.info("numAangeslotenNrList="+numAangeslotenNrList);
			}
			else {
				LOG.info("numAangeslotenNrList="+numAangeslotenNrList);
			}
			
			assertEquals(true, isOk);
			
		}catch(Exception e) {
		e.printStackTrace();
		}
	}	*/

	/*@Test
	public void searchByNumLowTest() {
		
		try {
			String numberLow="077";
			boolean isOk=false;
			List<Object[]> numAangeslotenNrList=numAangeslotenNrRepo.getNumLaag(numberLow);
		
			if(!Utils.IsNullOrEmpty(numAangeslotenNrList)) {
				isOk=true;
				LOG.info("numAangeslotenNrList="+numAangeslotenNrList);
			}
			else {
				LOG.info("numAangeslotenNrList="+numAangeslotenNrList);
			}
			
			assertNotEquals(true, isOk);
			
		}catch(Exception e) {
		e.printStackTrace();
		}
	
	}
	*/

}
