package ru.lysanov.homework29;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Scope("session")
public interface ShoppingBasketService {

    void addItem(List<Integer> Items);

    String getItems();
}
