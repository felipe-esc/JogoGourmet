package classes;

import gourmetGame.classes.Feature;
import gourmetGame.classes.Food;
import org.junit.Assert;
import org.junit.Test;

public class FeatureTest {

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
        String featureName = "test";
        Feature feature = new Feature(featureName);

        Assert.assertTrue(
                feature.askQuestion().contains(feature.getName()) &&
                        feature.askQuestion().contains("?") &&
                        featureName.equals(feature.getName())
        );
    }
}
