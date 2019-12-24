package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StoreDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class StoreDTO   {
  @JsonProperty("closingTime")
  private OffsetDateTime closingTime = null;

  @JsonProperty("contactNo")
  private Long contactNo = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("imageLink")
  private String imageLink = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("locationName")
  private String locationName = null;

  @JsonProperty("maxDeliveryTime")
  private OffsetDateTime maxDeliveryTime = null;

  @JsonProperty("minAmount")
  private Double minAmount = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("openingTime")
  private OffsetDateTime openingTime = null;

  @JsonProperty("preOrderSettingsId")
  private Long preOrderSettingsId = null;

  @JsonProperty("propreitorId")
  private Long propreitorId = null;

  @JsonProperty("regNo")
  private String regNo = null;

  @JsonProperty("storeAddressId")
  private Long storeAddressId = null;

  @JsonProperty("storeSettingsId")
  private Long storeSettingsId = null;

  @JsonProperty("storeUniqueId")
  private String storeUniqueId = null;

  @JsonProperty("totalRating")
  private Double totalRating = null;

  public StoreDTO closingTime(OffsetDateTime closingTime) {
    this.closingTime = closingTime;
    return this;
  }

  /**
   * Get closingTime
   * @return closingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(OffsetDateTime closingTime) {
    this.closingTime = closingTime;
  }

  public StoreDTO contactNo(Long contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  **/
  @ApiModelProperty(value = "")


  public Long getContactNo() {
    return contactNo;
  }

  public void setContactNo(Long contactNo) {
    this.contactNo = contactNo;
  }

  public StoreDTO email(String email) {
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

  public StoreDTO id(Long id) {
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

  public StoreDTO image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public StoreDTO imageContentType(String imageContentType) {
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

  public StoreDTO imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * Get imageLink
   * @return imageLink
  **/
  


  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public StoreDTO info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public StoreDTO location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public StoreDTO locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * Get locationName
   * @return locationName
  **/
  @ApiModelProperty(value = "")


  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public StoreDTO maxDeliveryTime(OffsetDateTime maxDeliveryTime) {
    this.maxDeliveryTime = maxDeliveryTime;
    return this;
  }

  /**
   * Get maxDeliveryTime
   * @return maxDeliveryTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getMaxDeliveryTime() {
    return maxDeliveryTime;
  }

  public void setMaxDeliveryTime(OffsetDateTime maxDeliveryTime) {
    this.maxDeliveryTime = maxDeliveryTime;
  }

  public StoreDTO minAmount(Double minAmount) {
    this.minAmount = minAmount;
    return this;
  }

  /**
   * Get minAmount
   * @return minAmount
  **/
  @ApiModelProperty(value = "")


  public Double getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(Double minAmount) {
    this.minAmount = minAmount;
  }

  public StoreDTO name(String name) {
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

  public StoreDTO openingTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
    return this;
  }

  /**
   * Get openingTime
   * @return openingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
  }

  public StoreDTO preOrderSettingsId(Long preOrderSettingsId) {
    this.preOrderSettingsId = preOrderSettingsId;
    return this;
  }

  /**
   * Get preOrderSettingsId
   * @return preOrderSettingsId
  **/
  @ApiModelProperty(value = "")


  public Long getPreOrderSettingsId() {
    return preOrderSettingsId;
  }

  public void setPreOrderSettingsId(Long preOrderSettingsId) {
    this.preOrderSettingsId = preOrderSettingsId;
  }

  public StoreDTO propreitorId(Long propreitorId) {
    this.propreitorId = propreitorId;
    return this;
  }

  /**
   * Get propreitorId
   * @return propreitorId
  **/
  @ApiModelProperty(value = "")


  public Long getPropreitorId() {
    return propreitorId;
  }

  public void setPropreitorId(Long propreitorId) {
    this.propreitorId = propreitorId;
  }

  public StoreDTO regNo(String regNo) {
    this.regNo = regNo;
    return this;
  }

  /**
   * Get regNo
   * @return regNo
  **/
  @ApiModelProperty(value = "")


  public String getRegNo() {
    return regNo;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }

  public StoreDTO storeAddressId(Long storeAddressId) {
    this.storeAddressId = storeAddressId;
    return this;
  }

  /**
   * Get storeAddressId
   * @return storeAddressId
  **/
  @ApiModelProperty(value = "")


  public Long getStoreAddressId() {
    return storeAddressId;
  }

  public void setStoreAddressId(Long storeAddressId) {
    this.storeAddressId = storeAddressId;
  }

  public StoreDTO storeSettingsId(Long storeSettingsId) {
    this.storeSettingsId = storeSettingsId;
    return this;
  }

  /**
   * Get storeSettingsId
   * @return storeSettingsId
  **/
  @ApiModelProperty(value = "")


  public Long getStoreSettingsId() {
    return storeSettingsId;
  }

  public void setStoreSettingsId(Long storeSettingsId) {
    this.storeSettingsId = storeSettingsId;
  }

  public StoreDTO storeUniqueId(String storeUniqueId) {
    this.storeUniqueId = storeUniqueId;
    return this;
  }

  /**
   * Get storeUniqueId
   * @return storeUniqueId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStoreUniqueId() {
    return storeUniqueId;
  }

  public void setStoreUniqueId(String storeUniqueId) {
    this.storeUniqueId = storeUniqueId;
  }

  public StoreDTO totalRating(Double totalRating) {
    this.totalRating = totalRating;
    return this;
  }

  /**
   * Get totalRating
   * @return totalRating
  **/
  @ApiModelProperty(value = "")


  public Double getTotalRating() {
    return totalRating;
  }

  public void setTotalRating(Double totalRating) {
    this.totalRating = totalRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDTO storeDTO = (StoreDTO) o;
    return Objects.equals(this.closingTime, storeDTO.closingTime) &&
        Objects.equals(this.contactNo, storeDTO.contactNo) &&
        Objects.equals(this.email, storeDTO.email) &&
        Objects.equals(this.id, storeDTO.id) &&
        Objects.equals(this.image, storeDTO.image) &&
        Objects.equals(this.imageContentType, storeDTO.imageContentType) &&
        Objects.equals(this.imageLink, storeDTO.imageLink) &&
        Objects.equals(this.info, storeDTO.info) &&
        Objects.equals(this.location, storeDTO.location) &&
        Objects.equals(this.locationName, storeDTO.locationName) &&
        Objects.equals(this.maxDeliveryTime, storeDTO.maxDeliveryTime) &&
        Objects.equals(this.minAmount, storeDTO.minAmount) &&
        Objects.equals(this.name, storeDTO.name) &&
        Objects.equals(this.openingTime, storeDTO.openingTime) &&
        Objects.equals(this.preOrderSettingsId, storeDTO.preOrderSettingsId) &&
        Objects.equals(this.propreitorId, storeDTO.propreitorId) &&
        Objects.equals(this.regNo, storeDTO.regNo) &&
        Objects.equals(this.storeAddressId, storeDTO.storeAddressId) &&
        Objects.equals(this.storeSettingsId, storeDTO.storeSettingsId) &&
        Objects.equals(this.storeUniqueId, storeDTO.storeUniqueId) &&
        Objects.equals(this.totalRating, storeDTO.totalRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingTime, contactNo, email, id, image, imageContentType, imageLink, info, location, locationName, maxDeliveryTime, minAmount, name, openingTime, preOrderSettingsId, propreitorId, regNo, storeAddressId, storeSettingsId, storeUniqueId, totalRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDTO {\n");
    
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    maxDeliveryTime: ").append(toIndentedString(maxDeliveryTime)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    preOrderSettingsId: ").append(toIndentedString(preOrderSettingsId)).append("\n");
    sb.append("    propreitorId: ").append(toIndentedString(propreitorId)).append("\n");
    sb.append("    regNo: ").append(toIndentedString(regNo)).append("\n");
    sb.append("    storeAddressId: ").append(toIndentedString(storeAddressId)).append("\n");
    sb.append("    storeSettingsId: ").append(toIndentedString(storeSettingsId)).append("\n");
    sb.append("    storeUniqueId: ").append(toIndentedString(storeUniqueId)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
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

