package ru.lysanov.homework29;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Scope("prototype")
public class ShoppingBasketServiceImpl implements ShoppingBasketService {

//    Set<Integer> ShoppingBasket = new HashSet<>();
    List<List<Integer>> ShoppingBasket = new ArrayList<>();

    @Override
    public void addItem(List<Integer> Items) {
        ShoppingBasket.add(Items);
    }

    @Override
    public String getItems() {
        System.out.println(ShoppingBasket.toString());
        return ShoppingBasket.toString();
    }
}
