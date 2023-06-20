public interface Fly{

    /**
     * feed the animal
     */
    void land();

    /**
     * bird lands
     */
    void takeOff();

    /**
     * bird takes off
     */
     
     void ascend(int alt);
     void descend(int alt);

    default void glide() {
        System.out.println("glides into the air ...");
    }
    
   
}
