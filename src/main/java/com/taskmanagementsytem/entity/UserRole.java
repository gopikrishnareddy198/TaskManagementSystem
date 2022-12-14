package com.taskmanagementsytem.entity;

import org.springframework.security.core.GrantedAuthority;

public class UserRole implements GrantedAuthority {

   private Role role;


   public UserRole() {

   }

   public UserRole(Role role) {
      this.role = role;
   }

   public Role getRole() {
      return role;
   }

   public void setRole(Role role) {
      this.role = role;
   }

   @Override
   public String getAuthority() {
      return role.getName();
   }
}
