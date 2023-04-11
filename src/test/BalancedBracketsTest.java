package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void leadingClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void extraOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][[]]["));
    }
    @Test
    public void wrongOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }

    @Test
    public void nestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[]]]]]]"));
    }

    @Test
    public void balancedBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[H]ello!"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L(a)unch{Code}]"));
    }

    @Test
    public void nestedBalancedBracketsWithTestReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hell[o to Y[ou] and ] yours] Joe"));
    }

    @Test
    public void longStringWithLineBreaksAndBalancedBracketsReturnsTrue() {
        String testString = "[For this studio, you will be writing unit tests to help you find errors in provided code.\n" +
                "\n" +
                "6.4.1. Getting Started\n" +
                "Fork the studio repository.\n" +
                "\n" +
                "In IntelliJ, check out your forked repository from Version Control.\n" +
                "\n" +
                "Write unit tests to find the errors in BalancedBrackets.\n" +
                "\n" +
                "The tests you write should guide how you revise the sourcecode. Use TDD to first write tests that will work for the desired behavior of BalancedBrackets. When your tests fail, correct the class to pass your tests.\n" +
                "\n" +
                "The content of your tests is up to you, but you should write at least 12 tests.\n" +
                "\n" +
                "Tip\n" +
                "Here’s a first test to help get you started:\n" +
                "Assert that brackets in the correct order, \"[]\", return true.\n" +
                "@Test\n" +
                "public void onlyBracketsReturnsTrue() {\n" +
                "   assertTrue(BalancedBrackets.hasBalancedBrackets(\"[]\"));\n" +
                "}\n" +
                "Note\n" +
                "BalancedBrackets is essentially a wrapper class for a method. And because it’s only method is static, we don’t need to create an instance to test hasBalancedBrackets().\n" +
                "Tip\n" +
                "Discuss with your fellow students and TA how the class should behave. What are some examples of input, and what would the desired output be for each input?\n]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testString));
    }
    @Test
    public void longStringWithLineBreaksAndUnbalancedBracketsReturnsFalse() {
        String testString = "For this studio, you will be writing unit tests to help you find errors in provided code.\n" +
                "\n" +
                "6.4.1. Getting Started\n" +
                "Fork the studio repository.\n" +
                "\n" +
                "In IntelliJ, check out your forked repository from Version Control.\n" +
                "\n" +
                "Write unit tests to find the errors in BalancedBrackets.\n" +
                "\n" +
                "The tests you write should guide how you revise the sourcecode. Use TDD to first write tests that will work for the desired behavior of BalancedBrackets. When your tests fail, correct the class to pass your tests.\n" +
                "\n" +
                "The content of your tests is up to you, but you should write at least 12 tests.\n" +
                "\n" +
                "Tip\n" +
                "Here’s a first test to help get you started:\n" +
                "Assert that brackets in the correct order, \"[]\", return true.\n" +
                "@Test\n" +
                "public void onlyBracketsReturnsTrue() {\n" +
                "   assertTrue(BalancedBrackets.hasBalancedBrackets(\"[]\"));\n" +
                "}\n" +
                "Note\n" +
                "BalancedBrackets is essentially a wrapper class for a method. And because it’s only method is static, we don’t need to create an instance to test hasBalancedBrackets().\n" +
                "Tip\n" +
                "Discuss with your fellow students and TA how the class should behave. What are some examples of input, and what would the desired output be for each input?\n]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testString));
    }
}
