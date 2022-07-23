class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            flip(image[i]);
            invert(image[i]);
        }
        return image;
    }
    static void flip(int[] array){
        for(int i=0;i< array.length*0.5;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]= temp;
        }
    }
    static void invert(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=1-array[i];
        }
    }
    
}