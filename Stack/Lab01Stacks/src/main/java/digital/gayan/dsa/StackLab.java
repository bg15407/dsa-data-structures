package digital.gayan.dsa;

public class StackLab {
    public static void main(String[] args) {
        final CharacterStack characterStack = new CharacterStack(15);
        final CheckBracket bracketCheck = new CheckBracket("3 + ((6*2) -3)");
        bracketCheck.checkBracket();
        int count = 0;
        //inputstr - in;
        //int size - inputstr.length();
        //new CharacterStack(size);

        characterStack.push('3');
        characterStack.push('+');
        characterStack.push('(');
        characterStack.push('(');
        characterStack.push('6');
        characterStack.push('*');
        characterStack.push('2');
        characterStack.push(')');
        characterStack.push('-');
        characterStack.push('3');
        characterStack.push(')');

        do{
            char temp = characterStack.pop();
            System.out.print(temp);
            if(temp == '(' || temp == ')'){
                count++;
            }
        }while(!characterStack.isEmpty());

        System.out.println("\n");

        if(count % 2 == 0 && !(count == 0)){
            System.out.println("Valid");
        }else if (!(count == 0)){
            System.out.println("Invalid");
        }else{
            System.out.println("No ( ) found");
        }
    }
}