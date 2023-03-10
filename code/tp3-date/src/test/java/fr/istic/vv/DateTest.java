package fr.istic.vv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static fr.istic.vv.Date.isLeapYear;
import static fr.istic.vv.Date.isValidDate;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    private Date date;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    private Date leapdate;
    private Date firstDAy;

    private int annee = 2020;
    private int annee2 = 2021;

    @BeforeEach
    protected void setUp() throws Exception {
        //happyPath
        date = new Date(8, 03, 2023);
        //date to compare


        // change block one by one to improve tests
       // date5 = new Date(28, 02, 2020);

        //leap year
        leapdate = new Date(29, 02, 2020);
    }

    @Test
    public void isValidDateTest1() {
        assertTrue(isValidDate(8, 03, 2023));
    }

    @Test
    public void isValidDateTest2() {
        assertFalse(isValidDate(-3, 03, 2023));
    }

    @Test
    public void isValidDateTest3() {
        assertFalse(isValidDate(3, 0, 2023));
    }

    @Test
    public void isValidDateTest4() {
        assertFalse(isValidDate(3, 03, 20));
    }


    @Test
    public void isLeapYearTest1() {
        assertTrue(isLeapYear(annee));
    }

    @Test
    public void isLeapYearTest2() {
        assertFalse(isLeapYear(annee2));
    }


    @Test
    public void nextDateTest1() {
        Date expectedDate = new Date(9, 03, 2023);
        assertEquals(expectedDate,date.nextDate(date));
    }

    @Test
    public void nextDateTest2() {
        Date expectedDate = new Date(1, 03, 2020);
        assertEquals(expectedDate,leapdate.nextDate(leapdate));
    }

    @Test
    public void previousDateTest() {
        Date expectedDate2 = new Date(7,03,2023);
        assertEquals(expectedDate2,date.previousDate());
    }

    @Test
    public void compareToTest() {
    Date other = new Date(14,10,2021);
        assertTrue(date.compareTo(other)>0);
    }

}


