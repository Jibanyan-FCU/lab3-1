package firstProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String lyrics = "Let it go! Let it go! Cannot hold it back anymore";
        String[] lyriceSplit = lyrics.split(" ");
        
        lyrics = "";
        
        for(String i: lyriceSplit) {
        	if(i.equals("it")) {
        		lyrics += "\"her\" ";
        	} else if(i.equals("Cannot")){
        		lyrics += "Can't ";
        	} else {
        		lyrics += (i + " ");
        	}
        }
        System.out.println(lyrics);
	}
}
