package com.nubiform.java.builder;

public class Card {

    private final String card;

    private final String expiration;

    private final String cvc;

    public String getCard() {
        return card;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getCvc() {
        return cvc;
    }

    private Card(Builder builder) {
        this.card = builder.card;
        this.expiration = builder.expiration;
        this.cvc = builder.cvc;
    }

    public static Builder builder() {
        return new Card.Builder();
    }

    public static class Builder {

        private String card;

        private String expiration;

        private String cvc;

        public Card build() {
            return new Card(this);
        }

        public Builder card(String card) {
            this.card = card;
            return this;
        }

        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder cvc(String cvc) {
            this.cvc = cvc;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "card='" + card + '\'' +
                ", expiration='" + expiration + '\'' +
                ", cvc='" + cvc + '\'' +
                '}';
    }
}
