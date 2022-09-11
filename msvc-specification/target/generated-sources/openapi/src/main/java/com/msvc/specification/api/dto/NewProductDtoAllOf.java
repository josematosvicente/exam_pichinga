package com.msvc.specification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewProductDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-11T18:11:59.095922700-05:00[America/Lima]")
public class NewProductDtoAllOf   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("category")
  private String category;

  @JsonProperty("commission")
  private Double commission;

  @JsonProperty("limitDeposit")
  private Double limitDeposit;

  @JsonProperty("limitWithdrawal")
  private Double limitWithdrawal;

  @JsonProperty("line")
  private Double line;

  public NewProductDtoAllOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewProductDtoAllOf type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NewProductDtoAllOf category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public NewProductDtoAllOf commission(Double commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Get commission
   * @return commission
  */
  @ApiModelProperty(value = "")


  public Double getCommission() {
    return commission;
  }

  public void setCommission(Double commission) {
    this.commission = commission;
  }

  public NewProductDtoAllOf limitDeposit(Double limitDeposit) {
    this.limitDeposit = limitDeposit;
    return this;
  }

  /**
   * Get limitDeposit
   * @return limitDeposit
  */
  @ApiModelProperty(value = "")


  public Double getLimitDeposit() {
    return limitDeposit;
  }

  public void setLimitDeposit(Double limitDeposit) {
    this.limitDeposit = limitDeposit;
  }

  public NewProductDtoAllOf limitWithdrawal(Double limitWithdrawal) {
    this.limitWithdrawal = limitWithdrawal;
    return this;
  }

  /**
   * Get limitWithdrawal
   * @return limitWithdrawal
  */
  @ApiModelProperty(value = "")


  public Double getLimitWithdrawal() {
    return limitWithdrawal;
  }

  public void setLimitWithdrawal(Double limitWithdrawal) {
    this.limitWithdrawal = limitWithdrawal;
  }

  public NewProductDtoAllOf line(Double line) {
    this.line = line;
    return this;
  }

  /**
   * Get line
   * @return line
  */
  @ApiModelProperty(value = "")


  public Double getLine() {
    return line;
  }

  public void setLine(Double line) {
    this.line = line;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewProductDtoAllOf newProductDtoAllOf = (NewProductDtoAllOf) o;
    return Objects.equals(this.name, newProductDtoAllOf.name) &&
        Objects.equals(this.type, newProductDtoAllOf.type) &&
        Objects.equals(this.category, newProductDtoAllOf.category) &&
        Objects.equals(this.commission, newProductDtoAllOf.commission) &&
        Objects.equals(this.limitDeposit, newProductDtoAllOf.limitDeposit) &&
        Objects.equals(this.limitWithdrawal, newProductDtoAllOf.limitWithdrawal) &&
        Objects.equals(this.line, newProductDtoAllOf.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, category, commission, limitDeposit, limitWithdrawal, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewProductDtoAllOf {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    limitDeposit: ").append(toIndentedString(limitDeposit)).append("\n");
    sb.append("    limitWithdrawal: ").append(toIndentedString(limitWithdrawal)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

