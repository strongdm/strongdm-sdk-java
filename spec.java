// Todo: this package name is hard coded
package com.strongdm.api.v1;

// Todo: this class name should be capitalized
// Todo: each inner class should be in its own file, so we can remove trimProto and the outer class
public class spec {
    
    public static class ErrorDetail {
            
            private String message;
            public String getMessage() {
                return this.message;
            }
            public setMessage(String in) {
                this.message = in;
            }
        
    }
    

    
}