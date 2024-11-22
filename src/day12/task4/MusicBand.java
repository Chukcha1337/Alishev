package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void removeMember(String member) {
        members.remove(member);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (String member : band2.getMembers()) {
            band1.addMember(member);
        }
        band2.getMembers().clear();
    }

    public void showMembers() {
        for (String member : members) {
            System.out.print(member + " ");
        }
        System.out.println();
    }

    public MusicBand(String name, int year, String... a) {
        this.name = name;
        this.year = year;
        for (String member : a) {
            addMember(member);
        }
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
