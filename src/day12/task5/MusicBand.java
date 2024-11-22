package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public void addMember(MusicArtist member) {
        members.add(member);
    }

    public void removeMember(MusicArtist member) {
        members.remove(member);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (MusicArtist member : band2.members) {
            band1.addMember(member);
        }
        band2.members.clear();
    }

    public void showMembers() {
        for (MusicArtist member : members) {
            System.out.print(member + " ");
        }
        System.out.println();
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String toString() {
        return name + " " + year;
    }

    public int getYear() {
        return year;
    }
}
