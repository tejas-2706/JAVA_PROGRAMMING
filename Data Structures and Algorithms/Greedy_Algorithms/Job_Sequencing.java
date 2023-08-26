import java.util.ArrayList;
import java.util.Collections;

public class Job_Sequencing {
    static class jobs{
        int id;
        int profit;
        int deadline;
        public jobs(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<jobs> job = new ArrayList<>();
        for(int i=0; i<jobinfo.length; i++){
            job.add(new jobs(i,jobinfo[i][0],jobinfo[i][1]));
        }

        Collections.sort(job,(obj1,obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<job.size(); i++){
            jobs curr = job.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs are = "+ seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
