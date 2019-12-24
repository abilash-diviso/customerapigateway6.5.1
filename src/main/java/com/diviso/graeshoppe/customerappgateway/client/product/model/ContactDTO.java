package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class ContactDTO   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("facebook")
  private String facebook = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("mobile")
  private Long mobile = null;

  @JsonProperty("saluation")
  private String saluation = null;

  @JsonProperty("telephone")
  private Long telephone = null;

  @JsonProperty("twitter")
  private String twitter = null;

  @JsonProperty("websiteURL")
  private String websiteURL = null;

  public ContactDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactDTO facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

  /**
   * Get facebook
   * @return facebook
  **/
  @ApiModelProperty(value = "")


  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public ContactDTO fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public ContactDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContactDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactDTO mobile(Long mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(value = "")


  public Long getMobile() {
    return mobile;
  }

  public void setMobile(Long mobile) {
    this.mobile = mobile;
  }

  public ContactDTO saluation(String saluation) {
    this.saluation = saluation;
    return this;
  }

  /**
   * Get saluation
   * @return saluation
  **/
  @ApiModelProperty(value = "")


  public String getSaluation() {
    return saluation;
  }

  public void setSaluation(String saluation) {
    this.saluation = saluation;
  }

  public ContactDTO telephone(Long telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")


  public Long getTelephone() {
    return telephone;
  }

  public void setTelephone(Long telephone) {
    this.telephone = telephone;
  }

  public ContactDTO twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  /**
   * Get twitter
   * @return twitter
  **/
  @ApiModelProperty(value = "")


  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public ContactDTO websiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
    return this;
  }

  /**
   * Get websiteURL
   * @return websiteURL
  **/
  @ApiModelProperty(value = "")


  public String getWebsiteURL() {
    return websiteURL;
  }

  public void setWebsiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDTO contactDTO = (ContactDTO) o;
    return Objects.equals(this.email, contactDTO.email) &&
        Objects.equals(this.facebook, contactDTO.facebook) &&
        Objects.equals(this.fax, contactDTO.fax) &&
        Objects.equals(this.firstName, contactDTO.firstName) &&
        Objects.equals(this.id, contactDTO.id) &&
        Objects.equals(this.lastName, contactDTO.lastName) &&
        Objects.equals(this.mobile, contactDTO.mobile) &&
        Objects.equals(this.saluation, contactDTO.saluation) &&
        Objects.equals(this.telephone, contactDTO.telephone) &&
        Objects.equals(this.twitter, contactDTO.twitter) &&
        Objects.equals(this.websiteURL, contactDTO.websiteURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, facebook, fax, firstName, id, lastName, mobile, saluation, telephone, twitter, websiteURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDTO {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    saluation: ").append(toIndentedString(saluation)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    websiteURL: ").append(toIndentedString(websiteURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

