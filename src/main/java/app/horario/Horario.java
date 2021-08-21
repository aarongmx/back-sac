package app.horario;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import app.actividad.Actividad;
import app.enums.Dia;
import app.profesor.Profesor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "horarios")
public class Horario {
	@Id
	public Long id;
	
	@Enumerated(EnumType.ORDINAL)
	public Dia dia;
	
	public LocalTime horaInicio;
	public LocalTime horaTermino;
	
	@ManyToOne
	@JoinColumn(name = "actividad_id")
	public Actividad actividad;
	
	@ManyToOne
	@JoinColumn(name = "profesor_id")
	public Profesor profesor;
	
	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime updatedAt = LocalDateTime.now();
}
