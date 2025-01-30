import java.lang.runtime.SwitchBootstraps;

public class colored {
    
    /* String words;

    public colored(String words){
        this.words = words;
    }
    */
    

    public static void color(String color, String userText){
        switch(color.toLowerCase()){
            case "black":
                System.out.println("\u001B[30m" + userText + "\u001B[0m");
                break;
            case "red":
                System.out.println("\u001B[31m" + userText + "\u001B[0m");
                break;
            case "green":
                System.out.println("\u001B[32m" + userText + "\u001B[0m");
                break;
            case "yellow":
                System.out.println("\u001B[33m" + userText + "\u001B[0m");
                break;
            case "blue":
                System.out.println("\u001B[34m" + userText + "\u001B[0m");
                break;
            case "magenta":
                System.out.println("\u001B[35m" + userText + "\u001B[0m");
                break;
            case "cyan":
                System.out.println("\u001B[36m" + userText + "\u001B[0m");
                break;
            case "white":
                System.out.println("\u001B[37m" + userText + "\u001B[0m");
                break;
            case "gray":
                System.out.println("\u001B[90m" + userText + "\u001B[0m");
                break;
            case "brightred":
                System.out.println("\u001B[91m" + userText + "\u001B[0m");
                break;
            case "brightgreen":
                System.out.println("\u001B[92m" + userText + "\u001B[0m");
                break;
            case "brightyellow":
                System.out.println("\u001B[93m" + userText + "\u001B[0m");
                break;
            case "brightblue":
                System.out.println("\u001B[94m" + userText + "\u001B[0m");
                break;
            case "brightmagenta":
                System.out.println("\u001B[95m" + userText + "\u001B[0m");
                break;
            case "brightcyan":
                System.out.println("\u001B[96m" + userText + "\u001B[0m");
                break;
            case "brightwhite":
                System.out.println("\u001B[97m" + userText + "\u001B[0m");
                break;
            case "bgblack":
                System.out.println("\u001B[40m" + userText + "\u001B[0m");
                break;
            case "bgred":
                System.out.println("\u001B[41m" + userText + "\u001B[0m");
                break;
            case "bggreen":
                System.out.println("\u001B[42m" + userText + "\u001B[0m");
                break;
            case "bgyellow":
                System.out.println("\u001B[43m" + userText + "\u001B[0m");
                break;
            case "bgblue":
                System.out.println("\u001B[44m" + userText + "\u001B[0m");
                break;
            case "bgmagenta":
                System.out.println("\u001B[45m" + userText + "\u001B[0m");
                break;
            case "bgcyan":
                System.out.println("\u001B[46m" + userText + "\u001B[0m");
                break;
            case "bgwhite":
                System.out.println("\u001B[47m" + userText + "\u001B[0m");
                break;
            default:
                System.out.println("Color not recognized.");
                break;
        
    }
}
}
