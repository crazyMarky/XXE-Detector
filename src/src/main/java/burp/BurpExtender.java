package burp;

import java.io.PrintWriter;

public class BurpExtender implements IBurpExtender{

    private final static String name = "XXE-Detector";

    private final static String version = "v1.0.0";

    private static PrintWriter stdout;
    private static IExtensionHelpers helpers;

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        BurpExtender.stdout = new PrintWriter(callbacks.getStdout(), true);
        BurpExtender.helpers = callbacks.getHelpers();

        stdout.println("Welcome to use "+name+" "+version);
        stdout.println("Repository:https://github.com/crazyMarky/XXE-Detector");
    }
}
