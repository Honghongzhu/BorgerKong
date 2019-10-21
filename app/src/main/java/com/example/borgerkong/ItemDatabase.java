package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ItemDatabase {
    private static final HashMap<Integer, Item> items = new HashMap<>();

    public static Item getItemById(String itemID){
        return items.get(itemID);
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Item> getAllItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }

    static {
        items.put(1, new Item(
                1,
                "Bopper",
                4.19,
                "The Bopper has a flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.",
                 R.drawable.bopper
        ));
        items.put(2, new Item(
                2,
                "Bopper Jr.",
                2.19,
                "The Bopper Jr. features one savory flame-grilled beef patty topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.",
                R.drawable.bopperjr
        ));
        items.put(3, new Item(
                3,
                "Cheeseburger",
                3.89,
                "You can’t go wrong with our cheeseburger, a signature flame-grilled. beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                R.drawable.cheeseburger
        ));
        items.put(4, new Item(
                4,
                "Chicken Club Salad",
                5.59,
                "It is a mix of crisp green romaine, green leaf and radicchio lettuce, juicy-ripened tomatoes, buttery garlic croutons, and shredded cheddar cheese.",
                R.drawable.chickenClubSalad
        ));
        items.put(5, new Item(
                5,
                "Chicken Nuggets",
                4.99,
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.",
                R.drawable.chickenNuggets
        ));
        items.put(6, new Item(
                6,
                "Coca Cola",
                2.39,
                "Perfect with any meal, enjoy the genuine taste of Coca-Cola®.",
                R.drawable.cocaCola
        ));
        items.put(7, new Item(
                7,
                "Coffee",
                1.59,
                "Our Coffee blend is made with 100% Arabica beans and freshly brewed to deliver perfectly balanced flavor in every cup.",
                R.drawable.coffee
        ));
        items.put(8, new Item(
                8,
                "Crispy Chicken",
                1.00,
                "Our New Crispy Sandwich is made with 100% white meat chicken filet, seasoned and breaded and carefully layered with fresh lettuce, ripe tomato, and creamy mayonnaise on a potato bun.",
                R.drawable.crispyChicken
        ));
        items.put(9, new Item(
                9,
                "French Fries",
                2.19,
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.",
                R.drawable.frenchFries
        ));
        items.put(10, new Item(
                10,
                "Frozen Coke",
                1.99,
                "Cool down with a Frozen Coke® any time of the year.",
                R.drawable.frozenCoke
        ));
        items.put(11, new Item(
                11,
                "Hamburger",
                1.00,
                "Try our Hamburger, a signature flame-grilled. beef patty topped with a simple layer of crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                R.drawable.hamburger
        ));
        items.put(12, new Item(
                12,
                "Hash Browns",
                1.69,
                "Make your morning sizzle with a small side of our signature crunchy, golden Hash Browns.",
                R.drawable.hashbrowns
        ));
    }
}
