package Project;

public class binarySearchTree {
    static class Node {
        int value;
        Node left, right;
        String name;

        Node(int val, String nam) {
                value = val;
                left = null;
                right = null;
                name = nam;
        }
    }

    public static void insert(Node node, int data, String name) {
        if (data < node.value) {
            if (node.left != null) {
                insert(node.left, data, name);
            } else {
                node.left = new Node(data, name);
            }
        } else if (data > node.value) {
            if (node.right != null) {
                insert(node.right, data, name);
            } else {
                node.right = new Node(data, name);
            }
        }

    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.name+"-" + node.value+" ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.name+"-" + node.value+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.name+"-" + node.value+" ");
        }
    }


//    public int max(Node node) {
//        Node tempNode = node;
//        while (tempNode.right != null) {
//            tempNode = tempNode.right;
//        }
//
//        return tempNode.value;
//    }
//
//    public static int min(Node node) {
//        Node tempNode = node;
//        while (tempNode.left != null) {
//            tempNode = tempNode.left;
//        }
//
//        return tempNode.value;
//    }

    public void search(Node node, int data) {
        Node tempNode = node;
        if (node == null) {
            System.out.println("Not found number");
        } else if (node.value == data) {
            System.out.println("Found number");
        } else if (data < node.value) {
            tempNode = node.left;
            search(tempNode, data);
        } else {
            tempNode = node.right;
            search(tempNode, data);
        }
    }

    public void createArray(Node node) {
        control controlObj = new control();
        if (node != null) {
            createArray(node.left);
            createArray(node.right);
            controlObj.getNodeData(node.value, node.name);
        }

    }

    public Node delete(Node root, int k) {
        if (root == null)
            return root;

        if (root.value > k) {
            root.left = delete(root.left, k);
            return root;
        } else if (root.value < k) {
            root.right = delete(root.right, k);
            return root;
        }

        if (root.left == null) {
            Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Node temp = root.left;
            return temp;
        } else {
            Node succParent = root;
            Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;

            root.value = succ.value;

            return root;
        }
    }





}

