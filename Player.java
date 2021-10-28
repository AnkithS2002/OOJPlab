
class Playerclass {
	int id;
    String name;
    int[] scores;
    int no_matches_played;
    
    Playerclass(int id, String name, int[] scores, int no_matches_played){
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.no_matches_played = no_matches_played;
    }
    
    float getAvg(){
        int sum = 0; float avg;
        for(int i=0; i < no_matches_played; i++){
            sum = sum + scores[i];
        }
        avg = (float) sum / no_matches_played;
        return avg;
    }
    
    void getDetails() {
    	System.out.printf("ID: %d\n",id);
    	System.out.println("Name: "+name);
    	System.out.printf("Scores: ");
    	for(int i = 0; i < no_matches_played; i++) {
    		System.out.printf("%d\t", scores[i]);
    	}
    	System.out.printf("\nNo. of matches played: %d\n", no_matches_played);    	
    }
}

public class Player{
	public static void main(String[] args) {
		int s1[] = {4,2,0,1,3};
		int s2[] = {3,2,1,1,1};
		Playerclass p1 = new Playerclass(1504, "Ankith", s1, 5);
		Playerclass p2 = new Playerclass(2375, "Ravi", s2, 5);
		float p1_avg = p1.getAvg();
		float p2_avg = p2.getAvg();
		
		if(p1_avg > p2_avg) p1.getDetails();
		else if(p1_avg < p2_avg) p2.getDetails();
		else System.out.println("Both players have same average scores");
		
	}
}
