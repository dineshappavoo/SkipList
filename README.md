Splay Tree
=========

A skip list is a data structure that allows fast search within an ordered sequence of elements. Fast search is made possible by 
maintaining a linked hierarchy of subsequences, each skipping over fewer elements. Searching starts in the sparsest subsequence 
until two consecutive elements have been found, one smaller and one larger than the element searched for. Via the linked hierarchy 
these two elements link to elements of the next sparsest subsequence where searching is continued until finally we are searching in 
the full sequence. The elements that are skipped over may be chosen probabilistically.

##Functionalities

Implementation of SkipList in java. The library to implement SkipList with the following operations,


    insert() - To add new (key, value) pair to the SkipList
    find() - To get an element from the SkipList by passing the key
    findMin() - To get the minimum element from the SkipList
    findMax() - To get the maximum element from the SkipList
    remove() - To remove a particular key from the SkipList
    removeValue() - To remove all key matching the values from the list
    size() - To return the total size of the list
    

##Original release notes from 2014

SplayTree is a randomized data structure. The following code snippet shows how to run the library,


    	SkipList<Long, Long> sList=new SkipList<Long, Long>();
		sList.add(10L, 25L);
		sList.add(12L, 55L);
		sList.add(14L, 45L);
		sList.add(16L, 55L);
		System.out.println(sList.findMin());
		System.out.println(sList.findMax());
		sList.remove(14L);
		System.out.println(sList.get(14L));
		System.out.println(sList.size());
		
##Project Contributor

* Dinesh Appavoo ([@DineshAppavoo](https://twitter.com/DineshAppavoo))
