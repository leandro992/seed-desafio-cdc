package com.deveficiente.mapper.dto;


import com.deveficiente.entity.Book;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class DetalheLivroResponse {

    private String title;
    private DetalheLivroSiteAuthorResponse author;
    private BigDecimal price;
    private String resume;
    private Integer numberPage;
    private String summary;
    private String isbn;


   public DetalheLivroResponse(Book book){
       title = book.getTitle();
       author = new DetalheLivroSiteAuthorResponse(book.getAuthor());
       isbn = book.getIsbn();
       numberPage = book.getNumberPages();
       price = book.getPrice();
       resume = book.getResume();
       summary = book.getSummary();
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DetalheLivroSiteAuthorResponse getAuthor() {
        return author;
    }

    public void setAuthor(DetalheLivroSiteAuthorResponse author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Integer getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(Integer numberPage) {
        this.numberPage = numberPage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
