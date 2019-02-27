package com.imdb.pojo;

public class SignUpPojo {
	
        private String firstname;
        private String middlename;
        private String lastname;
        private String emailid;
        private String createpassword;
        private String confirmpassword;
        private String mobilenumber;
        private String address;
        private String pincode;
		public SignUpPojo(String firstname, String middlename, String lastname, String emailid, String createpassword,
				String confirmpassword, String mobilenumber, String address, String pincode) {
			super();
			this.firstname = firstname;
			this.middlename = middlename;
			this.lastname = lastname;
			this.emailid = emailid;
			this.createpassword = createpassword;
			this.confirmpassword = confirmpassword;
			this.mobilenumber = mobilenumber;
			this.address = address;
			this.pincode = pincode;
		}
		public SignUpPojo() {
			super();
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getMiddlename() {
			return middlename;
		}
		public void setMiddlename(String middlename) {
			this.middlename = middlename;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getCreatepassword() {
			return createpassword;
		}
		public void setCreatepassword(String createpassword) {
			this.createpassword = createpassword;
		}
		public String getConfirmpassword() {
			return confirmpassword;
		}
		public void setConfirmpassword(String confirmpassword) {
			this.confirmpassword = confirmpassword;
		}
		public String getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "SignUpPojo [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
					+ ", emailid=" + emailid + ", createpassword=" + createpassword + ", confirmpassword="
					+ confirmpassword + ", mobilenumber=" + mobilenumber + ", address=" + address + ", pincode="
					+ pincode + "]";
		}
		
     
}

