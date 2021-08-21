package app.actividad;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import app.enums.Categoria;
import app.horario.Horario;
import app.models.relationships.ActividadAlumno;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "actividades")
public class Actividad {
	@Id
	@SequenceGenerator(name = "actividad_sequence", sequenceName = "actividad_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actividad_sequence")
	public Long id;
	public String nombre;

	@Enumerated(EnumType.ORDINAL)
	public Categoria categoria;

	@OneToMany(mappedBy = "actividad")
	public Set<ActividadAlumno> expedientes;

	@OneToMany(mappedBy = "actividad")
	public Set<Horario> horarios;

	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime createdAt = LocalDateTime.now();

	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime updatedAt = LocalDateTime.now();
}
