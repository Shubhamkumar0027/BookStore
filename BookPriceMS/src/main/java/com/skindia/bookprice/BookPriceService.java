package com.skindia.bookprice;

public interface BookPriceService {
public BookPrice getBookPriceById(Integer bookId);
public double getOfferedPriceById(Integer bookId);
}