public class Question2 {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        Node node5 = new Node(9);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        Node node6 = new Node(2);
        Node node7 = new Node(2);
        Node node8 = new Node(6);
        Node node9 = new Node(8);

        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node9);

        printList(listMerge(node1, node6));
    }

    private static void printList(Node newHead) {
        if (newHead == null) {
            return;
        }
        System.out.println(newHead.getValue());
        printList(newHead.getNext());
    }

    private static Node listMerge(Node nodeList1, Node nodeList2) {

        Node newHead = new Node();
        Node sorting = newHead;

        while (nodeList1 != null && nodeList2 != null) {

            if (nodeList1.getValue() < nodeList2.getValue()) {
                sorting.setNext(nodeList1);
                sorting = nodeList1;
                nodeList1 = nodeList1.getNext();
            }
            else {
                sorting.setNext(nodeList2);
                sorting = nodeList2;
                nodeList2 = nodeList2.getNext();
            }
        }
        if (nodeList1 == null) {
            sorting.setNext(nodeList2);
        }
        if (nodeList2 == null) {
            sorting.setNext(nodeList1);
        }
        return newHead.getNext();
    }
}
