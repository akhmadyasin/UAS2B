import java.util.ArrayList;
import java.util.Collections;
public class uas2b {
    static class Film {
        private int id;
        private String nama;
        private int tahun;
        private double rating;

        public Film(int id, String nama, int tahun, double rating) {
            this.id = id;
            this.nama = nama;
            this.tahun = tahun;
            this.rating = rating;
        }

        public int getId() {
            return id;
        }

        public String getNama() {
            return nama;
        }

        public int getTahun() {
            return tahun;
        }

        public double getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return "ID Film: " + id + "\n"
                    + "Nama Film: " + nama + "\n"
                    + "Tahun: " + tahun + "\n"
                    + "Rating: " + rating + "\n";
        }
    }

        public static void main(String[] args) {
            Film film1 = new Film(1, "The Flash", 2023, 7.3);
            Film film2 = new Film(2, "Spider-Man: Across the Spider-Verse", 2023, 9.0);
            Film film3 = new Film(3, "Transfirmers: Rise of the Beasts", 2023, 6.6);
            Film film4 = new Film(4, "Avatar The Way of Water", 2023, 7.6);
            Film film5 = new Film(5, "The Little Mermaid", 2023, 7.2);
            Film film6 = new Film(6, "Extraction", 2023, 7.2);
            Film film7 = new Film(7, "Fast X", 2023, 6.0);

            ArrayList<Film> daftarFilm = new ArrayList<>();
            daftarFilm.add(film1);
            daftarFilm.add(film2);
            daftarFilm.add(film3);
            daftarFilm.add(film4);
            daftarFilm.add(film5);
            daftarFilm.add(film6);
            daftarFilm.add(film7);

            for (Film film : daftarFilm) {
                System.out.println(film);
            }

            for (int i = 0; i < daftarFilm.size() - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < daftarFilm.size(); j++) {
                    if (daftarFilm.get(j).getRating() < daftarFilm.get(minIndex).getRating()) {
                        minIndex = j;
                    }
                }
                Collections.swap(daftarFilm, i, minIndex);
            }
            
            System.out.println("Daftar Film Terurut:");
            for (Film film : daftarFilm) {
                System.out.println(film);
            }
        }


}
