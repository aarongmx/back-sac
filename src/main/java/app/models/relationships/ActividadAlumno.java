package app.models.relationships;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import app.actividad.Actividad;
import app.alumno.Alumno;
import app.composites.ActividadAlumnoKey;
import app.enums.Periodo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ActividadAlumno {
	@EmbeddedId
	public ActividadAlumnoKey id;
	
	@ManyToOne
	@MapsId("alumnoId")
	@JoinColumn(name = "alumno_id", nullable = false)
	public Alumno alumno;
	
	@ManyToOne
	@MapsId("actividadId")
	@JoinColumn(name="actividad_id", nullable = false)
	public Actividad actividad;
	
	@Enumerated(EnumType.ORDINAL)
	public Periodo periodo;
	
	public Integer calificacion;
	public String noOficio;
	public Boolean finalizada;
	public LocalDateTime fechaConclusion;
}
