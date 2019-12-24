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
 * DeliveryInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

public class DeliveryInfoDTO   {
  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("startingTime")
  private OffsetDateTime startingTime = null;

  @JsonProperty("storeId")
  private Long storeId = null;

  @JsonProperty("typeId")
  private Long typeId = null;

  public DeliveryInfoDTO endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public DeliveryInfoDTO id(Long id) {
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

  public DeliveryInfoDTO startingTime(OffsetDateTime startingTime) {
    this.startingTime = startingTime;
    return this;
  }

  /**
   * Get startingTime
   * @return startingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(OffsetDateTime startingTime) {
    this.startingTime = startingTime;
  }

  public DeliveryInfoDTO storeId(Long storeId) {
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

  public DeliveryInfoDTO typeId(Long typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(value = "")


  public Long getTypeId() {
    return typeId;
  }

  public void setTypeId(Long typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryInfoDTO deliveryInfoDTO = (DeliveryInfoDTO) o;
    return Objects.equals(this.endTime, deliveryInfoDTO.endTime) &&
        Objects.equals(this.id, deliveryInfoDTO.id) &&
        Objects.equals(this.startingTime, deliveryInfoDTO.startingTime) &&
        Objects.equals(this.storeId, deliveryInfoDTO.storeId) &&
        Objects.equals(this.typeId, deliveryInfoDTO.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, id, startingTime, storeId, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInfoDTO {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startingTime: ").append(toIndentedString(startingTime)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

