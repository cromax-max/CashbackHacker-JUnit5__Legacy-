package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBeRemainWithAmountUpTo1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 857;
        int expected = 143;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeRemainWithAmountOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2653;
        int expected = 347;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeRemainWithAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeRemainWithAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}