package ioprogramming.designpatterns;

class BuilderUser {
    private String name;
    private int age;

    private BuilderUser(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) { this.name = name; return this; }
        public Builder setAge(int age) { this.age = age; return this; }
        public BuilderUser build() { return new BuilderUser(this); }
    }

    public String toString() { return name + " " + age; }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        BuilderUser user = new BuilderUser.Builder()
                .setName("User")
                .setAge(20)
                .build();
        System.out.println(user);
    }
}