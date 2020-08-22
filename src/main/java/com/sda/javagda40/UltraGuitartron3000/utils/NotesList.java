package com.sda.javagda40.UltraGuitartron3000.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotesList {
    public static final List<String> NOTES_LIST = new ArrayList<>
            (Arrays.asList(
//                    wartości powtórzone, żeby  przy wybraniu prymy pod koniec oktawy nie trzeba było przekształcać ani przepisywać.
                    "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B",
                    "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"));

    public static List<String> getNotesList() {
        return NOTES_LIST;
    }
}