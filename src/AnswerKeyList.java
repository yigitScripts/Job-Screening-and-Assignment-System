class AnswerKeyList {
    AnswerNode head;
    public void add(char answer) {
        AnswerNode newNode = new AnswerNode(answer);
        if (head == null) {
            head = newNode;
        } else {
            AnswerNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
}