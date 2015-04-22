
/*
 * Giovanna Diaz, Alice Yang
 * Programming Assignment #3
 * Operating Systems - Spring 2015
 *
 * Input(s): .txt file of jobs
 * Return(s): 
 */
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

class MemoryManagement {
    
	private static LinkedList<Hole> holeQueue = new LinkedList<Hole>(); // Queue for Storing Info

	public MemoryManagement(int bytes, int policy) 
	{ 
		// intialize memory with these many bytes.

		holeQueue.add(new Hole(0, bytes-1, ))

		// Use segmentation if policy==0, paging if policy==1 
	}

	/**
	*	Tries to insert a segment into RAM.
	*	
	*	@param	 segment 	
	*	@Return  whether or not segment could be inserted
	*/
	public boolean insertSegment(Segment segment) {
		// try to find a hole bigger than segment
		// if none, return false
		// if found, call insertSegmentInHole
	}

	/**
	*	Inserts segment into a hole. If segment doesn't take
	*	up whole space
	*	
	*	@param	 segment 	
	*	@param	 hole  
	*/
	public void insertSegmentInHole(Segment segment, Hole hole) {
		// remove hole from list
		// insert segment into hole
		// use leftover space to create new hole
		// add segment to list of segments
		// if new hole, add to list of holes

	}

	/**
	*	Inserts hole into list of holes
	*		
	*	@param	 hole  
	*/
	public void addHole(Hole hole) {
		// add hole
		// sort


	}


	public int allocate(int bytes, int pid, int text_size, int data_size, int heap_size)
	{ 
		//allocate this many bytes to the process with this id 
		//assume that each pid is unique to a process 
		//if using the Segmentation allocator: size of each segment is: text_size, 		//..data_size, and heap_size.
		//Verify that text_size + data_size + heap_size = bytes
		//If using the paging allocator, simply ignore the segment size variables 
		//Return 1 if successful 
		//Return -1 if unsuccessful 
		//Print an error indicating whether there wasn't sufficient memory or whether you 	//..ran into external fragmentation
	}

	public int deallocate(int pid)
	{ 
		// deallocate memory allocated to this process
		// return 1 if successful, -1 otherwise with an error message
	}

	public void printMemoryState()
	{ 
		// print out current state of memory
		// the output will depend on the memory allocator being used.


		// SEGMENTATION Example:
		// Memory size = 1024 bytes, allocated bytes = 179, free = 845
		// There are currently 10 holes and 3 active process
		//
		// Hole list:
		// 	hole 1: start location = 0, size = 202
		// ...
		//
		// Process list:
		// process id=34, size=95 allocation=95
		// 	text start=202, size=25
		// 	data start=356, size=16
		// 	heap start=587, size=54
		// process id=39, size=55 allocation=65
		// ...
		//
		// Total Internal Fragmentation = 10 bytes
		// Failed allocations (No memory) = 2
		// Failed allocations (External Fragmentation) = 7 

		// PAGING Example:
		// Memory size = 1024 bytes, total pages = 32
		// allocated pages = 6, free pages = 26
		// There are currently 3 active process
		// Free Page list:
		// 	2,6,7,8,9,10,11,12...
		//
		// Process list:
		// Process id=34, size=95 bytes, number of pages=3
		// 	Virt Page 0 -> Phys Page 0 used: 32 bytes
		// 	Virt Page 1 -> Phys Page 3 used: 32 bytes
		// 	Virt Page 2 -> Phys Page 4 used: 31 bytes
		//
		// Process id=39, size=55 bytes, number of pages=2
		// 	Virt Page 0 -> Phys Page 1 used: 32 bytes
		// 	Virt Page 1 -> Phys Page 13 used: 23 bytes
		//
		// Process id=46, size=29 bytes, number of pages=1
		// 	Virt Page 0 -> Phys Page 5 used: 29 bytes 
		//
		// Total Internal Fragmentation = 13 bytes
		// Failed allocations (No memory) = 2
		// Failed allocations (External Fragmentation) = 0 
	}

	public static class Hole {
		private int base;
		private int limit;

		/* Hole constructor */
		public Hole (int base, int limit) {
			this.base = base;
			this.limit = limit;
		}

		public int getBase() { return base; }

		public int getLimit() { return limit; }

		public int getSize() { return size; }

		public void setBase(int base) { this.base = base; }

		public void setLimit(int limit) { this.base = base; }	

		public int getSize() { 
			return limit - base;
		}	
		
	} //EOHole

} // EOF
