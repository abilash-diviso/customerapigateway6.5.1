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
 * HyperSchema
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

public class HyperSchema   {
  @JsonProperty("contentEncoding")
  private String contentEncoding = null;

  @JsonProperty("fragmentResolution")
  private String fragmentResolution = null;

  @JsonProperty("links")
  @Valid
  private List<Links> links = null;

  @JsonProperty("mediaType")
  private String mediaType = null;

  @JsonProperty("pathStart")
  private String pathStart = null;

  @JsonProperty("readonly")
  private Boolean readonly = null;

  public HyperSchema contentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
    return this;
  }

  /**
   * Get contentEncoding
   * @return contentEncoding
  **/
  @ApiModelProperty(value = "")


  public String getContentEncoding() {
    return contentEncoding;
  }

  public void setContentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
  }

  public HyperSchema fragmentResolution(String fragmentResolution) {
    this.fragmentResolution = fragmentResolution;
    return this;
  }

  /**
   * Get fragmentResolution
   * @return fragmentResolution
  **/
  @ApiModelProperty(value = "")


  public String getFragmentResolution() {
    return fragmentResolution;
  }

  public void setFragmentResolution(String fragmentResolution) {
    this.fragmentResolution = fragmentResolution;
  }

  public HyperSchema links(List<Links> links) {
    this.links = links;
    return this;
  }

  public HyperSchema addLinksItem(Links linksItem) {
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

  public HyperSchema mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(value = "")


  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public HyperSchema pathStart(String pathStart) {
    this.pathStart = pathStart;
    return this;
  }

  /**
   * Get pathStart
   * @return pathStart
  **/
  @ApiModelProperty(value = "")


  public String getPathStart() {
    return pathStart;
  }

  public void setPathStart(String pathStart) {
    this.pathStart = pathStart;
  }

  public HyperSchema readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

  /**
   * Get readonly
   * @return readonly
  **/
  @ApiModelProperty(value = "")


  public Boolean isReadonly() {
    return readonly;
  }

  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HyperSchema hyperSchema = (HyperSchema) o;
    return Objects.equals(this.contentEncoding, hyperSchema.contentEncoding) &&
        Objects.equals(this.fragmentResolution, hyperSchema.fragmentResolution) &&
        Objects.equals(this.links, hyperSchema.links) &&
        Objects.equals(this.mediaType, hyperSchema.mediaType) &&
        Objects.equals(this.pathStart, hyperSchema.pathStart) &&
        Objects.equals(this.readonly, hyperSchema.readonly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentEncoding, fragmentResolution, links, mediaType, pathStart, readonly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HyperSchema {\n");
    
    sb.append("    contentEncoding: ").append(toIndentedString(contentEncoding)).append("\n");
    sb.append("    fragmentResolution: ").append(toIndentedString(fragmentResolution)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    pathStart: ").append(toIndentedString(pathStart)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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

