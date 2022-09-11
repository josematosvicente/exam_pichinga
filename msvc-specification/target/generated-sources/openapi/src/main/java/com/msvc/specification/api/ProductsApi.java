/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.msvc.specification.api;

import com.msvc.specification.api.dto.ErrorDto;
import com.msvc.specification.api.dto.NewProductDto;
import com.msvc.specification.api.dto.ProductDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-11T14:19:53.759916-05:00[America/Bogota]")
@Validated
@Api(value = "products", description = "the products API")
public interface ProductsApi {

    /**
     * POST /products : Creates a new product in the bank.  Duplicates are not allowed
     * Creates a new product in the bank.  Duplicates are not allowed
     *
     * @param newProductDto Product to add to the store (required)
     * @return product response (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Creates a new product in the bank.  Duplicates are not allowed", nickname = "addProduct", notes = "Creates a new product in the bank.  Duplicates are not allowed", response = ProductDto.class, tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "product response", response = ProductDto.class),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/products",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    Mono<ResponseEntity<ProductDto>> addProduct(@ApiParam(value = "Product to add to the store", required = true) @Valid @RequestBody Mono<NewProductDto> newProductDto, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


    /**
     * DELETE /products/{id} : deletes a single product based on the ID supplied
     * deletes a single product based on the ID supplied
     *
     * @param id ID of product to delete (required)
     * @return product deleted (status code 204)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "deletes a single product based on the ID supplied", nickname = "deleteProduct", notes = "deletes a single product based on the ID supplied", tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "product deleted"),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/products/{id}",
        produces = { "application/json" }
    )
    Mono<ResponseEntity<Void>> deleteProduct(@ApiParam(value = "ID of product to delete", required = true) @PathVariable("id") String id, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


    /**
     * GET /products/{id} : Returns a product based on a single ID
     * Returns a product based on a single ID
     *
     * @param id ID of product to fetch (required)
     * @return product response (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Returns a product based on a single ID", nickname = "findProductById", notes = "Returns a product based on a single ID", response = ProductDto.class, tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "product response", response = ProductDto.class),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/products/{id}",
        produces = { "application/json" }
    )
    Mono<ResponseEntity<ProductDto>> findProductById(@ApiParam(value = "ID of product to fetch", required = true) @PathVariable("id") String id, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


    /**
     * GET /products : Returns all products from the system that the user has access to
     * Returns all products from the system that the user has access to
     *
     * @return Product response (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Returns all products from the system that the user has access to", nickname = "findProducts", notes = "Returns all products from the system that the user has access to", response = ProductDto.class, responseContainer = "List", tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product response", response = ProductDto.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/products",
        produces = { "application/json" }
    )
    Mono<ResponseEntity<Flux<ProductDto>>> findProducts(@springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


    /**
     * PUT /products/{id} : Update product
     * This can only be done by the logged in product.
     *
     * @param id ID of product to fetch (required)
     * @param newProductDto Update an existent product (optional)
     * @return Invalid ID supplied (status code 400)
     *         or Product not found (status code 404)
     *         or Validation exception (status code 405)
     *         or successful operation (status code 200)
     */
    @ApiOperation(value = "Update product", nickname = "updateProduct", notes = "This can only be done by the logged in product.", response = ProductDto.class, tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Product not found"),
        @ApiResponse(code = 405, message = "Validation exception"),
        @ApiResponse(code = 200, message = "successful operation", response = ProductDto.class) })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/products/{id}",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    Mono<ResponseEntity<ProductDto>> updateProduct(@ApiParam(value = "ID of product to fetch", required = true) @PathVariable("id") String id,@ApiParam(value = "Update an existent product") @Valid @RequestBody(required = false) Mono<NewProductDto> newProductDto, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);

}
