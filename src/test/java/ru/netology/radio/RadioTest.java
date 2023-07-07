package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void StationSetOutOfRangeHigh() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(11);

        int expected = (0);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationSetOutOfRangeLow() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(-5);

        int expected = (0);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationSet() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(5);

        int expected = (5);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNext() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(5);

        radioStation.next();

        int expected = (6);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationNextIsGoingToMax() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(8);

        radioStation.next();

        int expected = (9);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationNextButAlreadyMax() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(9);

        radioStation.next();

        int expected = (0);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationPrev() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(4);

        radioStation.prev();

        int expected = (3);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationPrevIsGoingMin() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(1);

        radioStation.prev();

        int expected = (0);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationPrevButAlreadyMin() {
        Radio radioStation = new Radio();
        radioStation.setRadioStationNum(0);

        radioStation.prev();

        int expected = (9);
        int actual = (radioStation.getRadioStationNum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeUp() {
        Radio radioVolume = new Radio();
        radioVolume.setRadioVolum(5);

        radioVolume.volUp();

        int expected = (6);
        int actual = (radioVolume.getRadioVolum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeUpNextIsMax() {
        Radio radioVolume = new Radio();
        radioVolume.setRadioVolum(9);

        radioVolume.volUp();

        int expected = (10);
        int actual = (radioVolume.getRadioVolum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeUpAlreadyMax() {
        Radio radioVolume = new Radio();
        radioVolume.setRadioVolum(10);

        radioVolume.volUp();

        int expected = (10);
        int actual = (radioVolume.getRadioVolum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeDown() {
        Radio radioVolume = new Radio();
        radioVolume.setRadioVolum(9);

        radioVolume.volDown();

        int expected = (8);
        int actual = (radioVolume.getRadioVolum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeDownButNextIsMin() {
        Radio radioVolume = new Radio();
        radioVolume.setRadioVolum(1);

        radioVolume.volDown();

        int expected = (0);
        int actual = (radioVolume.getRadioVolum());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeDownButAlreadyMin() {
        Radio radioVolume = new Radio();
        radioVolume.setRadioVolum(0);

        radioVolume.volDown();

        int expected = (0);
        int actual = (radioVolume.getRadioVolum());
        Assertions.assertEquals(expected, actual);
    }
}
