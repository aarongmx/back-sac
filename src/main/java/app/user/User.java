package app.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import app.rol.Rol;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {
	
	@Id
	@SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
	public Long id;
	public String email;
	public String password;
	
	@ManyToOne
	@JoinColumn(name = "rol_id")
	public Rol rol;
	
	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(columnDefinition = "timestamp default now()")
	public LocalDateTime updatedAt = LocalDateTime.now();
}
