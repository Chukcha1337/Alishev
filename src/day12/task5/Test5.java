package day12.task5;


import static day12.task5.MusicBand.transferMembers;

public class Test5 {
    public static void main(String[] args) {
        MusicBand tokiyoHotel = new MusicBand("Tokiyo Hotel", 2000);
        MusicBand nirvana = new MusicBand("Nirvana", 1970);
        tokiyoHotel.addMember(new MusicArtist("Ivanov", 19));
        tokiyoHotel.addMember(new MusicArtist("Lopata", 20));
        nirvana.addMember(new MusicArtist("Kurt", 27));
        nirvana.addMember(new MusicArtist("Paul", 23));
        tokiyoHotel.showMembers();
        nirvana.showMembers();

        transferMembers(tokiyoHotel,nirvana);

        nirvana.showMembers();
        tokiyoHotel.showMembers();

    }
}
