import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList names = new LinkedList();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        for(int i=0; i<names.size(); i++){
            if(names.get(i).equals("May")){
                String storedName = names.get(i+1).toString();
                names.set(i+1, "Ray");
                names.add(storedName);
            }
        }
        System.out.println(names);

        names.remove(1);

        for(int i=0; i<names.size(); i++){
            System.out.print(names.get(i).toString() + " ");
        }
        System.out.println("\n");

        int i=names.size()-1;
        while(i>=0){
            System.out.print(names.get(i).toString() + " ");
            i--;
        }

        System.out.println("\n");
        names.add("Kay");
        for(i=0; i<names.size(); i++){
            System.out.print(names.get(i).toString() + " ");
        }
    }
}
