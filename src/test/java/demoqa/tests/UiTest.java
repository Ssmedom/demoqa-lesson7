package demoqa.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UI")
public class UiTest {

    @Test
    public void test1(){
        Assertions.assertTrue(2 < 4);
    }
}
