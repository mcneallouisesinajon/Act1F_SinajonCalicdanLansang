class Node{
    int data;
    Node left, right;

    public Node (int item){
        data = item;
        left = right = null;
    }
}
class BST{
    Node rootNode;

    void insert (int data){
        rootNode = insertRec(rootNode, data);
    }
    Node insertRec (Node rootNode, int data){
        if (rootNode == null){
            rootNode = new Node (data);
            return rootNode;
        }
        if (data < rootNode.data){
            rootNode.left = insertRec (rootNode.left, data);
        } 
        else if (data > rootNode.data){
            rootNode.right = insertRec (rootNode.right, data);
        }
        return rootNode;
    }

    void inOrderTraversal (Node node){
        if (node != null){
            
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
        }
    }
    void preOrderTraversal (Node node){
        if (node != null){
            
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    void postOrderTraversal (Node node){
        if (node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);
        tree.insert(20);

        System.out.println("In-Order Traversal: ");
        tree.inOrderTraversal(tree.rootNode);
        System.out.println();
        System.out.println("Pre-Order Traversal: ");
        tree.preOrderTraversal(tree.rootNode);
        System.out.println();
        System.out.println("Post-Order Traversal: ");
        tree.postOrderTraversal(tree.rootNode);
        System.out.println();

    }
}
