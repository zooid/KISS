package fr.neamar.summon.holder;

import android.net.Uri;

public class ContactHolder extends Holder{
	public int timesContacted = 0;
	
	public String lookupKey = "";
	public String name = "";
	public String nameLowerCased = "";
	public String displayName = "";
	public String phone = "";
	public String mail = "";
	public Uri icon = null;
}
