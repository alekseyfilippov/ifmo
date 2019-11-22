package com.ifmo.lesson17.Builder;

public class Pizza {
    final String dough;
    final String cheese;
    final int ketchup;
    final int tomatoes;
    final int pepperoni;

    public static class Builder {
        private final String dough;
        private final String cheese;
        private int ketchup = 0;
        private int tomatoes = 0;
        private int pepperoni = 0;

        public Builder(String dough, String cheese) {
            this.dough = dough;
            this.cheese = cheese;
        }

        public Builder ketchup(int ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public Builder tomatoes(int tomatoes) {
            this.tomatoes = tomatoes;
            return this;
        }

        public Builder pepperoni(int pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        dough = builder.dough;
        cheese = builder.cheese;
        ketchup = builder.ketchup;
        tomatoes = builder.tomatoes;
        pepperoni = builder.pepperoni;
    }
    @Override
    public String toString(){
        return "Пицца\nТесто: " +dough + "\nСыр: " + cheese + "\nкетчуп: " + ketchup + "\nпомидоры: " + tomatoes + "\nпапперони: " +pepperoni;
    }

}
