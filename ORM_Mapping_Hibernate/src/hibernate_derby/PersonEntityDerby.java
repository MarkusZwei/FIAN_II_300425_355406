package hibernate_derby;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="personen")
public class PersonEntityDerby {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	private String vorname;

	private String nachname;

	private int geburtsjahr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public PersonEntityDerby() {

	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + ", geburtsjahr="
				+ geburtsjahr + "]";
	}


}
