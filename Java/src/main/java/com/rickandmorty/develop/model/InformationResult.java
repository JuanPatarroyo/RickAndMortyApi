package com.rickandmorty.develop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InformationResult {
    private int count;
    private int pages;
    private String next;
    private String prev;
}
