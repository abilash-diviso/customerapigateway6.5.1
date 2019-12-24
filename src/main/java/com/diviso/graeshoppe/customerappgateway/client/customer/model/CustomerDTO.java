package com.diviso.graeshoppe.customerappgateway.client.customer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:26:27.966+05:30[Asia/Kolkata]")

public class CustomerDTO   {
  @JsonProperty("contactId")
  private Long contactId = null;

  @JsonProperty("customerUniqueId")
  private String customerUniqueId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("idpCode")
  private String idpCode = null;

  @JsonProperty("idpSub")
  private String idpSub = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("imageLink")
  private String imageLink = null;

  @JsonProperty("name")
  private String name = null;

  public CustomerDTO contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(value = "")


  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public CustomerDTO customerUniqueId(String customerUniqueId) {
    this.customerUniqueId = customerUniqueId;
    return this;
  }


  public String getCustomerUniqueId() {
    return customerUniqueId;
  }

  public void setCustomerUniqueId(String customerUniqueId) {
    this.customerUniqueId = customerUniqueId;
  }

  public CustomerDTO id(Long id) {
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

  public CustomerDTO idpCode(String idpCode) {
    this.idpCode = idpCode;
    return this;
  }


  public String getIdpCode() {
    return idpCode;
  }

  public void setIdpCode(String idpCode) {
    this.idpCode = idpCode;
  }

  public CustomerDTO idpSub(String idpSub) {
    this.idpSub = idpSub;
    return this;
  }

  /**
   * Get idpSub
   * @return idpSub
  **/
  @ApiModelProperty(value = "")


  public String getIdpSub() {
    return idpSub;
  }

  public void setIdpSub(String idpSub) {
    this.idpSub = idpSub;
  }

  public CustomerDTO image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

//@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public CustomerDTO imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public CustomerDTO imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }



  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public CustomerDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDTO customerDTO = (CustomerDTO) o;
    return Objects.equals(this.contactId, customerDTO.contactId) &&
        Objects.equals(this.customerUniqueId, customerDTO.customerUniqueId) &&
        Objects.equals(this.id, customerDTO.id) &&
        Objects.equals(this.idpCode, customerDTO.idpCode) &&
        Objects.equals(this.idpSub, customerDTO.idpSub) &&
        Objects.equals(this.image, customerDTO.image) &&
        Objects.equals(this.imageContentType, customerDTO.imageContentType) &&
        Objects.equals(this.imageLink, customerDTO.imageLink) &&
        Objects.equals(this.name, customerDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, customerUniqueId, id, idpCode, idpSub, image, imageContentType, imageLink, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDTO {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    customerUniqueId: ").append(toIndentedString(customerUniqueId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idpCode: ").append(toIndentedString(idpCode)).append("\n");
    sb.append("    idpSub: ").append(toIndentedString(idpSub)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

