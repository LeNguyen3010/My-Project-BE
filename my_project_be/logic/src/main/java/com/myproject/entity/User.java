package com.myproject.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_table_user")
public class User extends AuditableEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date birthday;
  private String image;
  private String email;
  private String username;
  private String phone;

  @Column(name = "first_name", length = 255)
  private String firstName;

  @Column(name = "last_name", length = 255)
  private String lastName;

  private String password;

}
