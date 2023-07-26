package gourmetGame.classes;

import gourmetGame.utils.DialogUtil;

public class Food extends Node {

    public Feature parentFeature;

    public Food(String name) {
        super(name);
    }

    public Feature getParentFeature() {
        return parentFeature;
    }

    public void setParentFeature(Feature parentFeature) {
        this.parentFeature = parentFeature;
    }

    @Override
    public Node answerYes() {
        return null;
    }

    @Override
    public Node answerNo() {
        return null;
    }

    @Override
    public String askQuestion() {
        return "Já sei! O prato que você pensou é " + getName() + "! Acertei?";
    }
}
