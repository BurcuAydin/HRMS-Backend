package kodlamaio.hrmsnet.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@NotBlank(message="Bu alan boş bırakılamaz.")
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank(message="Bu alan boş bırakılamaz.")
	@Column(name="web_address")
	private String webAddress;
}
