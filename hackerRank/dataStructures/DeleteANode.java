package hackerRank.dataStructures;


import java.util.Scanner;

public class DeleteANode
{
	static class SinglyLinkedListNode 
	{
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData)
        {
            this.data = nodeData;
            this.next = null;
        }
        
	}
	
	public static void main(String[] args)
	{
		
		

		DeleteANode node = new DeleteANode(); }
		
	
	

	static void printNodes(SinglyLinkedListNode head)
	{
		
		if(head == null) return;
		
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
			
	}
		
	
	
	
	
	
	
	
	
	
	
}
