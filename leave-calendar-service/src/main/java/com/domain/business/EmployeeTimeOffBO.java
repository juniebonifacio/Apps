package com.domain.business;

import com.domain.hibernate.EmployeeTimeOffVO;

public class EmployeeTimeOffBO extends EmployeeTimeOffVO implements Comparable<EmployeeTimeOffBO> {

	@Override
	public int compareTo(EmployeeTimeOffBO that) {
		int ret = 0;
		
		if(this.getId() < that.getId())
			ret = 1;
		else 
			ret = 0;
	
		return ret;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		ItemBO that = (ItemBO) obj;
		boolean retVal = false;
		
		if (this.getId() == that.getId()) {
			retVal = true;
		} else {
			retVal = false;
		}

		return retVal;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode(){
		return this.getId() * 17;
		
	}
	
}