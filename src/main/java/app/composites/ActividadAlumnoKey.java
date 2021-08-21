package app.composites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class ActividadAlumnoKey implements Serializable {
	@Column(name = "actividad_id")
	public Long actividadId;
	
	@Column(name="alumno_id")
	public Long alumnoId;
}
