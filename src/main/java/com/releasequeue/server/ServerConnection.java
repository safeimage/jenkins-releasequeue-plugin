/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.releasequeue.server;

import hudson.FilePath;
import java.io.IOException;
import java.net.MalformedURLException;
import org.json.simple.JSONArray;

/**
 *
 * @author adrian
 */
public interface ServerConnection {

    public void setCredentials(String serverUrl, String email, String password) throws MalformedURLException;
    public void uploadPackage(FilePath packagePath, String distribution, String component) throws MalformedURLException, IOException;
    public JSONArray listProducts() throws IOException;
    public JSONArray listSubscriptions(String productId) throws MalformedURLException, IOException;
    public void addWebHookSubscription(String productName, String targetUrl) throws MalformedURLException, IOException;
    public void removeWebHookSubscription(String productName, String targetUrl) throws IOException;
    
}
