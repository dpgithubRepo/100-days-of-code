package day35;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * https://leetcode.com/problems/add-two-numbers/
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8] Explanation: 342 + 465 =
 * 807.
 * 
 *  Example 2:
 * 
 * Input: l1 = [0], l2 = [0] Output: [0] 
 * 
 * 
 * Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in each linked list is in the range [1, 100]. 0 <=
 * Node.val <= 9 It is guaranteed that the list represents a number that does
 * not have leading zeros
 * 
 * @author Durga Prasad
 *
 */
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int carry = 0;
		List<Integer> list = new ArrayList<>();
		int ans = 0;
		while (l1 != null || l2 != null || carry != 0) {
			ans = 0;

			if (l1 != null) {
				ans += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				ans += l2.val;
				l2 = l2.next;
			}

			ans = ans + carry;

			if (ans > 9) {
				carry = ans / 10;
				ans = ans - 10;

			} else {
				carry = 0;
			}

			list.add(ans);
		}

		ListNode head = buildResultNode(list);
		return head;
	}

	private static ListNode buildResultNode(List<Integer> list) {
		ListNode result = new ListNode();
		ListNode head = result;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			result.val = list.get(i);
			if (i != size - 1) {
				result.next = new ListNode();
				result = result.next;
			}

		}
		return head;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		l1.val = 2;
		ListNode l2 = new ListNode();
		l2.val = 4;
		ListNode l3 = new ListNode();
		l3.val = 3;
		l1.next = l2;
		l2.next = l3;
		l3.next = null;

		ListNode l4 = new ListNode();
		l4.val = 5;
		ListNode l5 = new ListNode();
		l5.val = 6;
		ListNode l6 = new ListNode();
		l6.val = 4;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;

		ListNode head = addTwoNumbers(l1, l4);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
