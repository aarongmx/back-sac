package app.rol;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import app.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "roles")
public class Rol {
	@Id
	public Long id;
	public String nombre;
	
	@OneToMany(mappedBy = "rol")
	public Set<User> users;
}
