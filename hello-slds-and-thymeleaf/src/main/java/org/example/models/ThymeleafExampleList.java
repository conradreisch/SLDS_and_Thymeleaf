package org.example.models;

import org.example.domain.ContactItem;
import java.util.List;
import java.util.ArrayList;

public class ThymeleafExampleList {
	
	List<ContactItem> contactlist = new ArrayList<ContactItem>();
	
	public ThymeleafExampleList() {
		contactlist.add(new ContactItem("Vorname Nachname 1","Firma","Titel","vorname.nachname@example.org"));
		contactlist.add(new ContactItem("Vorname Nachname 2","Firma","Titel","vorname.nachname@example.org"));
		contactlist.add(new ContactItem("Vorname Nachname 3","Firma","Titel","vorname.nachname@example.org"));
		contactlist.add(new ContactItem("Vorname Nachname 4","Firma","Titel","vorname.nachname@example.org"));
	}

	/**
	 * @return the contactlist
	 */
	public List<ContactItem> getContactlist() {
		return contactlist;
	}

}
