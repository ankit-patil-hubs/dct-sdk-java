/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.9.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.api;

import com.delphix.dct.ApiException;
import com.delphix.dct.models.ListMaskingEnvironmentsResponse;
import com.delphix.dct.models.MaskingEnvironment;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchMaskingEnvironmentsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaskingEnvironmentsApi
 */
@Ignore
public class MaskingEnvironmentsApiTest {

    private final MaskingEnvironmentsApi api = new MaskingEnvironmentsApi();

    
    /**
     * Retrieve a MaskingEnvironment by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaskingEnvironmentByIdTest() throws ApiException {
        String maskingEnvironmentId = null;
        MaskingEnvironment response = api.getMaskingEnvironmentById(maskingEnvironmentId);

        // TODO: test validations
    }
    
    /**
     * Retrieve the list of masking environments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaskingEnvironmentsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListMaskingEnvironmentsResponse response = api.getMaskingEnvironments(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Search masking environments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMaskingEnvironmentsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchMaskingEnvironmentsResponse response = api.searchMaskingEnvironments(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
}
