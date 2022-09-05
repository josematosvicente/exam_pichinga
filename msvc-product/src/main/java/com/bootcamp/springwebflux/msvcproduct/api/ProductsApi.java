/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bootcamp.springwebflux.msvcproduct.api;

import com.bootcamp.springwebflux.msvcproduct.models.DTO.NewProductDTO;
import com.bootcamp.springwebflux.msvcproduct.models.DTO.ProductDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-05T11:02:22.008782100-05:00[America/Bogota]")
@Validated
@Api(value = "products", description = "the products API")
public interface ProductsApi {

    /**
     * POST /products : Creates a new product in the store.  Duplicates are not allowed
     * Creates a new product in the store.  Duplicates are not allowed
     *
     * @param newProduct Product to add to the store (required)
     * @return product response (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Creates a new product in the store.  Duplicates are not allowed", nickname = "addProduct", notes = "Creates a new product in the store.  Duplicates are not allowed", response = ProductDTO.class, tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "product response", response = ProductDTO.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/products",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    Mono<ResponseEntity<ProductDTO>> addProduct(@ApiParam(value = "Product to add to the store", required = true) @Valid @RequestBody Mono<NewProductDTO> newProduct, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


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
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/products/{id}",
        produces = { "application/json" }
    )
    Mono<ResponseEntity<Void>> deleteProduct(@ApiParam(value = "ID of product to delete", required = true) @PathVariable("id") Long id, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


    /**
     * GET /products/{id} : Returns a product based on a single ID
     * Returns a product based on a single ID
     *
     * @param id ID of product to fetch (required)
     * @return product response (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Returns a product based on a single ID", nickname = "findProductById", notes = "Returns a product based on a single ID", response = ProductDTO.class, tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "product response", response = ProductDTO.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/products/{id}",
        produces = { "application/json" }
    )
    Mono<ResponseEntity<ProductDTO>> findProductById(@ApiParam(value = "ID of product to fetch", required = true) @PathVariable("id") Long id, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


    /**
     * GET /products : Returns all products from the system that the user has access to
     * Returns all products from the system that the user has access to
     *
     * @return Product response (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Returns all products from the system that the user has access to", nickname = "findProducts", notes = "Returns all products from the system that the user has access to", response = ProductDTO.class, responseContainer = "List", tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product response", response = ProductDTO.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/products",
        produces = { "application/json" }
    )
    Mono<ResponseEntity<Flux<ProductDTO>>> findProducts(@springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);


    /**
     * PUT /products/{id} : Update product
     * This can only be done by the logged in product.
     *
     * @param id ID of product to fetch (required)
     * @param product Update an existent product (optional)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Update product", nickname = "updateProduct", notes = "This can only be done by the logged in product.", tags={ "PRODUCT", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/products/{id}",
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    Mono<ResponseEntity<Void>> updateProduct(@ApiParam(value = "ID of product to fetch", required = true) @PathVariable("id") String id,@ApiParam(value = "Update an existent product") @Valid @RequestBody(required = false) Mono<ProductDTO> product, @springfox.documentation.annotations.ApiIgnore final ServerWebExchange exchange);

}