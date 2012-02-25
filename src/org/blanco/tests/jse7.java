/**
 * Copyright (c) 2012 Alexandro Blanco <ti3r.bubblenet@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package org.blanco.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class jse7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //Declare the resources in the try with resource.
        try (BufferedReader reader = 
                new BufferedReader(new FileReader("c:\\algo.txt"))){
            String line = reader.readLine();
            System.out.println(line);           
        }
    
        //Declare two resources in the try with resource.
        //The auto closure will be executed in the inverse order of the creation
        try (BufferedReader reader = 
                new BufferedReader(new FileReader("c:\\algo.txt"));
             BufferedReader reader2 = 
                new BufferedReader(new FileReader("c:\\algo2.txt"))                
            ){
            String line = reader.readLine();
            String line2 = reader2.readLine();
            System.out.println(line);         
            System.out.println(line2);         
        }
        
    }
}
