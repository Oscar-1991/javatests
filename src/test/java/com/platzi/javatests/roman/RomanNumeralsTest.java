package com.platzi.javatests.roman;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static com.platzi.javatests.roman.RomanNumerals.arabicToRoman;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void convert_arbic_number_to_roman_number() {
        assertThat(arabicToRoman(1), is("I"));
        assertThat(arabicToRoman(1), is("I"));
        assertThat(arabicToRoman(2), is("II"));
        assertThat(arabicToRoman(3), is("III"));
        assertThat(arabicToRoman(5), is("V"));
        assertThat(arabicToRoman(6), is("VI"));
        assertThat(arabicToRoman(7), is("VII"));
        assertThat(arabicToRoman(10),is("X"));
        assertThat(arabicToRoman(11),is("XI"));
        assertThat(arabicToRoman(15),is("XV"));
        assertThat(arabicToRoman(16),is("XVI"));
        assertThat(arabicToRoman(50),is("L"));
        assertThat(arabicToRoman(51),is("LI"));
        assertThat(arabicToRoman(55),is("LV"));
        assertThat(arabicToRoman(56),is("LVI"));
        assertThat(arabicToRoman(60),is("LX"));
        assertThat(arabicToRoman(70),is("LXX"));
        assertThat(arabicToRoman(80),is("LXXX"));
        assertThat(arabicToRoman(81),is("LXXXI"));
        assertThat(arabicToRoman(85),is("LXXXV"));
        assertThat(arabicToRoman(86),is("LXXXVI"));
        assertThat(arabicToRoman(126),is("CXXVI"));
        assertThat(arabicToRoman(2507),is("MMDVII"));
    }
}