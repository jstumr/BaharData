package otto.deapsea.pac.adapter;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import otto.deapsea.pac.business.IPartner;
import otto.deapsea.pac.business.Partner;

@RestController
public class PartnerController {

		@Autowired
	     IPartner partnerService;
	 
	   //@RequestMapping(value = "/all", method = RequestMethod.GET)
	     
		@GetMapping("/partners")
	     public List<Partner> findAllPartners() {
			List<Partner> partners =  partnerService.findAll();
	        return partners;
	     }
		
		@GetMapping("/partnernames")
	     public String findPartnerNames() {
			List<Partner> partnernames =  partnerService.findAll();
			return Arrays.deepToString(partnernames.toArray());
	     }
	
}
