// Todo: this package name is hard coded
package com.strongdm.api.v1;

// Todo: this class name should be capitalized
// Todo: each inner class should be in its own file, so we can remove trimProto and the outer class
public class options {
    
    public static class FieldOptions {
            
            private String name;
            public String getName() {
                return this.name;
            }
            public setName(String in) {
                this.name = in;
            }
        
            
            private bool sql_nullable;
            public bool getSqlNullable() {
                return this.sql_nullable;
            }
            public setSqlNullable(bool in) {
                this.sql_nullable = in;
            }
        
    }
    
    public static class MessageOptions {
            
            private String name;
            public String getName() {
                return this.name;
            }
            public setName(String in) {
                this.name = in;
            }
        
    }
    

    
}