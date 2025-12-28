
package abm.gui;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import java.util.regex.Pattern;



public class FiltrosInput extends DocumentFilter  {
    
    private final Pattern patron;
    private final int longitudMax;
   
    public enum Tipo{
    NUMEROS, NUMEROS_FLOAT, LETRAS, ALFANUMERICOS, TODO, LETRAS_SIN_ESPACIO
    }
    
    public static boolean validarEmail(String email){
        int posicionArroba = email.indexOf("@");
        int posicionUltimoPunto = email.indexOf(".");
        
        if(posicionArroba == -1 || posicionUltimoPunto == -1 || (posicionArroba > posicionUltimoPunto) || (posicionArroba == posicionUltimoPunto + 1)){
            return false;
        }
        return true;
    }
    
    public FiltrosInput(Tipo tipo, int longitudMax){
        String filtro;
        switch(tipo){
            case NUMEROS:
                filtro = "[0-9]";
                break;
            case NUMEROS_FLOAT:
                filtro = "[0-9.]+";
                break;
            case LETRAS:
                filtro = "[a-zA-Z\\s]+";
                break;
            case ALFANUMERICOS:
                filtro = "[a-zA-Z0-9]+";
                break;
            case TODO:
                filtro = ".*";
                break;
            case LETRAS_SIN_ESPACIO:
                filtro = "[a-zA-Z]";
                break;
            default:
                filtro = ".*";
                break;
        }
        this.patron = Pattern.compile(filtro);
        this.longitudMax = longitudMax;
    }
    
    private boolean esValido(String texto, int longitudInicial, int longitudInsertada){
        if(longitudInicial + longitudInsertada > longitudMax){
            return false;
        }
        if(texto != null && !texto.isEmpty()){
            return patron.matcher(texto).matches();
        }
        return true;
    }
    
    @Override 
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        
        int currentLength = fb.getDocument().getLength();
        
        if (esValido(string, currentLength, string.length())) {
            super.insertString(fb, offset, string, attr);
            }
        
    }
    
    @Override
    public void replace(FilterBypass fb, int offset, int lenght, String texto, AttributeSet attrs) throws BadLocationException {
        int currentLenght = fb.getDocument().getLength() - lenght;
        if(esValido(texto, currentLenght, (texto != null ? texto.length() : 0))){
            super.replace(fb, offset, lenght, texto, attrs);
        }
    }
    
    public static void aplicarFiltro(JTextField field, Tipo tipo, int maxLenght){
        AbstractDocument doc = (AbstractDocument) field.getDocument();
        doc.setDocumentFilter(new FiltrosInput(tipo, maxLenght));
    }
    
}
