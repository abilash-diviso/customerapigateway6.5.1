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
 * ReviewDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class ReviewDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("review")
  private String review = null;

  @JsonProperty("reviewedDate")
  private OffsetDateTime reviewedDate = null;

  @JsonProperty("storeId")
  private Long storeId = null;

  @JsonProperty("userName")
  private String userName = null;

  public ReviewDTO id(Long id) {
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

  public ReviewDTO review(String review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  **/
  @ApiModelProperty(value = "")


  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public ReviewDTO reviewedDate(OffsetDateTime reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }

  /**
   * Get reviewedDate
   * @return reviewedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getReviewedDate() {
    return reviewedDate;
  }

  public void setReviewedDate(OffsetDateTime reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  public ReviewDTO storeId(Long storeId) {
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

  public ReviewDTO userName(String userName) {
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
    ReviewDTO reviewDTO = (ReviewDTO) o;
    return Objects.equals(this.id, reviewDTO.id) &&
        Objects.equals(this.review, reviewDTO.review) &&
        Objects.equals(this.reviewedDate, reviewDTO.reviewedDate) &&
        Objects.equals(this.storeId, reviewDTO.storeId) &&
        Objects.equals(this.userName, reviewDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, review, reviewedDate, storeId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
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

