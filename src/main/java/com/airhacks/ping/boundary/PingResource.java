package com.airhacks.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    MyMessageSender myMessageSender;

    @GET
    public String ping() {
        myMessageSender.sendMessage();
        return "Enjoy Java EE 8!";
    }

}
