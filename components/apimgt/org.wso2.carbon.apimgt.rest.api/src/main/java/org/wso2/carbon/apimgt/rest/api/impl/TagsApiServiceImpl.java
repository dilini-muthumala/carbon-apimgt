package org.wso2.carbon.apimgt.rest.api.impl;

import org.wso2.carbon.apimgt.rest.api.*;
import org.wso2.carbon.apimgt.rest.api.model.*;


import org.wso2.carbon.apimgt.rest.api.model.Error;

import java.util.List;
import org.wso2.carbon.apimgt.rest.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class TagsApiServiceImpl extends TagsApiService {
  
      @Override
      public Response tagsGet(String accept,String ifNoneMatch,String query)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}