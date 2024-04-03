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
import com.delphix.dct.models.AddEngineToJobResponse;
import com.delphix.dct.models.CopyMaskingJobParameters;
import com.delphix.dct.models.CopyMaskingJobResponse;
import com.delphix.dct.models.CreateMaskingJobRequest;
import com.delphix.dct.models.CreateMaskingJobResponse;
import com.delphix.dct.models.DeleteMaskingJobResponse;
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.EngineIdBody;
import com.delphix.dct.models.ExecuteMaskingJobParameters;
import com.delphix.dct.models.ExecuteMaskingJobResponse;
import com.delphix.dct.models.ListMaskingJobSourceEnginesResponse;
import com.delphix.dct.models.ListMaskingJobsResponse;
import com.delphix.dct.models.MaskingJob;
import com.delphix.dct.models.MaskingJobConnectorsResponse;
import com.delphix.dct.models.MigrateMaskingJobParameters;
import com.delphix.dct.models.MigrateMaskingJobResponse;
import com.delphix.dct.models.ReImportMaskingJobResponse;
import com.delphix.dct.models.RemoveEngineFromJobResponse;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchMaskingJobSourceEnginesResponse;
import com.delphix.dct.models.SearchMaskingJobsResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import com.delphix.dct.models.UpdateMaskingJobParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaskingJobsApi
 */
@Ignore
public class MaskingJobsApiTest {

    private final MaskingJobsApi api = new MaskingJobsApi();

    
    /**
     * Add an engine to a Masking Job (Hyperscale Job only).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEngineToMaskingJobTest() throws ApiException {
        String maskingJobId = null;
        EngineIdBody engineIdBody = null;
        AddEngineToJobResponse response = api.addEngineToMaskingJob(maskingJobId, engineIdBody);

        // TODO: test validations
    }
    
    /**
     * Copies the masking job to another engine.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyMaskingJobTest() throws ApiException {
        String maskingJobId = null;
        CopyMaskingJobParameters copyMaskingJobParameters = null;
        CopyMaskingJobResponse response = api.copyMaskingJob(maskingJobId, copyMaskingJobParameters);

        // TODO: test validations
    }
    
    /**
     * Create a Masking Job.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMaskingJobTest() throws ApiException {
        CreateMaskingJobRequest createMaskingJobRequest = null;
        CreateMaskingJobResponse response = api.createMaskingJob(createMaskingJobRequest);

        // TODO: test validations
    }
    
    /**
     * Create tags for a Masking Job.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMaskingJobTagTest() throws ApiException {
        String maskingJobId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createMaskingJobTag(maskingJobId, tagsRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a masking job.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMaskingJobTest() throws ApiException {
        String maskingJobId = null;
        Boolean force = null;
        DeleteMaskingJobResponse response = api.deleteMaskingJob(maskingJobId, force);

        // TODO: test validations
    }
    
    /**
     * Delete tags for a Masking Job.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMaskingJobTagTest() throws ApiException {
        String maskingJobId = null;
        DeleteTag deleteTag = null;
        api.deleteMaskingJobTag(maskingJobId, deleteTag);

        // TODO: test validations
    }
    
    /**
     * Execute a MaskingJob.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeMaskingJobTest() throws ApiException {
        String maskingJobId = null;
        ExecuteMaskingJobParameters executeMaskingJobParameters = null;
        ExecuteMaskingJobResponse response = api.executeMaskingJob(maskingJobId, executeMaskingJobParameters);

        // TODO: test validations
    }
    
    /**
     * Retrieve a MaskingJob by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaskingJobByIdTest() throws ApiException {
        String maskingJobId = null;
        MaskingJob response = api.getMaskingJobById(maskingJobId);

        // TODO: test validations
    }
    
    /**
     * Get connectors for a Masking Job by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaskingJobConnectorsTest() throws ApiException {
        String maskingJobId = null;
        MaskingJobConnectorsResponse response = api.getMaskingJobConnectors(maskingJobId);

        // TODO: test validations
    }
    
    /**
     * Retrieve the list of masking jobs along with their source engine.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaskingJobSourceEnginesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListMaskingJobSourceEnginesResponse response = api.getMaskingJobSourceEngines(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Get tags for a Masking Job.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaskingJobTagTest() throws ApiException {
        String maskingJobId = null;
        TagsResponse response = api.getMaskingJobTag(maskingJobId);

        // TODO: test validations
    }
    
    /**
     * Retrieve the list of masking jobs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaskingJobsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListMaskingJobsResponse response = api.getMaskingJobs(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Migrates the masking job from its current source engine to another engine.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void migrateMaskingJobTest() throws ApiException {
        String maskingJobId = null;
        MigrateMaskingJobParameters migrateMaskingJobParameters = null;
        MigrateMaskingJobResponse response = api.migrateMaskingJob(maskingJobId, migrateMaskingJobParameters);

        // TODO: test validations
    }
    
    /**
     * Re-import the dataset from the source MaskingJob (Hyperscale Job only).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reImportMaskingJobTest() throws ApiException {
        String maskingJobId = null;
        ReImportMaskingJobResponse response = api.reImportMaskingJob(maskingJobId);

        // TODO: test validations
    }
    
    /**
     * Remove an engine from a Masking Job (Hyperscale Job only).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeEngineFromMaskingJobTest() throws ApiException {
        String maskingJobId = null;
        EngineIdBody engineIdBody = null;
        RemoveEngineFromJobResponse response = api.removeEngineFromMaskingJob(maskingJobId, engineIdBody);

        // TODO: test validations
    }
    
    /**
     * Search the list of masking jobs along with their source engine.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMaskingJobSourceEnginesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchMaskingJobSourceEnginesResponse response = api.searchMaskingJobSourceEngines(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Search masking jobs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMaskingJobsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchMaskingJobsResponse response = api.searchMaskingJobs(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Update values of a MaskingJob.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMaskingJobByIdTest() throws ApiException {
        String maskingJobId = null;
        UpdateMaskingJobParameters updateMaskingJobParameters = null;
        MaskingJob response = api.updateMaskingJobById(maskingJobId, updateMaskingJobParameters);

        // TODO: test validations
    }
    
}