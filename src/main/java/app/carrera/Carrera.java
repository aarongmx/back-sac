package app.carrera;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import app.alumno.Alumno;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "alumnos" })
@Table(name = "carreras")
public class Carrera {
	@Id
	@SequenceGenerator(name = "carrera_sequence", sequenceName = "carrera_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carrera_sequence")
	public Long id;
	public String clave;
	public String nombre;

	@OneToMany(mappedBy = "carrera")
	public Set<Alumno> alumnos;

	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime createdAt = LocalDateTime.now();

	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime updatedAt = LocalDateTime.now();
}
