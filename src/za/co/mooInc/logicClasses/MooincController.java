package za.co.mooInc.logicClasses;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MooincController {
	
	
	public void addInfoMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
	public void addErrorMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
	
	public void sendMail(String[] to, String subject, String body) throws Exception{
		GmailEmailSender ges = new GmailEmailSender();
		ges.sendFromGMail(to, subject, body);
	}

}
