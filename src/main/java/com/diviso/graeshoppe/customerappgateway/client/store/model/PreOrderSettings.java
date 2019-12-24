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
 * PreOrderSettings
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class PreOrderSettings   {
  @JsonProperty("fromTime")
  private OffsetDateTime fromTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isPreOrderAvailable")
  private Boolean isPreOrderAvailable = null;

  @JsonProperty("toTime")
  private OffsetDateTime toTime = null;

  public PreOrderSettings fromTime(OffsetDateTime fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Get fromTime
   * @return fromTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getFromTime() {
    return fromTime;
  }

  public void setFromTime(OffsetDateTime fromTime) {
    this.fromTime = fromTime;
  }

  public PreOrderSettings id(Long id) {
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

  public PreOrderSettings isPreOrderAvailable(Boolean isPreOrderAvailable) {
    this.isPreOrderAvailable = isPreOrderAvailable;
    return this;
  }

  /**
   * Get isPreOrderAvailable
   * @return isPreOrderAvailable
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsPreOrderAvailable() {
    return isPreOrderAvailable;
  }

  public void setIsPreOrderAvailable(Boolean isPreOrderAvailable) {
    this.isPreOrderAvailable = isPreOrderAvailable;
  }

  public PreOrderSettings toTime(OffsetDateTime toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Get toTime
   * @return toTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getToTime() {
    return toTime;
  }

  public void setToTime(OffsetDateTime toTime) {
    this.toTime = toTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreOrderSettings preOrderSettings = (PreOrderSettings) o;
    return Objects.equals(this.fromTime, preOrderSettings.fromTime) &&
        Objects.equals(this.id, preOrderSettings.id) &&
        Objects.equals(this.isPreOrderAvailable, preOrderSettings.isPreOrderAvailable) &&
        Objects.equals(this.toTime, preOrderSettings.toTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTime, id, isPreOrderAvailable, toTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreOrderSettings {\n");
    
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPreOrderAvailable: ").append(toIndentedString(isPreOrderAvailable)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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

