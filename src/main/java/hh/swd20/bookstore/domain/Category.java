package hh.swd20.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		public long id;
	
		public String name;

		public Category() {}
		
		public Category(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}
