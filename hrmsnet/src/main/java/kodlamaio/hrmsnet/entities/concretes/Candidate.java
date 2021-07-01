package kodlamaio.hrmsnet.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import kodlamaio.hrmsnet.entities.concretes.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidates")
@EqualsAndHashCode(callSuper = false)
public class Candidate extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank(message = "National identity cannot be empty.")
	@Size(min = 11, max = 11, message = "National identity length must be 11.")
	@Pattern(regexp = "^[1-9][0-9]{9}[02468]$", message = "National identity can't start with 0 or contain text.")
	@Column(name="identity_number")
	private String identityNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Date birthDate;

	}
