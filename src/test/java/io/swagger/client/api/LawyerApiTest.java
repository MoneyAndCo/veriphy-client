/*
 * Veriphy API
 * This API provides access to the ID/AML, Company and Lawyer check services provided by Veriphy. This API is secured - please contact us to request test credentials.<br/>The API can send and receive either JSON or XML - please explore the API methods and the return types/parameters below.
 *
 * OpenAPI spec version: v1
 * Contact: support@veriphy.co.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.VeriphyLawyerCheckRequestTO;
import io.swagger.client.model.VeriphyLawyerCheckResponseTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LawyerApi
 */
@Ignore
public class LawyerApiTest {

    private final LawyerApi api = new LawyerApi();

    
    /**
     * Retrieve an existing Lawyer check.
     *
     * Retrieves a check that has already been placed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lawyerGetTest() throws ApiException {
        String checkID = null;
        String userName = null;
        String password = null;
        VeriphyLawyerCheckResponseTO response = api.lawyerGet(checkID, userName, password);

        // TODO: test validations
    }
    
    /**
     * Perform a Lawyer check.
     *
     * #VeriphyLawyerCheckRequestTO  VeriphyLawyerCheckRequestTO is a DTO that contains all the information required by the service to perform an identity check. It consists of 3 objects:  * VeriphyServiceTO  * AuthenticationTO  * LawyerTO    ##VeriphyServiceTO  You must specify the service code in the &#x60;VeriphyServiceTO&#x60; object. Valid service codes are:  * **LAWYERCHECK** - Lawyer Check    A formatted PDF can also be returned by the API - simply set the &#x60;VeriphyServiceTO&#x60; *returnPDF* property to _true_.    ##AuthenticationTO  Specify your username and password to access the service. Credentials can be obtained from [Veriphy Support](mailto:support@veriphy.co.uk)    ##LawyerTO  The LawyerTO object contains the details about the company to be checked.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lawyerPostTest() throws ApiException {
        VeriphyLawyerCheckRequestTO check = null;
        VeriphyLawyerCheckResponseTO response = api.lawyerPost(check);

        // TODO: test validations
    }
    
}
