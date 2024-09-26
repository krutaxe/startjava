package com.startjava.lesson_2_3_4.bookshelf;

public enum MenuItem {
    ADD(1),
    FIND(2),
    DELETE(3),
    CLEAR(4),
    EXIT(5);

    private final int value;

    MenuItem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MenuItem fromValue(int value) {
        for (MenuItem item : MenuItem.values()) {
            if (item.getValue() == value) {
                return item;
            }
        }
        return null;
    }
}
