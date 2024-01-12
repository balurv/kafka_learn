package com.learnkafka.libraryeventproducer.domain;

public record Book(
    Integer bookId,
    String bookName,
    String bookAuthor) {
}
