package org.example.models;

import java.util.Objects;

public class AppUser {

   private int id;
   private String username;
   private String password;

   public AppUser(int id, String username, String password) {
      this.id = id;
      setUsername(username);
      setPassword(password);
   }

   public int getId() {
      return id;
   }

   public String getUsername() {
      return username;
   }

   public String getPassword() {
      return password;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      AppUser appUser = (AppUser) o;
      return id == appUser.id && Objects.equals(username, appUser.username) && Objects.equals(password, appUser.password);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, username, password);
   }
}

