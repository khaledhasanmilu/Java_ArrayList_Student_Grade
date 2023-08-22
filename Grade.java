import java.util.*;
class Grade{
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
     public  void addGrade(int grade){
         arrayList.add(grade);
     }
     public double CalculateAverage(){
         double average = 0;
         for (int i= 0;i<arrayList.size();i++){
             average+=arrayList.get(i);
         }
         average/=arrayList.size();
         return average;
     }
     public double highestGrade(){
         Collections.sort(arrayList);
         return  arrayList.get(arrayList.size()-1);
     }
     public void listPassingStudent(){
         for(int i =0 ;i<arrayList.size();i++){
             if(arrayList.get(i)>=50){
                 System.out.println(arrayList.get(i));
             }
         }

     }

    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student's grade ( or -1 to stop):");
        grade=sc.nextInt();
        Grade g = new Grade();
        while(grade!=-1){
           g.addGrade(grade);
            System.out.println("Enter a student's grade ( or -1 to stop): ");
           grade=sc.nextInt();
        }
        System.out.println("Average grade: "+g.CalculateAverage());
        System.out.println("Highest grade: "+g.highestGrade());
        System.out.println("Passing Student: ");
        g.listPassingStudent();
    }
}