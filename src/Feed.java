import java.util.ArrayList;

public class Feed {
    public static void main(String[] args) {
          // Step 1: Create your ArrayList to hold post descriptions
        ArrayList<String> feed = new ArrayList<String>();

        // Step 2: Add 7 post descriptions using .add()
        // Example: feed.add("Maya posted a photo");
        int count=1;

        feed.add("Maia liked a photo");
        feed.add("Penny liked a photo");
        feed.add("Lyra posted a photo");
        feed.add("Aeden posted a photo");
        feed.add("Rose liked a video");
        feed.add("Penny liked a video");
        feed.add("Lyra posted a photo");
         feed.add("Tomer posted a photo");


        // Step 3: Print only the FIRST 3 posts (the top of the feed)
        // Use a for loop — think carefully about when your loop should stop
        int i=0;
        int p=feed.size()-5;
        while(i<=feed.size()-4){
            System.out.println(count+". "+feed.get(i));
            i++;
            count++;
        
        }
            System.out.println("There are "+p+" posts waiting");
           

        // Step 4: Print how many posts are still waiting below the top 3
        

    }
}
