/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.example.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 * This is the Microservice resource class.
 * See <a href="https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 0.1-SNAPSHOT
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Path("/service")
public class Packet_loss {

    @POST
    @Path("/")
    public String post() {
        // TODO: Implementation for HTTP GET request
        System.out.println("POST invoked");
        return "Hello from WSO2 MSF4J";
	}
@GET
	public String resource1(){
    //public static void main(String[] args) {
        // write your code here
        // TODO: Implementation for HTTP GET request
        //System.out.println("GET invoked");
        //return "Hello from WSO2 MSF4J";
	//System.out.println("");
		



        ProcessBuilder pb = new ProcessBuilder("/home/vasanthan/msservice-samples/Packet_loss/pkt_loss.sh", "myArg1", "myArg2");
        try {
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("exception");
        }
	
	System.out.println("GET invoked");
        return "Hello from WSO2 MSF4J";



    }
}
