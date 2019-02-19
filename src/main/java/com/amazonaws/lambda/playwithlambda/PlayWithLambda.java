package com.amazonaws.lambda.playwithlambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PlayWithLambda implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
    	  
    		context.getLogger().log("Input: " + input);
    		String output = "Hello, " + input + "!";
    		return output;
    }

}
