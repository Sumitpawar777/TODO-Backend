package com.javabrains.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
   /* {
        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzdW1pdCIsImV4cCI6MTU5MDMzMzc2NSwiaWF0IjoxNTg5NzI4OTY1fQ.PcIZ_b4cd7t1f3ETlnaT9QVIhxHf1T3ZTzJEhlPRsV8uPHAMW0M7C7xG1MJH-cJPlpkaPByM-hBcY91AiFCVHQ"
    }*/

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

