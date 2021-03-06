/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Allocation;
import com.xero.models.accounting.LineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Prepayment
 */

public class Prepayment {
  /**
   * See Prepayment Types
   */
  public enum TypeEnum {
    RECEIVE_PREPAYMENT("RECEIVE-PREPAYMENT"),
    
    SPEND_PREPAYMENT("SPEND-PREPAYMENT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  @JsonProperty("Contact")
  private Object contact = null;

  @JsonProperty("Date")
  private String date = null;

  /**
   * See Prepayment Status Codes
   */
  public enum StatusEnum {
    AUTHORISED("AUTHORISED"),
    
    PAID("PAID"),
    
    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("LineAmountTypes")
  private String lineAmountTypes = null;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = null;

  @JsonProperty("SubTotal")
  private Float subTotal = null;

  @JsonProperty("TotalTax")
  private Float totalTax = null;

  @JsonProperty("Total")
  private Float total = null;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC = null;

  @JsonProperty("CurrencyCode")
  private String currencyCode = null;

  @JsonProperty("PrepaymentID")
  private UUID prepaymentID = null;

  @JsonProperty("CurrencyRate")
  private Float currencyRate = null;

  @JsonProperty("RemainingCredit")
  private String remainingCredit = null;

  @JsonProperty("Allocations")
  private List<Allocation> allocations = null;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = null;

  public Prepayment type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * See Prepayment Types
   * @return type
  **/
  @ApiModelProperty(value = "See Prepayment Types")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Prepayment contact(Object contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public Object getContact() {
    return contact;
  }

  public void setContact(Object contact) {
    this.contact = contact;
  }

  public Prepayment date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date the prepayment is created YYYY-MM-DD
   * @return date
  **/
  @ApiModelProperty(value = "The date the prepayment is created YYYY-MM-DD")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Prepayment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * See Prepayment Status Codes
   * @return status
  **/
  @ApiModelProperty(value = "See Prepayment Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Prepayment lineAmountTypes(String lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

   /**
   * See Prepayment Line Amount Types
   * @return lineAmountTypes
  **/
  @ApiModelProperty(value = "See Prepayment Line Amount Types")
  public String getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(String lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public Prepayment lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Prepayment addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * See Prepayment Line Items
   * @return lineItems
  **/
  @ApiModelProperty(value = "See Prepayment Line Items")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Prepayment subTotal(Float subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * The subtotal of the prepayment excluding taxes
   * @return subTotal
  **/
  @ApiModelProperty(value = "The subtotal of the prepayment excluding taxes")
  public Float getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Float subTotal) {
    this.subTotal = subTotal;
  }

  public Prepayment totalTax(Float totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * The total tax on the prepayment
   * @return totalTax
  **/
  @ApiModelProperty(value = "The total tax on the prepayment")
  public Float getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Float totalTax) {
    this.totalTax = totalTax;
  }

  public Prepayment total(Float total) {
    this.total = total;
    return this;
  }

   /**
   * The total of the prepayment(subtotal + total tax)
   * @return total
  **/
  @ApiModelProperty(value = "The total of the prepayment(subtotal + total tax)")
  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }

  public Prepayment updatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * UTC timestamp of last update to the prepayment
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to the prepayment")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public Prepayment currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency used for the prepayment
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Currency used for the prepayment")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Prepayment prepaymentID(UUID prepaymentID) {
    this.prepaymentID = prepaymentID;
    return this;
  }

   /**
   * Xero generated unique identifier
   * @return prepaymentID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier")
  public UUID getPrepaymentID() {
    return prepaymentID;
  }

  public void setPrepaymentID(UUID prepaymentID) {
    this.prepaymentID = prepaymentID;
  }

  public Prepayment currencyRate(Float currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com day rate is used
   * @return currencyRate
  **/
  @ApiModelProperty(value = "The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com day rate is used")
  public Float getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Float currencyRate) {
    this.currencyRate = currencyRate;
  }

  public Prepayment remainingCredit(String remainingCredit) {
    this.remainingCredit = remainingCredit;
    return this;
  }

   /**
   * The remaining credit balance on the prepayment
   * @return remainingCredit
  **/
  @ApiModelProperty(value = "The remaining credit balance on the prepayment")
  public String getRemainingCredit() {
    return remainingCredit;
  }

  public void setRemainingCredit(String remainingCredit) {
    this.remainingCredit = remainingCredit;
  }

  public Prepayment allocations(List<Allocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  public Prepayment addAllocationsItem(Allocation allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<Allocation>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * See Allocations
   * @return allocations
  **/
  @ApiModelProperty(value = "See Allocations")
  public List<Allocation> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<Allocation> allocations) {
    this.allocations = allocations;
  }

  public Prepayment hasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
    return this;
  }

   /**
   * boolean to indicate if a prepayment has an attachment
   * @return hasAttachments
  **/
  @ApiModelProperty(value = "boolean to indicate if a prepayment has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  public void setHasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prepayment prepayment = (Prepayment) o;
    return Objects.equals(this.type, prepayment.type) &&
        Objects.equals(this.contact, prepayment.contact) &&
        Objects.equals(this.date, prepayment.date) &&
        Objects.equals(this.status, prepayment.status) &&
        Objects.equals(this.lineAmountTypes, prepayment.lineAmountTypes) &&
        Objects.equals(this.lineItems, prepayment.lineItems) &&
        Objects.equals(this.subTotal, prepayment.subTotal) &&
        Objects.equals(this.totalTax, prepayment.totalTax) &&
        Objects.equals(this.total, prepayment.total) &&
        Objects.equals(this.updatedDateUTC, prepayment.updatedDateUTC) &&
        Objects.equals(this.currencyCode, prepayment.currencyCode) &&
        Objects.equals(this.prepaymentID, prepayment.prepaymentID) &&
        Objects.equals(this.currencyRate, prepayment.currencyRate) &&
        Objects.equals(this.remainingCredit, prepayment.remainingCredit) &&
        Objects.equals(this.allocations, prepayment.allocations) &&
        Objects.equals(this.hasAttachments, prepayment.hasAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, contact, date, status, lineAmountTypes, lineItems, subTotal, totalTax, total, updatedDateUTC, currencyCode, prepaymentID, currencyRate, remainingCredit, allocations, hasAttachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prepayment {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    prepaymentID: ").append(toIndentedString(prepaymentID)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    remainingCredit: ").append(toIndentedString(remainingCredit)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
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

