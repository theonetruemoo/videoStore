package za.co.mooInc.logicClasses;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class Editor {

	private String value = "This editor is provided by PrimeFaces";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}