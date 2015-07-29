public class Group {
		protected final int groupSize=20;
		protected Human[] group = new Human [groupSize];
		protected String groupName;
		
		public Group(String groupName) {
			this.groupName = groupName;
		}

		public int getGroupSize() {
			return groupSize;
		}

		public String getGroupName() {
			return groupName;
		}

	    public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Student searchStudent (String name){
	        for (int i = 0; i<groupSize+1; i++) {
	            if ( name.equals(group[i].getName()) ) {
	                return (Student)group[i];
	            }
	        }
	        return null;
	    }

	    public void addStudent(Student student) {
	    	for (int i = 0; i<groupSize+1; i++) {
	            try{
	    		    if (group[i] == null) {
	                group[i] = student;
	                System.out.println( "Student added to group: " + student.info() );
                    return;
	    		    }
	    		} catch (ArrayIndexOutOfBoundsException e) {
	                throw new GroupException();	
	    		}
            }   
                
	    }
	}


