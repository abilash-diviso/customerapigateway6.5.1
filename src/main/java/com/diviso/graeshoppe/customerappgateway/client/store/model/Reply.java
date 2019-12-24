package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Review;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingReview;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reply
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class Reply   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("repliedDate")
  private OffsetDateTime repliedDate = null;

  @JsonProperty("reply")
  private String reply = null;

  @JsonProperty("review")
  private Review review = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userRatingReview")
  private UserRatingReview userRatingReview = null;

  public Reply id(Long id) {
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

  public Reply repliedDate(OffsetDateTime repliedDate) {
    this.repliedDate = repliedDate;
    return this;
  }

  /**
   * Get repliedDate
   * @return repliedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRepliedDate() {
    return repliedDate;
  }

  public void setRepliedDate(OffsetDateTime repliedDate) {
    this.repliedDate = repliedDate;
  }

  public Reply reply(String reply) {
    this.reply = reply;
    return this;
  }

  /**
   * Get reply
   * @return reply
  **/
  @ApiModelProperty(value = "")


  public String getReply() {
    return reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }

  public Reply review(Review review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Review getReview() {
    return review;
  }

  public void setReview(Review review) {
    this.review = review;
  }

  public Reply userName(String userName) {
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

  public Reply userRatingReview(UserRatingReview userRatingReview) {
    this.userRatingReview = userRatingReview;
    return this;
  }

  /**
   * Get userRatingReview
   * @return userRatingReview
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserRatingReview getUserRatingReview() {
    return userRatingReview;
  }

  public void setUserRatingReview(UserRatingReview userRatingReview) {
    this.userRatingReview = userRatingReview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reply reply = (Reply) o;
    return Objects.equals(this.id, reply.id) &&
        Objects.equals(this.repliedDate, reply.repliedDate) &&
        Objects.equals(this.reply, reply.reply) &&
        Objects.equals(this.review, reply.review) &&
        Objects.equals(this.userName, reply.userName) &&
        Objects.equals(this.userRatingReview, reply.userRatingReview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repliedDate, reply, review, userName, userRatingReview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reply {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repliedDate: ").append(toIndentedString(repliedDate)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userRatingReview: ").append(toIndentedString(userRatingReview)).append("\n");
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

