package com.staticclass.simplestaticclass;

public class OuterClass {
    private static int outerData = 10;
    public static class NestedClass {
        private int nestedData = 30;

        public void displayData() {
            System.out.println("Outer data: " + outerData);
            System.out.println("Nested data: " + nestedData);
        }
    }

    public static void main(String[] args) {
        OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();
        nestedObj.displayData();
    }
}

