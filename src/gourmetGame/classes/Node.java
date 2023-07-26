package gourmetGame.classes;

import gourmetGame.interfaces.Answerable;

public abstract class Node implements Answerable {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String askQuestion();
}
