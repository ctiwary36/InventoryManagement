package com.inventory;

public class Item {


        private String name;
        private double weight;
        private double price;
        private double value= weight*price;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getWeight() {
            return weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
    public double getValue() {
        return weight;
    }
    public void setValue(double weight) {
        this.weight = weight;
    }
        @Override
        public String toString() {
            return "Inventory [name=" + name + ", weight=" + weight + ", price=" + price + "]";
        }
        public Item(String name, double weight, double price) {
            super();
            this.name = name;
            this.weight = weight;
            this.price = price;

        }




    }

