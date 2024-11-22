package day12.task3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand tokiyoHotel = new MusicBand("Tokiyo Hotel", 2000);
        MusicBand nirvana = new MusicBand("Nirvana", 1970);
        MusicBand alice = new MusicBand("Alice", 2003);
        MusicBand splin = new MusicBand("Splin", 2001);
        MusicBand linkinPark = new MusicBand("Linkin Park", 1998);
        MusicBand systemOfADown = new MusicBand("System Of A Down", 1997);
        MusicBand evanesence = new MusicBand("Evanesence", 2006);
        MusicBand rory = new MusicBand("Rory", 2010);
        MusicBand klavaKoka = new MusicBand("Klava Koka", 2015);
        MusicBand threeDaysGrace = new MusicBand("Three Days Grace", 2002);
        List<MusicBand> bands = new ArrayList<>();
        bands.add(tokiyoHotel);
        bands.add(nirvana);
        bands.add(alice);
        bands.add(splin);
        bands.add(linkinPark);
        bands.add(systemOfADown);
        bands.add(evanesence);
        bands.add(rory);
        bands.add(klavaKoka);
        bands.add(threeDaysGrace);
        System.out.println(bands);
        Collections.shuffle(bands);
        System.out.println(bands);
        List<MusicBand> after2000 = groupsAfter2000(bands);
        System.out.println(after2000);


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groups = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                groups.add(band);
            }
        }
        return groups;
    }
}
