public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Selamat datang di restoran EAD");
        System.out.println("Silahkan Register terlebih dahulu");
        System.out.println("=================================");
    }

    public class Database {
        int Insertmenu;
        String Showmenu;
        String Searchmenu;

        public void setInsertmenu (int Insertmenu){
            this.Insertmenu = Insertmenu;
        }

        public void setShowmenu (String Showmenu){
            this.Showmenu = Showmenu;
        }

        public void setSearchmenu (String Searchmenu){
            this.Searchmenu = Searchmenu;
        }
    }

    public class Menu{
        String Nama;
        String Category;
        int Price;

        public void getNama (String Nama){
            this.Nama = Nama;
        }
        public void getCategory (String Category){
            this.Category = Category;
        }
        public void getPrice (int Price){
            this.Price = Price;
        }
    }

    public class Server{
        
    }
}
