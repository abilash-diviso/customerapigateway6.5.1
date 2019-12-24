package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.HyperSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Links
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class Links   {
  @JsonProperty("enctype")
  private String enctype = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("rel")
  private String rel = null;

  @JsonProperty("schema")
  private HyperSchema schema = null;

  @JsonProperty("targetSchema")
  private HyperSchema targetSchema = null;

  public Links enctype(String enctype) {
    this.enctype = enctype;
    return this;
  }

  /**
   * Get enctype
   * @return enctype
  **/
  @ApiModelProperty(value = "")


  public String getEnctype() {
    return enctype;
  }

  public void setEnctype(String enctype) {
    this.enctype = enctype;
  }

  public Links href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Links method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")


  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Links rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Get rel
   * @return rel
  **/
  @ApiModelProperty(value = "")


  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public Links schema(HyperSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HyperSchema getSchema() {
    return schema;
  }

  public void setSchema(HyperSchema schema) {
    this.schema = schema;
  }

  public Links targetSchema(HyperSchema targetSchema) {
    this.targetSchema = targetSchema;
    return this;
  }

  /**
   * Get targetSchema
   * @return targetSchema
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HyperSchema getTargetSchema() {
    return targetSchema;
  }

  public void setTargetSchema(HyperSchema targetSchema) {
    this.targetSchema = targetSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.enctype, links.enctype) &&
        Objects.equals(this.href, links.href) &&
        Objects.equals(this.method, links.method) &&
        Objects.equals(this.rel, links.rel) &&
        Objects.equals(this.schema, links.schema) &&
        Objects.equals(this.targetSchema, links.targetSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enctype, href, method, rel, schema, targetSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    enctype: ").append(toIndentedString(enctype)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    targetSchema: ").append(toIndentedString(targetSchema)).append("\n");
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

