class ApplicantList {
    ApplicantNode head;
    public void add(ApplicantNode applicant) {
        if (head == null) {
            head = applicant;
        } else {
            ApplicantNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = applicant;
        }
    }
}