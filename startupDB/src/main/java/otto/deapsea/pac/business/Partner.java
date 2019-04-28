package otto.deapsea.pac.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "partner", schema = "public")
public class Partner {

		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long partnerId;
	    private String firstName;
	    private String lastName;

	    public Partner() {}

	    public Partner(Long partnerId, String firstName, String lastName) {
	    	this.partnerId = partnerId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    @Override
	    public String toString() {
	        return "Partner{ id=" + partnerId + ", name=" + firstName + ", lastname=" + lastName + '}';
	    }

}
