package gourmetGame.classes;

public class Feature extends Node {

    private Node positiveAnswer;
    private Node negativeAnswer;

    public Feature(String name) {
        super(name);
    }

    @Override
    public Node answerYes() {
        return positiveAnswer;
    }

    @Override
    public Node answerNo() {
        return negativeAnswer;
    }

    public Node getPositiveAnswer() {
        return positiveAnswer;
    }

    public void setPositiveAnswer(Node positiveAnswer) {
        this.positiveAnswer = positiveAnswer;
    }

    public Node getNegativeAnswer() {
        return negativeAnswer;
    }

    public void setNegativeAnswer(Node negativeAnswer) {
        this.negativeAnswer = negativeAnswer;
    }

    @Override
    public String askQuestion() {
        return "O prato que você pensou é " + getName() + "?";
    }
}
