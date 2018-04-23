package edu.harvard.iq.dataverse.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("info/metrics")
public class Metrics extends AbstractApiBean {

    @GET
    @Path("dataverses/byCategory")
    public Response getDataversesByCategory() {
        return allowCors(ok(metricsSvc.dataversesByCategory()));
    }

    @GET
    @Path("downloads/byMonth")
    public Response getdownloadsByMonth() {
        return allowCors(ok(metricsSvc.downloadsByMonth()));
    }

}
