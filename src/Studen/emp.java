package Studen;

public class emp {
		 int id;
		String name;
		Address address;
		public emp(int id, String name, Address address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}
		void display(){
			System.out.println(id+" "+name);
			System.out.println(address.city+" "+address.state+" "+address.country);
			}
			public static void main(String[] args) {
			Address address1=new Address("gzb","UP","india");
			Address address2=new Address("gzb","UP","india");

			emp e=new emp(111,"varun",address1);
			emp e2=new emp(112,"arun",address2);
		
			e.display();
			e2.display();
			}
}
