/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_2.Hanoi;

/**
 *
 * @author hamme
 */
public class tower {

    private int nodeCount = 0;
    private node head;

    public int getNodeCount() {
        return nodeCount;
    }

    public node getHead() {
        return head;
    }

    public void push(node Node) {
        nodeCount++;
        
        if (head == null) {
            head = Node;
        } else {
            Node.setDown(head);
            head.setUp(Node);
            
            head = Node;
        }
    }
    
    public void pop() {
        if (nodeCount > 0) {
            nodeCount--;
            
            head = head.getDown();
        }
    }
    
    public String pick() {
        return head.getData();
    }

}
