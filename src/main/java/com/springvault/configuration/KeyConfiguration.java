package com.springvault.configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("config")
public class KeyConfiguration {

  private String privateKey;
  private String publicKey;

  public String getPrivateKey(){
      return  privateKey;
  }

  public  void setPrivateKey(String privateKey){
      this.privateKey = privateKey;
  }

  public String getPublicKey(){
      return publicKey;
  }

  public void setPublicKey(String publicKey){
      this.publicKey = publicKey;
  }

}
