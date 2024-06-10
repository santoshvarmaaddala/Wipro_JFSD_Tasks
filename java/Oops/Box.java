package Oops;
public class Box {

        private int width;
        private int height;
        private int depth;

        public Box(int width, int height, int depth){
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
        public int volume(){
            return this.width * this.height * this.depth;
        }
    
        public static void main(String[] args) {
            Box obj = new Box(5,5,5);
            System.out.println("volume of a box is: "+obj.volume());
        }
}
