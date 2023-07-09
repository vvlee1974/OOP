package org.example.lesson4.classwork.ex401;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GenBox<T> {
    T obj;
}
