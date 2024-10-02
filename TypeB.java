

     // Add a typeB thing to the list
        Thing tB = new Thing();
        tB.row     = 55;
        tB.col     = 50;
        tB.lab     = 'b';
        tB.isTypeB = true;
        Node nB = new Node();
        nB.data = tB;
        nB.next = L;
        L       = nB;