package com.erik.cookie.model;


public class Greetings {
    private long timestamp;
    private String message;

    Greetings(long timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    Greetings() {
        this.timestamp = 0;
        this.message = "";
    }
    public static GreetingsBuilder builder() {
        return new GreetingsBuilder();
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "Greetings(timestamp=" + this.getTimestamp() + ", message=" + this.getMessage() + ")";
    }

    public static class GreetingsBuilder {
        private long timestamp;
        private String message;

        GreetingsBuilder() {
        }

        public GreetingsBuilder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public GreetingsBuilder message(String message) {
            this.message = message;
            return this;
        }

        public Greetings build() {
            return new Greetings(timestamp, message);
        }

        public String toString() {
            return "Greetings.GreetingsBuilder(timestamp=" + this.timestamp + ", message=" + this.message + ")";
        }
    }
}