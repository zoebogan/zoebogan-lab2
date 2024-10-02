//inherits thing and thinglist

  // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        Thing tA = new Thing();
        tA.row = 45;
        tA.col = 50;
        Node nA = new Node();
        nA.data = tA;
        nA.next = L;
        L       = nA;