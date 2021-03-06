// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Sort Request Builder.
 */
public class BaseWorkbookTableSortRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableSortRequestBuilder {

    /**
     * The request builder for the WorkbookTableSort
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableSortRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookTableSortRequest instance
     */
    public IWorkbookTableSortRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableSortRequest instance
     */
    public IWorkbookTableSortRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookTableSortRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookTableSortApplyRequestBuilder apply(final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final String method) {
        return new WorkbookTableSortApplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.apply"), getClient(), null, fields, matchCase, method);
    }

    public IWorkbookTableSortClearRequestBuilder clear() {
        return new WorkbookTableSortClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }

    public IWorkbookTableSortReapplyRequestBuilder reapply() {
        return new WorkbookTableSortReapplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reapply"), getClient(), null);
    }
}
