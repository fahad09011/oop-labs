public class hotel {
    public static void main(String[] args) {
        HotelRoom RoomA= new HotelRoom();
        RoomA.setroomnumber(200);
        RoomA.setroomType("single");


        HotelRoom RoomB= new HotelRoom();
        RoomB.setroomnumber(201);
        RoomB.setroomType("double");



        System.out.println("RoomA number is "+RoomA.getroomnumber() +" Room Type is "+RoomA.getroomType());
        System.out.println("RoomA number is "+RoomB.getroomnumber() +" Room Type is "+RoomB.getroomType());
        }
}
