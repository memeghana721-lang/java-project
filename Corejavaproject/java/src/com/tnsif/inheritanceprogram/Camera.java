package com.tnsif.inheritanceprogram;

public interface Camera {
	
    void takephoto();
}
//second interface
interface Musicplayer{
    void playmusic();
}
//A class implementing multiple interafce

class Smartphone implements Camera,Musicplayer{

    @Override
    public void playmusic() {
            System.out.println("take a photo");
            
    }

    @Override
    public void takephoto() {
            System.out.println("listen music");
            
    }
    
}

