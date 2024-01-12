package com.learnkafka.libraryeventproducer.domain;

public record LibraryEvent(
    Integer libraryEventId,
    LibraryEventType libraryEventType,
    Book book
    ){
}
