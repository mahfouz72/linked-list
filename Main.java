import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner cin=new Scanner(System.in);
        String str=cin.nextLine();
        str=str.replaceAll("\\[|\\]","");
        String []s=str.split(", ");
        if(s[0].isEmpty()){
            s=new String[]{};
        }

        int val;
        DLL list = new DLL();
        for(int i=0;i<s.length;i++){
            val=Integer.parseInt(s[i]);
            list.add(val);
        }


        String []inputs={"add","addToIndex", "set", "clear","remove","get","isEmpty","contains","sublist","size"};
        String s1=cin.nextLine();
        int c=0;

        for(int i=0;i<10;i++){
            if(s1.equals(inputs[i])){
                c=i;
            }
        }
        int size = DLL.size;
        int val2,idx;
        switch(c){
            case 0:

                val2=cin.nextInt();
                list.add(val2);
                list.print();
                break;

            case 1:

                idx=cin.nextInt();
                val2=cin.nextInt();
                if(idx>size-1) System.out.println("Error");
                else {
                    list.addtoindex(idx, val2);
                    list.print();
                }
                break;

            case 2:

                idx=cin.nextInt();
                val2=cin.nextInt();
                if(idx>size-1) System.out.println("Error");
                else{
                    list.set(idx,val2);
                    list.print();
                }
                break;

            case 3:

                list.clear();
                list.print();
                break;

            case 4:

                idx=cin.nextInt();
                if(idx>size-1) System.out.println("Error");
                else
                {
                    list.remove(idx);
                    list.print();
                }
                break;

            case 5:

                idx=cin.nextInt();
                if(idx>size-1) System.out.println("Error");
                else  System.out.println(list.get(idx).data);
                break;

            case 6:
                if(list.isEmpty())  System.out.print("True") ;
                else  System.out.print("False") ;
                break;

            case 7:
                val2=cin.nextInt();
                if(list.contains(val2))  System.out.print("True") ;
                else  System.out.print("False") ;
                break;

            case 8:
                int idx1=cin.nextInt();
                int idx2=cin.nextInt();
                if (idx1 < 0 || idx1 >= size || idx2 < 0 || idx2 >= size|| idx1 > idx2)
                    System.out.println("Error");
                else
                    list.sublist(idx1,idx2);
                break;

            case 9: System.out.print(size);
                break;


        }


    }

    }
