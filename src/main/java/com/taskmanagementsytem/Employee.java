package com.taskmanagementsytem;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
/*

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employees")
*/
@AllArgsConstructor

public class Employee {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  */  private long id;

   // @Column(name = "first_name", nullable = false)
    private String firstName;

   // @Column(name = "last_name")
    private String lastName;
    private String email;

}
