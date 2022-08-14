package digital.gayan.dsa;

public class CheckBracket {
    private String inputString;

    public CheckBracket(String input){
        this.inputString = input;
    }

    public void checkBracket(){
        int size = inputString.length();
        CharacterStack bracketStack = new CharacterStack(size);
        for(int i = 0; i < size; i++){
            if(inputString.charAt(i) == '(')
                bracketStack.push('(');
            else if(inputString.charAt(i) == ')')
                bracketStack.pop();
        }

        if(!bracketStack.isEmpty())
            System.out.println("Invalid");
        else
            System.out.println("Valid");
    }
}
