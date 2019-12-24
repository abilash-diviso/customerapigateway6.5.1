package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PaymentInitiateResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class PaymentInitiateResponse   {
  @JsonProperty("create_time")
  private String createTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("links")
  @Valid
  private List<Links> links = null;

  @JsonProperty("state")
  private String state = null;

  public PaymentInitiateResponse createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
  **/
  @ApiModelProperty(value = "")


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public PaymentInitiateResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentInitiateResponse links(List<Links> links) {
    this.links = links;
    return this;
  }

  public PaymentInitiateResponse addLinksItem(Links linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Links>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Links> getLinks() {
    return links;
  }

  public void setLinks(List<Links> links) {
    this.links = links;
  }

  public PaymentInitiateResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiateResponse paymentInitiateResponse = (PaymentInitiateResponse) o;
    return Objects.equals(this.createTime, paymentInitiateResponse.createTime) &&
        Objects.equals(this.id, paymentInitiateResponse.id) &&
        Objects.equals(this.links, paymentInitiateResponse.links) &&
        Objects.equals(this.state, paymentInitiateResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, id, links, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiateResponse {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

