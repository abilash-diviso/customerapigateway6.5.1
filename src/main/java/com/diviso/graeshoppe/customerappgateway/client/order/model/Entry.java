package com.diviso.graeshoppe.customerappgateway.client.order.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Entry
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-17T15:32:44.878860+05:30[Asia/Kolkata]")

public class Entry   {
  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("keyAsString")
  private String keyAsString = null;

  @JsonProperty("name")
  private String name = null;

  public Entry count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")


  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public Entry key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Entry keyAsString(String keyAsString) {
    this.keyAsString = keyAsString;
    return this;
  }

  /**
   * Get keyAsString
   * @return keyAsString
  **/
  @ApiModelProperty(value = "")


  public String getKeyAsString() {
    return keyAsString;
  }

  public void setKeyAsString(String keyAsString) {
    this.keyAsString = keyAsString;
  }

  public Entry name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entry entry = (Entry) o;
    return Objects.equals(this.count, entry.count) &&
        Objects.equals(this.key, entry.key) &&
        Objects.equals(this.keyAsString, entry.keyAsString) &&
        Objects.equals(this.name, entry.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, key, keyAsString, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entry {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyAsString: ").append(toIndentedString(keyAsString)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

