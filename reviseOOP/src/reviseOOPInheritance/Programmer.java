/**
 * 
 */
package reviseOOPInheritance;

/**
 * 
 */
public class Programmer extends StaffMember {
	
		private String language;

		/**
		 * @return the language
		 */
		public String getLanguage() {
			return language;
		}

		/**
		 * @param language the language to set
		 */
		public void setLanguage(String language) {
			this.language = language;
		}

		@Override
		public String toString() {
			return "Programmer [language=" + language + ", getFirstName()=" + getFirstName() + ", getLastName()="
					+ getLastName() + "]";
		}
		
		

}
