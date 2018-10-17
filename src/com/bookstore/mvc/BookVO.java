package com.bookstore.mvc;

import java.sql.Blob;

/*
 * Book Value Object
 */
public class BookVO {
	private Integer book_id;
	private String title;
	private String author_id;
	private String category_id;
	private Blob cover;
	private String review;
	private Integer price=0;
	private Integer no_of_copies_current=0;
	private Integer shelf_id;
	
	BookVO(){
		
	}
	
	BookVO(String title){
		this.title=title;
	}
	
	public Integer getBookId() {
		return book_id;
	}
	public void setBookId(Integer book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorId() {
		return author_id;
	}
	public void setAuthorId(String author_id) {
		this.author_id = author_id;
	}
	public String getCategoryId() {
		return category_id;
	}
	public void setCategoryId(String category_id) {
		this.category_id = category_id;
	}
	public Blob getCover() {
		return cover;
	}
	public void setCover(Blob cover) {
		this.cover = cover;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNoOfCopiesCurrent() {
		return no_of_copies_current;
	}
	public void setNoOfCopiesCurrent(Integer no_of_copies_current) {
		this.no_of_copies_current = no_of_copies_current;
	}
	public Integer getShelfId() {
		return shelf_id;
	}
	public void setShelfId(Integer shelf_id) {
		this.shelf_id = shelf_id;
	}
}
