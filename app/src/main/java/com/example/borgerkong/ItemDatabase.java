package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ItemDatabase {
    private static final HashMap<Integer, Item> items = new HashMap<>();

    public static Item getItemById(int itemID){
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
                6.20,
                "The Bopper has a flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.",
                 R.drawable.bopper
        ));
        items.put(2, new Item(
                2,
                "Bopper Jr.",
                5.00,
                "The Bopper Jr. features one savory flame-grilled beef patty topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.",
                R.drawable.bopperjr
        ));
        items.put(3, new Item(
                3,
                "Cheeseburger",
                3.35,
                "You can’t go wrong with our cheeseburger, a signature flame-grilled. beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                R.drawable.cheeseburger
        ));
        items.put(4, new Item(
                4,
                "Chicken Club Salad",
                5.59,
                "It is a mix of crisp green romaine, green leaf and radicchio lettuce, juicy-ripened tomatoes, buttery garlic croutons, and shredded cheddar cheese.",
                R.drawable.chicken_club_salad
        ));
        items.put(5, new Item(
                5,
                "Chicken Nuggets",
                4.50,
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.",
                R.drawable.chicken_nuggets
        ));
        items.put(6, new Item(
                6,
                "Coca Cola",
                3.20,
                "Perfect with any meal, enjoy the genuine taste of Coca-Cola®.",
                R.drawable.coca_cola
        ));
        items.put(7, new Item(
                7,
                "Coffee",
                3.45,
                "Our Coffee blend is made with 100% Arabica beans and freshly brewed to deliver perfectly balanced flavor in every cup.",
                R.drawable.coffee
        ));
        items.put(8, new Item(
                8,
                "Crispy Chicken",
                1.00,
                "Our New Crispy Sandwich is made with 100% white meat chicken filet, seasoned and breaded and carefully layered with fresh lettuce, ripe tomato, and creamy mayonnaise on a potato bun.",
                R.drawable.crispy_chicken
        ));
        items.put(9, new Item(
                9,
                "French Fries",
                2.19,
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.",
                R.drawable.french_fries
        ));
        items.put(10, new Item(
                10,
                "Frozen Coke",
                2.95,
                "Cool down with a Frozen Coke® any time of the year.",
                R.drawable.frozen_coke
        ));
        items.put(11, new Item(
                11,
                "Hamburger",
                3.95,
                "Try our Hamburger, a signature flame-grilled. beef patty topped with a simple layer of crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                R.drawable.hamburger
        ));
        items.put(12, new Item(
                12,
                "Hash Browns",
                4.00,
                "Make your morning sizzle with a small side of our signature crunchy, golden Hash Browns.",
                R.drawable.hashbrowns
        ));
        items.put(13, new Item(
                13,
                "Iced Tea",
                3.20,
                "Brewed fresh daily, our Iced Tea pairs seamlessly with many menu favorites. Also available in unsweetened iced tea.",
                R.drawable.iced_tea
        ));
        items.put(14, new Item(
                14,
                "Mozzarella Sticks",
                3.95,
                "Mozzarella cheese coated in an Italian-style seasoned breading, fried crispy until golden brown and served hot and melty with a marinara dipping sauce.",
                R.drawable.mozzarella_sticks
        ));
        items.put(15, new Item(
                15,
                "Onion Rings",
                3.70,
                "Served hot and crispy, our golden Onion Rings are the perfect treat for plunging into one of our bold or classic sauces.",
                R.drawable.onion_rings
        ));
        items.put(16, new Item(
                16,
                "Sprite",
                3.20,
                "Let Sprite® refresh your day with the great taste of lemon-lime.",
                R.drawable.sprite
        ));
        items.put(17, new Item(
                17,
                "Vanilla Soft Serve",
                0.60,
                "We didn’t invent soft serve, but with one taste of our cool, creamy, and velvety Vanilla Soft Serve, you’ll think we perfected it. Your choice of classic cone or cup.",
                R.drawable.vanilla_soft_serve
        ));
    }
}
