package ru.netology;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
   public void shouldReturn100IfAmountIs900() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;


        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
   public void shouldReturn0IfAmountIs1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;


        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }
}
