package kodlamaio.hrmsnet.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	 @Column(name="id")	
	 private int id;
	
	@NotBlank(message="Mail alanı boş bırakılamaz.")
	@Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$", message = "Lütfen geçerli bir e-posta adresi giriniz.")
	@Email(message = "Lütfen geçerli bir e-posta adresi giriniz.")
	@Size(min=6, max=16, message="Şifre en az 6, en fazla 16 karakterden oluşabilir")
	@Column(name="email")	
	private String email;
	 
	
	
	 @Column(name="password")	
	private String password;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name="created_date")
	 private Date createdDate;
	 
	 @Column(name="is_active")
	 private boolean isActive;
}
