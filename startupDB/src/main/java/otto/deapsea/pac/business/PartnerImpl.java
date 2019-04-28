package otto.deapsea.pac.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerImpl implements IPartner{

	@Autowired
    private PartnerRepository repository;

   @Override
    public List<Partner> findAll() {

	   List<Partner> partners =  (List<Partner>) repository.findAll();
	   return partners;
    }
}
