package com.test;

public class PolicyTest {
    public static void main(String[] args) {
        Policy[] policies = {
                new Policy("Smith", "Internal"),
                new Policy("Doe", "External"),
                new Policy("John", "Internal")
        };

        for (Policy policy : policies) {
            if(policy.getType().equals("Internal")) {
                System.out.println(policy.name);
            }
        }
    }
}

class Policy {
    String name, type;

    public Policy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}