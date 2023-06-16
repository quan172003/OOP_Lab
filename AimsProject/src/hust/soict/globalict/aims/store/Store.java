package hust.soict.globalict.aims.store;

import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;

public class Store {
	
	 private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); 
	 
     public void addMedia(Media newMedia)
     {
         if(itemsOrdered.contains(newMedia))
         {
             System.out.println("Already has this media.");
         }
         else
         {
             itemsOrdered.add(newMedia);
         }
     }



     public void removeMedia(Media deleteMedia)
     {
         if(!itemsOrdered.contains(deleteMedia))
         {
             System.out.println("Don't have this media.");
         }
         else
         {
             itemsOrdered.remove(deleteMedia);
         }
     }
}
