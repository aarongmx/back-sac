package app.alumno;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import app.carrera.Carrera;
import app.models.relationships.ActividadAlumno;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "alumnos")
public class Alumno {
	@Id
	@SequenceGenerator(name = "alumno_sequence", sequenceName = "alumno_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_sequence")
	public Long id;

	@Column(name = "no_control")
	@JsonProperty(value = "no_control")
	public String noControl;
	
	public String nombres;
	
	@Column(name = "apellido_paterno")
	public String apellidoPaterno;
	
	@Column(name = "apellido_materno")
	public String apellidoMaterno;

	@ManyToOne
	@JoinColumn(name = "carrera_id")
	public Carrera carrera;

	@OneToMany(mappedBy = "alumno")
	public Set<ActividadAlumno> expedientes;

	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime createdAt = LocalDateTime.now();

	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime updatedAt = LocalDateTime.now();
}
