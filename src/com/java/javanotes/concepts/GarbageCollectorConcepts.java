//package com.java.javanotes.concepts;
//
//public class GarbageCollectorConcepts {
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Finalize method called before GC");
//    }
//
//    public static void main(String[] args) {
//        GarbageCollectorConcepts obj = new GarbageCollectorConcepts();
//        obj = null;  // Eligible for GC
//        System.gc(); // Suggests GC to run (not guaranteed)
//        System.out.println("Main method ends");
//    }
//}

// is because finalize() has been deprecated since Java 9 and removed in Java 18.
// That’s why the compiler is warning you when you override it.