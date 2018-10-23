package com.bookstore.mvc;

import java.sql.SQLException;
import java.util.ArrayList;

public class TestFeatures {

	public static void main(String[] args) throws SQLException {
		
		ArrayList<BookVO> searchResult = new ArrayList<BookVO>();
		BookModel bmd = new BookModel();
		searchResult = bmd.searchByAuthor("Tony");
		if (searchResult!=null) {
		for (int i=0; i<searchResult.size();++i) {
			BookVO b = searchResult.get(i);
			System.out.println("************************************************");
			System.out.println("Book ID: " + b.getBookId());
			System.out.println("Title: "+b.getTitle());
			System.out.println("************************************************");
		}
		} else {
			System.out.println("Search Result Null");
		}
	}

}
