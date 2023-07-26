package gourmetGame.utils;

import javax.swing.*;

public class DialogUtil {

    public static void callConfirmDialog(String message) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "JogoGourmet",
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int callDialogAskingYesOrNoQuestion(String message) {
        String[] options = { "Sim", "Não" };

        return JOptionPane.showOptionDialog(
                null,
                message,
                "JogoGourmet",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                null
        );
    }

    public static String callDialogAskingInput(String message, String title) {

        return JOptionPane.showInputDialog(
                null,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE
        );
    }
}
