package gourmetGame.classes;

import gourmetGame.utils.DialogUtil;

public class Game {

    private final Node rootNode = new Feature("salgado");
    private Node visitingNode;
    private Node lastNode;
    private Boolean lastAnswer;

    private Boolean exit = Boolean.FALSE;

    public void newGame() {
        Food negativeAnswer = new Food("bolo de chocolate");
        negativeAnswer.setParentFeature((Feature) rootNode);

        Food positiveAnswer = new Food("lasanha a bolonhesa");
        positiveAnswer.setParentFeature((Feature) rootNode);

        ((Feature) rootNode).setPositiveAnswer(positiveAnswer);
        ((Feature) rootNode).setNegativeAnswer(negativeAnswer);

        startGame();
    }

    private void startGame() {
        visitingNode = rootNode;

        DialogUtil.callConfirmDialog("Pense em um prato!");

        playGame();
    }

    private void playGame() {

        int option;

        while (visitingNode != null && !exit) {
            option = DialogUtil.callDialogAskingYesOrNoQuestion(visitingNode.askQuestion());
            exit = option == -1;
            lastAnswer = option == 0;

            lastNode = visitingNode;

            visitingNode = lastAnswer ?
                    visitingNode.answerYes() :
                    visitingNode.answerNo();
        }
        endGame();
    }

    private void endGame() {

        if (lastAnswer) {
            DialogUtil.callConfirmDialog("Acertei de novo!");
        } else if (!exit) {
            String newFoodName = DialogUtil.callDialogAskingInput(
                    "Então, qual é este prato?",
                    "Desisto"
            );
            Food newFood = new Food(newFoodName);

            String newFeatureName = DialogUtil.callDialogAskingInput(
                    "E no que " + newFoodName + " é diferente de " + lastNode.getName() + "?",
                    "Responda"
            );
            Feature newFeature = new Feature(newFeatureName);

            Feature lastFeature = ((Food) lastNode).getParentFeature();
            newFood.setParentFeature(newFeature);
            newFeature.setPositiveAnswer(newFood);
            newFeature.setNegativeAnswer(lastFeature.getPositiveAnswer());
            lastFeature.setNegativeAnswer(newFeature);
            ((Food) lastNode).setParentFeature(newFeature);
        }

        if (!exit) {
            DialogUtil.callConfirmDialog("Deixe eu tentar novamente!");
            startGame();
        }
    }
}
