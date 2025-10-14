package Unit2.LambdaFunction;

public class FunctionInterfaceMain {
    public static void main(String[] args) {
//        Sayable sayable = MethodReferences::saySomething;
//        sayable.say();

//        For non-static method, We need to make object but for static method but we not need to make object
        MethodReferences change = new MethodReferences();
        change.saySomething();
        }
    }
