class ApplicantNode {
    int id;
    String Name;
    int resumeScore;
    AnswerNode answersHead;
    ApplicantNode next;

    public ApplicantNode(int id, String Name, int resumeScore) {
        this.id = id;
        this.Name = Name;
        this.resumeScore = resumeScore;
        this.answersHead = null;
        this.next = null;
    }


    public void addAnswer(char answer) {
        AnswerNode newNode = new AnswerNode(answer);
        if (answersHead == null) {
            answersHead = newNode;
        } else {
            AnswerNode temp = answersHead;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
}
