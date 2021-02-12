package com.ecquiti.pocspringoauth2.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface CrudMethods<T, J> {
    ResponseEntity<List<T>> getAll();
    ResponseEntity<T> getById(Long id);

    ResponseEntity<T> create(J dtoJ);

    ResponseEntity<T> update(Long id, J dtoJ);

    ResponseEntity<Void> delete(Long id);
}
