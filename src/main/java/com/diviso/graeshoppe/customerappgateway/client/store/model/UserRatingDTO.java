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
 * UserRatingDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class UserRatingDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("ratedOn")
  private OffsetDateTime ratedOn = null;

  @JsonProperty("rating")
  private Double rating = null;

  @JsonProperty("storeId")
  private Long storeId = null;

  @JsonProperty("userName")
  private String userName = null;

  public UserRatingDTO id(Long id) {
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

  public UserRatingDTO ratedOn(OffsetDateTime ratedOn) {
    this.ratedOn = ratedOn;
    return this;
  }

  /**
   * Get ratedOn
   * @return ratedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRatedOn() {
    return ratedOn;
  }

  public void setRatedOn(OffsetDateTime ratedOn) {
    this.ratedOn = ratedOn;
  }

  public UserRatingDTO rating(Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public UserRatingDTO storeId(Long storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public Long getStoreId() {
    return storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }

  public UserRatingDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRatingDTO userRatingDTO = (UserRatingDTO) o;
    return Objects.equals(this.id, userRatingDTO.id) &&
        Objects.equals(this.ratedOn, userRatingDTO.ratedOn) &&
        Objects.equals(this.rating, userRatingDTO.rating) &&
        Objects.equals(this.storeId, userRatingDTO.storeId) &&
        Objects.equals(this.userName, userRatingDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratedOn, rating, storeId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRatingDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratedOn: ").append(toIndentedString(ratedOn)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

