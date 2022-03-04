
public class LinearList {
		public int size=0;
		public int a[];
		public LinearList() {
			
		}
		public boolean empty() {
			
				return size() == 0;
			
		}
		public int size() {
			return size;
		}
		public int getIndex(int[] a, int element) {
			for(int i=0; i < size; i++) {
				if(a[i] == element) {
					return i;
				}
			}
			return -1;
		}
		
		public void add(int[] a, int c) {
		    a[size()] = c;
		    size=size + 1;
		}
		public void remove(int[] a, int index) {
			for(int i=index; i<size-1; i++) {
				a[i] = a[i+1];
			}
			size = size-1;
		}
		public void toString (int[] a) {
			for( int i=0; i<size ; i++) 
				System.out.print(a[i]+",");
			  
		}
	}


