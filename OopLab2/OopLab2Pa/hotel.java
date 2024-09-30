public class hotel {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HotelRoom RoomA = new HotelRoom();
        RoomA.setroomnumber(200);
        RoomA.setroomType("single");
        RoomA.setroomrate(100);
        RoomA.setroomstatus(1);

        
        HotelRoom RoomB = new HotelRoom();
        RoomB.setroomnumber(201);
        RoomB.setroomType("double");
        RoomB.setroomrate(80);
        RoomB.setroomstatus(0);


        System.out.println("RoomA number is "+RoomA.getroomnumber() +" Room Type is "+RoomA.getroomType() +". is occupied "+RoomA.getroomstatus()+" with rate of"+RoomA.getroomrate());

        
        System.out.println("RoomB number is "+RoomB.getroomnumber() +" Room Type is "+RoomB.getroomType() +". is un-occupied "+RoomB.getroomstatus()+" with rate of"+RoomB.getroomrate());

    }
}
