package com.bootcamp.springwebflux.msvcproduct.models.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * NewProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-05T11:02:22.008782100-05:00[America/Bogota]")
public class NewProductDTO {
  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("category")
  private String category;

  @JsonProperty("commission")
  private BigDecimal commission;

  @JsonProperty("limitDeposit")
  private BigDecimal limitDeposit;

  @JsonProperty("limitWithdrawal")
  private BigDecimal limitWithdrawal;

  @JsonProperty("line")
  private BigDecimal line;

  public NewProductDTO name(String name) {
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

  public NewProductDTO type(String type) {
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

  public NewProductDTO category(String category) {
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

  public NewProductDTO commission(BigDecimal commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Get commission
   * @return commission
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCommission() {
    return commission;
  }

  public void setCommission(BigDecimal commission) {
    this.commission = commission;
  }

  public NewProductDTO limitDeposit(BigDecimal limitDeposit) {
    this.limitDeposit = limitDeposit;
    return this;
  }

  /**
   * Get limitDeposit
   * @return limitDeposit
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLimitDeposit() {
    return limitDeposit;
  }

  public void setLimitDeposit(BigDecimal limitDeposit) {
    this.limitDeposit = limitDeposit;
  }

  public NewProductDTO limitWithdrawal(BigDecimal limitWithdrawal) {
    this.limitWithdrawal = limitWithdrawal;
    return this;
  }

  /**
   * Get limitWithdrawal
   * @return limitWithdrawal
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLimitWithdrawal() {
    return limitWithdrawal;
  }

  public void setLimitWithdrawal(BigDecimal limitWithdrawal) {
    this.limitWithdrawal = limitWithdrawal;
  }

  public NewProductDTO line(BigDecimal line) {
    this.line = line;
    return this;
  }

  /**
   * Get line
   * @return line
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLine() {
    return line;
  }

  public void setLine(BigDecimal line) {
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
    NewProductDTO newProduct = (NewProductDTO) o;
    return Objects.equals(this.name, newProduct.name) &&
        Objects.equals(this.type, newProduct.type) &&
        Objects.equals(this.category, newProduct.category) &&
        Objects.equals(this.commission, newProduct.commission) &&
        Objects.equals(this.limitDeposit, newProduct.limitDeposit) &&
        Objects.equals(this.limitWithdrawal, newProduct.limitWithdrawal) &&
        Objects.equals(this.line, newProduct.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, category, commission, limitDeposit, limitWithdrawal, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewProduct {\n");
    
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
