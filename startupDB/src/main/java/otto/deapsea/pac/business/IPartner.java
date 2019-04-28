package otto.deapsea.pac.business;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IPartner {
	public List<Partner> findAll();
}
