package app.profesor;


import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import app.horario.Horario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "profesores")
public class Profesor {
	@Id
	public Long id;
	public String nombres;
	public String apellidoPaterno;
	public String apellidoMaterno;
	
	@OneToMany(mappedBy = "profesor")
	public Set<Horario> horarios;
	
	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime updatedAt = LocalDateTime.now();
}
