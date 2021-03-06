package Class03;

/**
 * @Auther: xucg
 * @Date: 2021/6/10 - 06 - 10 - 11:38 上午
 * @Description: 删除给定的值
 * 1、单链表：注意从第一个头指针不是该删除元素开始，并使用cur元素，替代进行循环，避免头指针的丢失
 * 2、双链表：注意从第一个头指针不是该删除元素开始，并使用cur元素，替代进行循环，避免头指针的丢失
 */
public class DeleteGivenValue {
    public static Node deleteNodeGivenValue(Node head, int num) {
        while (head.value == num) {
            head = head.next;
        }
        Node top = head;
        while (top != null) {
            Node Next = top.next;
            if (Next.value == num) {
                top.next = Next.next;
            }
            top = top.next;
        }
        return head;
    }

    public static DoubleNode deleteDoubleNodeGivenValue(DoubleNode head, int num) {
        while (head.value == num) {
            head = head.next;
            head.pre = null;
        }
        DoubleNode top = head;
        while (top != null) {
            if (top.value == num) {
                DoubleNode Next = top.next;
                DoubleNode NextNext = Next.next;
                top.next = NextNext;
                NextNext.pre = top;
            }
            top = top.next;
        }
        return head;
    }

    public static Node generateNode(int lenth, int value) {
        lenth = (int) (Math.random() * (lenth + 1));
        int v = (int) (Math.random() * (value + 1)) - (int) (Math.random() + (value + 1));
        Node head = new Node(v);
        Node cur = head;
        for (int i = 0; i < lenth - 1; i++) {
            Node node = new Node(v);
            cur.next = node;
            cur = cur.next;
        }
        return head;
    }

    public static void main(String args[]) {

    }
}
