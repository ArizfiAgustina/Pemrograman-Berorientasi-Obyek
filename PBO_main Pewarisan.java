package pbo_3_inherite;

public class main {

    public static void main(String[] args) {
        //Deklarasi Tim
        Tim RPL = new Tim("RPL");
        
        //Deklarasi Member
        Member m1 = new Member("Nila", 18);
        Member m2 = new Member("Catur", 18);
        Member m3 = new Member("Sari", 17);
        
        //Deklarasi Trainee
        Member m4 = new Trainee("Arief", 30, 5);
        Member m5 = new Trainee("Rizky", 28, 3);
        Member m6 = new Trainee("Firman", 26, 2);
        
        //Menambahkan data pada ArrayList
        RPL.addMember(orang_1);
        RPL.addMember(orang_2);
        RPL.addMember(orang_3);
        RPL.addMember(orang_4);
        RPL.addMember(orang_5);
        RPL.addMember(orang_6);
        
        //Output
        RPL.displayFullMember();
        RPL.displayTrainee();
    }
    
}
