public class Rotor {

    
    private String rotorValues;
    private char startChar;
    private int currentidx;

        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate()){
            char temp = rotorValues[currentidx];
            rotorValues[currentidx] = rotorValues[cuurentidx + 1];
        }
            
    }
    
    // If the current index has passed its max, rotate & reset currentidx
    public boolean rotate(){
        if( currentidx == 28) {
            currentidx = 0;

            return true;
        }

        return false;

    }
    
    // Search for char c in rotor, 
    public int indexOf(char c){
        for(int i = 0; i < 27; i++){
            if(c == rotorValues.charAt(i + currentidx)){
                return (i + currentidx) % 27;
            }
        }

        return 0;
    }

    // Returns the char at the idx given 
    public char charAt(int idx){
        return rotorValues.charAt((currentidx + idx) % rotorValues.length());
    }
}
    
