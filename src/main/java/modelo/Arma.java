package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="armas")
@Data
@AllArgsConstructor
public class Arma {
	
	@Id
	private String id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_personaje")
	private Personaje personaje;


}
