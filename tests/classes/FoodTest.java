package classes;

import gourmetGame.classes.Food;
import org.junit.Assert;
import org.junit.Test;

public class FoodTest {

    @Test
    public void answerYes() {
        Food food = new Food("test");

        Assert.assertNull(food.answerYes());
    }

    @Test
    public void answerNo() {
        Food food = new Food("test");

        Assert.assertNull(food.answerNo());
    }

    @Test
    public void askQuestion() {
        String foodName = "test";
        Food food = new Food(foodName);

        Assert.assertTrue(
                food.askQuestion().contains(food.getName()) &&
                        food.askQuestion().contains("?") &&
                        foodName.equals(food.getName())
        );
    }
}
