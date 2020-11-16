package list
//https://medium.com/@bipinkumar650/singly-linked-list-in-kotlin-a280d1bc7b09

class MyLinkedListKumar {
    var head: Node? = null
    var tail: Node? = null
    var length: Int = 0

    inner class Node(var value: Any?){
        var next: Node? = null
    }

    fun addAtHead(value: Any?){
        val h = this.head
        val newNode = Node(value)
        newNode.next = this.head
        head = newNode
        if (h == null) tail = newNode
        this.length++
    }

    fun addAtTail(value: Any?){
        var h = head
        val newNode = Node(value)
        newNode.next = null
        while (h!!.next !=null) h = h.next
        h.next = newNode
        tail = newNode
        this.length++
    }

    fun deleteAtIndex(index: Int) {
        var curr = this.head
        var prev:Node? = null
        var counter = 0
        if (index < 0 || index >= this.length) return
        if (index == 0){
            head = curr!!.next
            this.length--
            return
        }
        while (counter != index){
            prev = curr
            curr = prev!!.next
            counter++
        }
        prev!!.next = curr!!.next
        if (index == length-1) tail = prev
        this.length--
    }

    fun get(index: Int): Any?{
        var h = head
        var counter = 0
        if (index < 0 || index >= this.length) return -1
        while (counter != index){
            h = h!!.next
            counter++
        }
        return h!!.value
    }

}