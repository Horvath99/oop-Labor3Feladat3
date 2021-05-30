package Labor10_4;

public interface IExpression {
    public static boolean isOperator(String op){
        if(op.equals("+") || op.equals("*") || op.equals("/") || op.equals("-")){
            return true;
        }
        return false;
    }
    public static double evaluate( String postfixExpression) throws ExpressionException{
        String[] items=postfixExpression.split(" ");
        Stack stack;
        stack = new Stack(items.length);
        for(String item:items){
            if(isOperator(item.trim())==true){
                try{
                    double a = (double) stack.top();
                    stack.pop();
                    double b = (double) stack.top();
                    stack.pop();
                    if(item.trim().equals("+")){
                        stack.push(a+b);
                    }
                    else if(item.trim().equals("-")){
                        stack.push(a-b);
                    }
                    else if(item.trim().equals("*")){
                        stack.push(a*b);
                    }
                    else if(item.trim().equals("/")){
                        stack.push(a/b);
                    }
                } catch (StackException e) {
                    throw new ExpressionException("Error");
                }
            }
            else{
                try {
                    double c=Double.parseDouble(item.trim());
                    try {
                        stack.push(c);
                    } catch (StackException e) {
                       throw new ExpressionException("Wrong operand1:"+item.trim());
                    }
                } catch (NumberFormatException e) {
                    throw new ExpressionException("\tWrong operand2: " + item.trim());
                }
            }
        }
        try {
            return (double) stack.top();
        } catch (StackException e) {
            throw new ExpressionException("\tWrong postfix expression");
        }
    }
}
