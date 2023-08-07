package gft.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackages = "gft.controllers")
public class ApiControllerAdvice extends ResponseEntityExceptionHandler{
	
	@ResponseBody
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<MessageExceptionHandler> entityNotFound(EmptyResultDataAccessException ex){
		MessageExceptionHandler error = new MessageExceptionHandler(
				new Date(), HttpStatus.NOT_FOUND.value(), "Cadastro não encontrado", ex.toString());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ResponseBody
	@ExceptionHandler(RegraNegocioException.class)
	public ResponseEntity<MessageExceptionHandler> entityNotFound(RegraNegocioException ex){
		MessageExceptionHandler error = new MessageExceptionHandler(
				new Date(), HttpStatus.BAD_REQUEST.value(), ex.getMessage(), ex.toString());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<MessageExceptionHandler> erros = gerarListaDeErros(ex.getBindingResult());

		return handleExceptionInternal(ex, erros, headers, HttpStatus.BAD_REQUEST, request);
	}
	
	private List<MessageExceptionHandler> gerarListaDeErros(BindingResult bindingResolt){
		List<MessageExceptionHandler> erros = new ArrayList<MessageExceptionHandler>();
		bindingResolt.getFieldErrors().forEach(fieldError -> {
			Date timestamp = new Date();
			Integer status = HttpStatus.NOT_ACCEPTABLE.value();
			String msgUsuario = mensagemErroUsuario(fieldError);
			String msgDesenvolvedor = fieldError.toString();
			erros.add(new MessageExceptionHandler(timestamp, status, msgUsuario, msgDesenvolvedor));
		});
		return erros;
	}

	private String mensagemErroUsuario(FieldError fieldError) {
		if (fieldError.getCode().equals("NotBlank")){
			return fieldError.getDefaultMessage().concat(" é obrigatório");
		}
		if (fieldError.getCode().equals("Length")){
			return fieldError.getDefaultMessage().concat(String.format(" deve ter entre %s e %s caracteres", 
					fieldError.getArguments()[2], fieldError.getArguments()[1]));
		}
		return fieldError.toString();
	}

}
