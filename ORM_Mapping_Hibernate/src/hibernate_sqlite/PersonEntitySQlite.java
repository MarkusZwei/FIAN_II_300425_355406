package hibernate_sqlite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class PersonEntitySQlite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String vorname;

	private String nachname;

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

	public PersonEntitySQlite() {

	}

	@Override
	public String toString() {
		return "PersonEntitySQlite [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + "]";
	}


}
