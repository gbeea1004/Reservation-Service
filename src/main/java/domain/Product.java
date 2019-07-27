package domain;

import dto.ProductDto;

public class Product {
    private int displayInfoId;
    private String placeName;
    private String productContent;
    private String productDescription;
    private int productId;
    private String productImageUrl;


    public ProductDto _toProductDto() {
        return new ProductDto();
    }
}
