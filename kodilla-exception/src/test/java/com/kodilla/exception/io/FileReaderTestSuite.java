package com.kodilla.exception.io;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    public void testReadFile() {
        //given
        FileReader fileReader = new FileReader();
        //when & then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    public void whenFileDoesNotExistsReadFileShouldThrowException() {
        //given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        //When & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}
