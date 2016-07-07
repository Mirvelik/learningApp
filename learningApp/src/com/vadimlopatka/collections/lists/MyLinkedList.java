package com.vadimlopatka.collections.lists;

public class MyLinkedList {

    private LinkNode first;
    private LinkNode last;

    public MyLinkedList() {
    }

    public void add(Object obj) {

        LinkNode linkNode = new LinkNode(obj);

        // check whether it is the first node
        if (this.first == null) {
            this.first = linkNode;
            this.last = linkNode;
        } else {
            linkNode.setPrev(this.last);
            this.last.setNext(linkNode);
            this.last = linkNode;

        }
    }

    private static class LinkNode {
        private Object item;
        private LinkNode next;
        private LinkNode prev;

        LinkNode(Object obj) {
            this.item = obj;
        }


        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public LinkNode getNext() {
            return next;
        }

        public void setNext(LinkNode next) {
            this.next = next;
        }

        public LinkNode getPrev() {
            return prev;
        }

        public void setPrev(LinkNode prev) {
            this.prev = prev;
        }
    }
}
