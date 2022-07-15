package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class control {
    private static final List<Integer> data = new ArrayList<>();
    private static final ArrayList<String> name = new ArrayList<>();
    private static int checkRoot =0;
    private static binarySearchTree.Node root;

    public static void main(String args[]) {
        control objCo = new control();
        objCo.Menu();

//            System.out.println("\n\nMax number is "+objTree.max(root));
//            System.out.println("Min number is "+objTree.min(root));

    }

    public void Menu(){
        control objCo = new control();
        binarySearchTree objTree = new binarySearchTree();

        if (checkRoot == 0){
            Scanner sc2= new Scanner(System.in);
            System.out.println("\nPlease enter Your root node data:");
            System.out.println("Enter name :");
            String name= sc2.nextLine();
            System.out.println("Enter value: ");
            Scanner sc= new Scanner(System.in);
            int data= sc.nextInt();
            binarySearchTree.Node rootT = new binarySearchTree.Node(data, name);
            root=rootT;
            checkRoot =1;
        }

        System.out.println("\n        ........Menu.........");
        System.out.println("=======================================");
        System.out.println("Select your options");
        System.out.println("=======================================");
        System.out.println("1. Add data");
        System.out.println("2. Sort using insertion");
        System.out.println("3. Sort using selection");
        System.out.println("4. Traversing tree inorder");
        System.out.println("5. Traversing tree preorder");
        System.out.println("6. Traversing tree postorder");
        System.out.println("7. Delete");
        System.out.println("8. Search");
        System.out.println("0. Exit");
        System.out.println("=======================================");
        Scanner sc= new Scanner(System.in);
        int op;
        op= sc.nextInt();

        int exit =0;

        switch (op){
            case 1:
                objCo.addData(root);
                break;
            case 2:
                objTree.createArray(root);
                objCo.insertion();
                data.clear();
                name.clear();
                break;
            case 3:
                objTree.createArray(root);
                objCo.selection();
                data.clear();
                name.clear();
                break;
            case 4:
                objTree.inOrder(root);
                break;
            case 5:
                objTree.preOrder(root);
                break;
            case 6:
                objTree.postOrder(root);
                break;
            case 7:
                System.out.println("Enter delete value");
                int de;
                de= sc.nextInt();
                objTree.delete(root,de);
                break;
            case 8:
                System.out.println("Enter Search value");
                int se;
                se= sc.nextInt();
                objTree.search(root,se);
                break;
            case 0:
                exit=1;
                break;
            default:

        }
        if (exit == 0){
            Menu();
        }
    }


    public void addData(binarySearchTree.Node root){
        binarySearchTree objTree = new binarySearchTree();
        int size;

        System.out.println("How many data Enter ");
        Scanner sc= new Scanner(System.in);
        size= sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name :");
            Scanner sc2= new Scanner(System.in);
            String name1= sc2.nextLine();
            System.out.println("Enter data :");
            int data1= sc.nextInt();
            objTree.insert(root, data1, name1);
        }
    }


    public void getNodeData(int n,String na){
        data.add(n);
        name.add(na);
    }


    public void insertion(){

        int[] arr = new int[data.size()];
        String[] nameArray= new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            arr[i]=data.get(i);
            nameArray[i]=name.get(i);
        }

        InsertionSort objInSort = new InsertionSort();
        objInSort.sort(arr,nameArray);
        objInSort.printArray(arr,nameArray);

    }

    public void selection(){
        int[] arr = new int[data.size()];
        String[] nameArray= new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            arr[i]=data.get(i);
            nameArray[i]=name.get(i);
        }
        System.out.println(arr.length);
        SelectionSort objSelect = new SelectionSort();
        objSelect.sort(arr,nameArray);
        objSelect.printArray(arr,nameArray);
    }





}
