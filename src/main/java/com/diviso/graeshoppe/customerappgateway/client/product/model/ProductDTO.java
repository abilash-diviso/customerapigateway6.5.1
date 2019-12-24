package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class ProductDTO   {
  @JsonProperty("brandId")
  private Long brandId = null;

  @JsonProperty("buyPrice")
  private Double buyPrice = null;

  @JsonProperty("categoryId")
  private Long categoryId = null;

  @JsonProperty("discountId")
  private Long discountId = null;

  @JsonProperty("iDPcode")
  private String iDPcode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("imageLink")
  private String imageLink = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  @JsonProperty("isAuxilaryItem")
  private Boolean isAuxilaryItem = null;

  @JsonProperty("isServiceItem")
  private Boolean isServiceItem = null;

  @JsonProperty("locationId")
  private Long locationId = null;

  @JsonProperty("manufacturerId")
  private Long manufacturerId = null;

  @JsonProperty("maxQuantityLevel")
  private Double maxQuantityLevel = null;

  @JsonProperty("minQuantityLevel")
  private Double minQuantityLevel = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("sellingPrice")
  private Double sellingPrice = null;

  @JsonProperty("showInCatalogue")
  private Boolean showInCatalogue = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("storageCost")
  private Double storageCost = null;

  @JsonProperty("supplierId")
  private Long supplierId = null;

  @JsonProperty("taxCategoryId")
  private Long taxCategoryId = null;

  @JsonProperty("unitId")
  private Long unitId = null;

  public ProductDTO brandId(Long brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
  **/
  @ApiModelProperty(value = "")


  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public ProductDTO buyPrice(Double buyPrice) {
    this.buyPrice = buyPrice;
    return this;
  }

  /**
   * Get buyPrice
   * @return buyPrice
  **/
  @ApiModelProperty(value = "")


  public Double getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(Double buyPrice) {
    this.buyPrice = buyPrice;
  }

  public ProductDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(value = "")


  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public ProductDTO discountId(Long discountId) {
    this.discountId = discountId;
    return this;
  }

  /**
   * Get discountId
   * @return discountId
  **/
  @ApiModelProperty(value = "")


  public Long getDiscountId() {
    return discountId;
  }

  public void setDiscountId(Long discountId) {
    this.discountId = discountId;
  }

  public ProductDTO iDPcode(String iDPcode) {
    this.iDPcode = iDPcode;
    return this;
  }

  /**
   * Get iDPcode
   * @return iDPcode
  **/
  @ApiModelProperty(value = "")


  public String getIDPcode() {
    return iDPcode;
  }

  public void setIDPcode(String iDPcode) {
    this.iDPcode = iDPcode;
  }

  public ProductDTO id(Long id) {
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

  public ProductDTO image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

//@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public ProductDTO imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public ProductDTO imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * Get imageLink
   * @return imageLink
  **/
  @ApiModelProperty(value = "")


  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public ProductDTO isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ProductDTO isAuxilaryItem(Boolean isAuxilaryItem) {
    this.isAuxilaryItem = isAuxilaryItem;
    return this;
  }

  /**
   * Get isAuxilaryItem
   * @return isAuxilaryItem
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsAuxilaryItem() {
    return isAuxilaryItem;
  }

  public void setIsAuxilaryItem(Boolean isAuxilaryItem) {
    this.isAuxilaryItem = isAuxilaryItem;
  }

  public ProductDTO isServiceItem(Boolean isServiceItem) {
    this.isServiceItem = isServiceItem;
    return this;
  }

  /**
   * Get isServiceItem
   * @return isServiceItem
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsServiceItem() {
    return isServiceItem;
  }

  public void setIsServiceItem(Boolean isServiceItem) {
    this.isServiceItem = isServiceItem;
  }

  public ProductDTO locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public ProductDTO manufacturerId(Long manufacturerId) {
    this.manufacturerId = manufacturerId;
    return this;
  }

  /**
   * Get manufacturerId
   * @return manufacturerId
  **/
  @ApiModelProperty(value = "")


  public Long getManufacturerId() {
    return manufacturerId;
  }

  public void setManufacturerId(Long manufacturerId) {
    this.manufacturerId = manufacturerId;
  }

  public ProductDTO maxQuantityLevel(Double maxQuantityLevel) {
    this.maxQuantityLevel = maxQuantityLevel;
    return this;
  }

  /**
   * Get maxQuantityLevel
   * @return maxQuantityLevel
  **/
  @ApiModelProperty(value = "")


  public Double getMaxQuantityLevel() {
    return maxQuantityLevel;
  }

  public void setMaxQuantityLevel(Double maxQuantityLevel) {
    this.maxQuantityLevel = maxQuantityLevel;
  }

  public ProductDTO minQuantityLevel(Double minQuantityLevel) {
    this.minQuantityLevel = minQuantityLevel;
    return this;
  }

  /**
   * Get minQuantityLevel
   * @return minQuantityLevel
  **/
  @ApiModelProperty(value = "")


  public Double getMinQuantityLevel() {
    return minQuantityLevel;
  }

  public void setMinQuantityLevel(Double minQuantityLevel) {
    this.minQuantityLevel = minQuantityLevel;
  }

  public ProductDTO name(String name) {
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

  public ProductDTO reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public ProductDTO sellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
    return this;
  }

  /**
   * Get sellingPrice
   * @return sellingPrice
  **/
  @ApiModelProperty(value = "")


  public Double getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public ProductDTO showInCatalogue(Boolean showInCatalogue) {
    this.showInCatalogue = showInCatalogue;
    return this;
  }

  /**
   * Get showInCatalogue
   * @return showInCatalogue
  **/
  @ApiModelProperty(value = "")


  public Boolean isShowInCatalogue() {
    return showInCatalogue;
  }

  public void setShowInCatalogue(Boolean showInCatalogue) {
    this.showInCatalogue = showInCatalogue;
  }

  public ProductDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")


  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ProductDTO storageCost(Double storageCost) {
    this.storageCost = storageCost;
    return this;
  }

  /**
   * Get storageCost
   * @return storageCost
  **/
  @ApiModelProperty(value = "")


  public Double getStorageCost() {
    return storageCost;
  }

  public void setStorageCost(Double storageCost) {
    this.storageCost = storageCost;
  }

  public ProductDTO supplierId(Long supplierId) {
    this.supplierId = supplierId;
    return this;
  }

  /**
   * Get supplierId
   * @return supplierId
  **/
  @ApiModelProperty(value = "")


  public Long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Long supplierId) {
    this.supplierId = supplierId;
  }

  public ProductDTO taxCategoryId(Long taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
    return this;
  }

  /**
   * Get taxCategoryId
   * @return taxCategoryId
  **/
  @ApiModelProperty(value = "")


  public Long getTaxCategoryId() {
    return taxCategoryId;
  }

  public void setTaxCategoryId(Long taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
  }

  public ProductDTO unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Get unitId
   * @return unitId
  **/
  @ApiModelProperty(value = "")


  public Long getUnitId() {
    return unitId;
  }

  public void setUnitId(Long unitId) {
    this.unitId = unitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDTO productDTO = (ProductDTO) o;
    return Objects.equals(this.brandId, productDTO.brandId) &&
        Objects.equals(this.buyPrice, productDTO.buyPrice) &&
        Objects.equals(this.categoryId, productDTO.categoryId) &&
        Objects.equals(this.discountId, productDTO.discountId) &&
        Objects.equals(this.iDPcode, productDTO.iDPcode) &&
        Objects.equals(this.id, productDTO.id) &&
        Objects.equals(this.image, productDTO.image) &&
        Objects.equals(this.imageContentType, productDTO.imageContentType) &&
        Objects.equals(this.imageLink, productDTO.imageLink) &&
        Objects.equals(this.isActive, productDTO.isActive) &&
        Objects.equals(this.isAuxilaryItem, productDTO.isAuxilaryItem) &&
        Objects.equals(this.isServiceItem, productDTO.isServiceItem) &&
        Objects.equals(this.locationId, productDTO.locationId) &&
        Objects.equals(this.manufacturerId, productDTO.manufacturerId) &&
        Objects.equals(this.maxQuantityLevel, productDTO.maxQuantityLevel) &&
        Objects.equals(this.minQuantityLevel, productDTO.minQuantityLevel) &&
        Objects.equals(this.name, productDTO.name) &&
        Objects.equals(this.reference, productDTO.reference) &&
        Objects.equals(this.sellingPrice, productDTO.sellingPrice) &&
        Objects.equals(this.showInCatalogue, productDTO.showInCatalogue) &&
        Objects.equals(this.sku, productDTO.sku) &&
        Objects.equals(this.storageCost, productDTO.storageCost) &&
        Objects.equals(this.supplierId, productDTO.supplierId) &&
        Objects.equals(this.taxCategoryId, productDTO.taxCategoryId) &&
        Objects.equals(this.unitId, productDTO.unitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, buyPrice, categoryId, discountId, iDPcode, id, image, imageContentType, imageLink, isActive, isAuxilaryItem, isServiceItem, locationId, manufacturerId, maxQuantityLevel, minQuantityLevel, name, reference, sellingPrice, showInCatalogue, sku, storageCost, supplierId, taxCategoryId, unitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDTO {\n");
    
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    buyPrice: ").append(toIndentedString(buyPrice)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    iDPcode: ").append(toIndentedString(iDPcode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isAuxilaryItem: ").append(toIndentedString(isAuxilaryItem)).append("\n");
    sb.append("    isServiceItem: ").append(toIndentedString(isServiceItem)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
    sb.append("    maxQuantityLevel: ").append(toIndentedString(maxQuantityLevel)).append("\n");
    sb.append("    minQuantityLevel: ").append(toIndentedString(minQuantityLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sellingPrice: ").append(toIndentedString(sellingPrice)).append("\n");
    sb.append("    showInCatalogue: ").append(toIndentedString(showInCatalogue)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    storageCost: ").append(toIndentedString(storageCost)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    taxCategoryId: ").append(toIndentedString(taxCategoryId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
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

