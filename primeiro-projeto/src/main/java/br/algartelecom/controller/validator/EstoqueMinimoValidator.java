package br.algartelecom.controller.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("br.com.algartelecom.EstoqueMinimo")
public class EstoqueMinimoValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		Long numero = ((Number) value).longValue();
		
		if (numero < 10) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"não pode ser menor que 10", "não pode ser menor que 10");
			throw new ValidatorException(message);
		}
	}

}
