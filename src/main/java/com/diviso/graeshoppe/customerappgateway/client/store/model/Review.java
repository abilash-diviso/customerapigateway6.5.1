package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Reply;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Store;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Review
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class Review   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("replies")
  @Valid
  private List<Reply> replies = null;

  @JsonProperty("review")
  private String review = null;

  @JsonProperty("reviewedDate")
  private OffsetDateTime reviewedDate = null;

  @JsonProperty("store")
  private Store store = null;

  @JsonProperty("userName")
  private String userName = null;

  public Review id(Long id) {
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

  public Review replies(List<Reply> replies) {
    this.replies = replies;
    return this;
  }

  public Review addRepliesItem(Reply repliesItem) {
    if (this.replies == null) {
      this.replies = new ArrayList<Reply>();
    }
    this.replies.add(repliesItem);
    return this;
  }

  /**
   * Get replies
   * @return replies
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Reply> getReplies() {
    return replies;
  }

  public void setReplies(List<Reply> replies) {
    this.replies = replies;
  }

  public Review review(String review) {
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

  public Review reviewedDate(OffsetDateTime reviewedDate) {
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

  public Review store(Store store) {
    this.store = store;
    return this;
  }

  /**
   * Get store
   * @return store
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public Review userName(String userName) {
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
    Review review = (Review) o;
    return Objects.equals(this.id, review.id) &&
        Objects.equals(this.replies, review.replies) &&
        Objects.equals(this.review, review.review) &&
        Objects.equals(this.reviewedDate, review.reviewedDate) &&
        Objects.equals(this.store, review.store) &&
        Objects.equals(this.userName, review.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, replies, review, reviewedDate, store, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Review {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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

