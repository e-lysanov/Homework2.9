package ru.lysanov.homework29;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RequestMapping(path = "/order")
@RestController
@Scope("session")
public class Controller {

    private final ShoppingBasketService shoppingBasketService;

    public Controller(ShoppingBasketService shoppingBasketService) { this.shoppingBasketService = shoppingBasketService; }

    @GetMapping(path = "/add")
    public void addItem(@RequestParam("ID") List<Integer> Items) {
        shoppingBasketService.addItem(Items);
    }

    @GetMapping(path = "/get")
    public String getItems() {
        return shoppingBasketService.getItems();
    }
}
