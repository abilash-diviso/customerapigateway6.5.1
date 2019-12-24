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
 * Message
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:26:27.966+05:30[Asia/Kolkata]")

public class Message   {
  @JsonProperty("content")
  private String content = null;

  @JsonProperty("numParts")
  private Long numParts = null;

  @JsonProperty("sender")
  private String sender = null;

  public Message content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Message numParts(Long numParts) {
    this.numParts = numParts;
    return this;
  }

  /**
   * Get numParts
   * @return numParts
  **/
  @ApiModelProperty(value = "")


  public Long getNumParts() {
    return numParts;
  }

  public void setNumParts(Long numParts) {
    this.numParts = numParts;
  }

  public Message sender(String sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")


  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.content, message.content) &&
        Objects.equals(this.numParts, message.numParts) &&
        Objects.equals(this.sender, message.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, numParts, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    numParts: ").append(toIndentedString(numParts)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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

