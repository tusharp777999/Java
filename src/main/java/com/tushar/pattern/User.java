package com.tushar.pattern;

public class User {
    private final int id;
    private final String name;

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
    }

    public static class UserBuilder {
        private int id;
        private String name;

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
