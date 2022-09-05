package com.msvc.specification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.msvc.specification.api.dto.ClientDtoAllOf;
import com.msvc.specification.api.dto.NewProductDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-05T15:04:05.966879900-05:00[America/Bogota]")
public class ProductDto   {
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

  @JsonProperty("id")
  private String id;

  public ProductDto name(String name) {
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

  public ProductDto type(String type) {
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

  public ProductDto category(String category) {
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

  public ProductDto commission(BigDecimal commission) {
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

  public ProductDto limitDeposit(BigDecimal limitDeposit) {
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

  public ProductDto limitWithdrawal(BigDecimal limitWithdrawal) {
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

  public ProductDto line(BigDecimal line) {
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

  public ProductDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDto productDto = (ProductDto) o;
    return Objects.equals(this.name, productDto.name) &&
        Objects.equals(this.type, productDto.type) &&
        Objects.equals(this.category, productDto.category) &&
        Objects.equals(this.commission, productDto.commission) &&
        Objects.equals(this.limitDeposit, productDto.limitDeposit) &&
        Objects.equals(this.limitWithdrawal, productDto.limitWithdrawal) &&
        Objects.equals(this.line, productDto.line) &&
        Objects.equals(this.id, productDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, category, commission, limitDeposit, limitWithdrawal, line, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    limitDeposit: ").append(toIndentedString(limitDeposit)).append("\n");
    sb.append("    limitWithdrawal: ").append(toIndentedString(limitWithdrawal)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

