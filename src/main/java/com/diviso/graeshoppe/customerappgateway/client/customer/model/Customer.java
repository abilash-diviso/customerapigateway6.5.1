package com.diviso.graeshoppe.customerappgateway.client.customer.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.Contact;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteStore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
/*@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:26:27.966+05:30[Asia/Kolkata]")
*/
public class Customer   {
  //@JsonProperty("contact")
  private Contact contact = null;

  //@JsonProperty("customerUniqueId")
  private String customerUniqueId = null;

  //  @JsonProperty("favouriteproducts")
  // @Valid
  private List<FavouriteProduct> favouriteproducts = null;

  //  @JsonProperty("favouritestores")
  // @Valid
  private List<FavouriteStore> favouritestores = null;

  // @JsonProperty("id")
  private Long id = null;

  // @JsonProperty("idpCode")
  private String idpCode = null;

  // @JsonProperty("idpSub")
  private String idpSub = null;

  // @JsonProperty("image")
  private byte[] image = null;

  //@JsonProperty("imageContentType")
  private String imageContentType = null;

  // @JsonProperty("imageLink")
  private String imageLink = null;

  // @JsonProperty("name")
  private String name = null;

  public Customer contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  **/
  // @ApiModelProperty(value = "")

  // @Valid

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Customer customerUniqueId(String customerUniqueId) {
    this.customerUniqueId = customerUniqueId;
    return this;
  }

  /**
   * Get customerUniqueId
   * @return customerUniqueId
  **/
  // @ApiModelProperty(required = true, value = "")
  // @NotNull


  public String getCustomerUniqueId() {
    return customerUniqueId;
  }

  public void setCustomerUniqueId(String customerUniqueId) {
    this.customerUniqueId = customerUniqueId;
  }

  public Customer favouriteproducts(List<FavouriteProduct> favouriteproducts) {
    this.favouriteproducts = favouriteproducts;
    return this;
  }

  public Customer addFavouriteproductsItem(FavouriteProduct favouriteproductsItem) {
    if (this.favouriteproducts == null) {
      this.favouriteproducts = new ArrayList<FavouriteProduct>();
    }
    this.favouriteproducts.add(favouriteproductsItem);
    return this;
  }

  /**
   * Get favouriteproducts
   * @return favouriteproducts
  **/
  // @ApiModelProperty(value = "")

  //  @Valid

  public List<FavouriteProduct> getFavouriteproducts() {
    return favouriteproducts;
  }

  public void setFavouriteproducts(List<FavouriteProduct> favouriteproducts) {
    this.favouriteproducts = favouriteproducts;
  }

  public Customer favouritestores(List<FavouriteStore> favouritestores) {
    this.favouritestores = favouritestores;
    return this;
  }

  public Customer addFavouritestoresItem(FavouriteStore favouritestoresItem) {
    if (this.favouritestores == null) {
      this.favouritestores = new ArrayList<FavouriteStore>();
    }
    this.favouritestores.add(favouritestoresItem);
    return this;
  }

  /**
   * Get favouritestores
   * @return favouritestores
  **/
  //  @ApiModelProperty(value = "")

  // @Valid

  public List<FavouriteStore> getFavouritestores() {
    return favouritestores;
  }

  public void setFavouritestores(List<FavouriteStore> favouritestores) {
    this.favouritestores = favouritestores;
  }

  public Customer id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  //@ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Customer idpCode(String idpCode) {
    this.idpCode = idpCode;
    return this;
  }

  /**
   * Get idpCode
   * @return idpCode
  **/
  // @ApiModelProperty(required = true, value = "")
  // @NotNull


  public String getIdpCode() {
    return idpCode;
  }

  public void setIdpCode(String idpCode) {
    this.idpCode = idpCode;
  }

  public Customer idpSub(String idpSub) {
    this.idpSub = idpSub;
    return this;
  }

  /**
   * Get idpSub
   * @return idpSub
  **/
  //@ApiModelProperty(value = "")


  public String getIdpSub() {
    return idpSub;
  }

  public void setIdpSub(String idpSub) {
    this.idpSub = idpSub;
  }

  public Customer image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  //  @ApiModelProperty(value = "")

//@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public Customer imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  // @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public Customer imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * Get imageLink
   * @return imageLink
  **/
  // @ApiModelProperty(required = true, value = "")
  // @NotNull


  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  // @ApiModelProperty(value = "")


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
    Customer customer = (Customer) o;
    return Objects.equals(this.contact, customer.contact) &&
        Objects.equals(this.customerUniqueId, customer.customerUniqueId) &&
        Objects.equals(this.favouriteproducts, customer.favouriteproducts) &&
        Objects.equals(this.favouritestores, customer.favouritestores) &&
        Objects.equals(this.id, customer.id) &&
        Objects.equals(this.idpCode, customer.idpCode) &&
        Objects.equals(this.idpSub, customer.idpSub) &&
        Objects.equals(this.image, customer.image) &&
        Objects.equals(this.imageContentType, customer.imageContentType) &&
        Objects.equals(this.imageLink, customer.imageLink) &&
        Objects.equals(this.name, customer.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, customerUniqueId, favouriteproducts, favouritestores, id, idpCode, idpSub, image, imageContentType, imageLink, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    customerUniqueId: ").append(toIndentedString(customerUniqueId)).append("\n");
    sb.append("    favouriteproducts: ").append(toIndentedString(favouriteproducts)).append("\n");
    sb.append("    favouritestores: ").append(toIndentedString(favouritestores)).append("\n");
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

