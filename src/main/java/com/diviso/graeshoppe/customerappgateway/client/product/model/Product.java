package com.diviso.graeshoppe.customerappgateway.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Brand;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Category;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Discount;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Label;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Location;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Manufacturer;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Supplier;
import com.diviso.graeshoppe.customerappgateway.client.product.model.TaxCategory;
import com.diviso.graeshoppe.customerappgateway.client.product.model.UOM;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-29T15:19:12.817+05:30[Asia/Kolkata]")

public class Product   {
  @JsonProperty("auxilaryLineItems")
  @Valid
  private List<AuxilaryLineItem> auxilaryLineItems = null;

  @JsonProperty("brand")
  private Brand brand = null;

  @JsonProperty("buyPrice")
  private Double buyPrice = null;

  @JsonProperty("category")
  private Category category = null;

  @JsonProperty("comboLineItems")
  @Valid
  private List<ComboLineItem> comboLineItems = null;

  @JsonProperty("discount")
  private Discount discount = null;

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

  @JsonProperty("labels")
  @Valid
  private List<Label> labels = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("manufacturer")
  private Manufacturer manufacturer = null;

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

  @JsonProperty("supplier")
  private Supplier supplier = null;

  @JsonProperty("taxCategory")
  private TaxCategory taxCategory = null;

  @JsonProperty("unit")
  private UOM unit = null;

  public Product auxilaryLineItems(List<AuxilaryLineItem> auxilaryLineItems) {
    this.auxilaryLineItems = auxilaryLineItems;
    return this;
  }

  public Product addAuxilaryLineItemsItem(AuxilaryLineItem auxilaryLineItemsItem) {
    if (this.auxilaryLineItems == null) {
      this.auxilaryLineItems = new ArrayList<AuxilaryLineItem>();
    }
    this.auxilaryLineItems.add(auxilaryLineItemsItem);
    return this;
  }

  /**
   * Get auxilaryLineItems
   * @return auxilaryLineItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuxilaryLineItem> getAuxilaryLineItems() {
    return auxilaryLineItems;
  }

  public void setAuxilaryLineItems(List<AuxilaryLineItem> auxilaryLineItems) {
    this.auxilaryLineItems = auxilaryLineItems;
  }

  public Product brand(Brand brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public Product buyPrice(Double buyPrice) {
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

  public Product category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Product comboLineItems(List<ComboLineItem> comboLineItems) {
    this.comboLineItems = comboLineItems;
    return this;
  }

  public Product addComboLineItemsItem(ComboLineItem comboLineItemsItem) {
    if (this.comboLineItems == null) {
      this.comboLineItems = new ArrayList<ComboLineItem>();
    }
    this.comboLineItems.add(comboLineItemsItem);
    return this;
  }

  /**
   * Get comboLineItems
   * @return comboLineItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ComboLineItem> getComboLineItems() {
    return comboLineItems;
  }

  public void setComboLineItems(List<ComboLineItem> comboLineItems) {
    this.comboLineItems = comboLineItems;
  }

  public Product discount(Discount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public Product iDPcode(String iDPcode) {
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

  public Product id(Long id) {
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

  public Product image(byte[] image) {
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

  public Product imageContentType(String imageContentType) {
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

  public Product imageLink(String imageLink) {
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

  public Product isActive(Boolean isActive) {
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

  public Product isAuxilaryItem(Boolean isAuxilaryItem) {
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

  public Product isServiceItem(Boolean isServiceItem) {
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

  public Product labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public Product addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Label>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public Product location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Product manufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Get manufacturer
   * @return manufacturer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Manufacturer getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Product maxQuantityLevel(Double maxQuantityLevel) {
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

  public Product minQuantityLevel(Double minQuantityLevel) {
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

  public Product name(String name) {
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

  public Product reference(String reference) {
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

  public Product sellingPrice(Double sellingPrice) {
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

  public Product showInCatalogue(Boolean showInCatalogue) {
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

  public Product sku(String sku) {
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

  public Product storageCost(Double storageCost) {
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

  public Product supplier(Supplier supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Get supplier
   * @return supplier
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }

  public Product taxCategory(TaxCategory taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

  /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TaxCategory getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(TaxCategory taxCategory) {
    this.taxCategory = taxCategory;
  }

  public Product unit(UOM unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UOM getUnit() {
    return unit;
  }

  public void setUnit(UOM unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.auxilaryLineItems, product.auxilaryLineItems) &&
        Objects.equals(this.brand, product.brand) &&
        Objects.equals(this.buyPrice, product.buyPrice) &&
        Objects.equals(this.category, product.category) &&
        Objects.equals(this.comboLineItems, product.comboLineItems) &&
        Objects.equals(this.discount, product.discount) &&
        Objects.equals(this.iDPcode, product.iDPcode) &&
        Objects.equals(this.id, product.id) &&
        Objects.equals(this.image, product.image) &&
        Objects.equals(this.imageContentType, product.imageContentType) &&
        Objects.equals(this.imageLink, product.imageLink) &&
        Objects.equals(this.isActive, product.isActive) &&
        Objects.equals(this.isAuxilaryItem, product.isAuxilaryItem) &&
        Objects.equals(this.isServiceItem, product.isServiceItem) &&
        Objects.equals(this.labels, product.labels) &&
        Objects.equals(this.location, product.location) &&
        Objects.equals(this.manufacturer, product.manufacturer) &&
        Objects.equals(this.maxQuantityLevel, product.maxQuantityLevel) &&
        Objects.equals(this.minQuantityLevel, product.minQuantityLevel) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.reference, product.reference) &&
        Objects.equals(this.sellingPrice, product.sellingPrice) &&
        Objects.equals(this.showInCatalogue, product.showInCatalogue) &&
        Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.storageCost, product.storageCost) &&
        Objects.equals(this.supplier, product.supplier) &&
        Objects.equals(this.taxCategory, product.taxCategory) &&
        Objects.equals(this.unit, product.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxilaryLineItems, brand, buyPrice, category, comboLineItems, discount, iDPcode, id, image, imageContentType, imageLink, isActive, isAuxilaryItem, isServiceItem, labels, location, manufacturer, maxQuantityLevel, minQuantityLevel, name, reference, sellingPrice, showInCatalogue, sku, storageCost, supplier, taxCategory, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    auxilaryLineItems: ").append(toIndentedString(auxilaryLineItems)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    buyPrice: ").append(toIndentedString(buyPrice)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    comboLineItems: ").append(toIndentedString(comboLineItems)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    iDPcode: ").append(toIndentedString(iDPcode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isAuxilaryItem: ").append(toIndentedString(isAuxilaryItem)).append("\n");
    sb.append("    isServiceItem: ").append(toIndentedString(isServiceItem)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    maxQuantityLevel: ").append(toIndentedString(maxQuantityLevel)).append("\n");
    sb.append("    minQuantityLevel: ").append(toIndentedString(minQuantityLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sellingPrice: ").append(toIndentedString(sellingPrice)).append("\n");
    sb.append("    showInCatalogue: ").append(toIndentedString(showInCatalogue)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    storageCost: ").append(toIndentedString(storageCost)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

