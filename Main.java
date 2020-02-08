public class Main {

    public static void main(String[] args) {

        Node node1 = new Node(4);
        Node node2 = new Node(7);
        Node node3 = new Node(1);
        Node node4 = new Node(3);
        Node node5 = new Node(2);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        node2.setPrevious(node1);
        node3.setPrevious(node2);
        node4.setPrevious(node3);
        node5.setPrevious(node4);

        //System.out.println(minimum(node1));//question2
        //System.out.println(isCyclic(node1));//question3
        //deleteLastNode(node1);//question4
        //printList(node1);//question4
        //System.out.println(node3.getPrevious().getValue());//question5
        //System.out.println(isCircle(node1));//question6
    }

    private static void printList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getValue());
        printList(node.getNext());
    }

    private static int minimum(Node node) {
        if (node.getNext() == null) {
            return node.getValue();
        }
        return Math.min(node.getValue(), minimum(node.getNext()));
    }

    private static boolean isCyclic(Node node) {

        return isCyclicAssistant(node.getNext(), node);
    }

    private static boolean isCyclicAssistant(Node node, Node firstNode) {
        if (node == null) {
            return false;
        }
        if (node.getNext() == firstNode) {
            return true;
        }
        return isCyclicAssistant(node.getNext(), firstNode);
    }

    private static void deleteLastNode(Node node) {
        if (node.getNext().getNext() == null) {
            node.setNext(null);
            return;
        }
        deleteLastNode(node.getNext());
    }
    private static boolean isCircle(Node node) {

        Node node1 = node;
        Node node2 = node;

        while (node2 != null && node2.getNext() != null) {
            node1 = node1.getNext();
            node2 = node2.getNext().getNext();

            if (node1 == node2) {
                return true;
            }
        }
        return false;
    }
}
