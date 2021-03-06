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
 * The interface for the Base Ios Device Features Configuration Request.
 */
public interface IBaseIosDeviceFeaturesConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosDeviceFeaturesConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosDeviceFeaturesConfiguration> callback);

    /**
     * Gets the IosDeviceFeaturesConfiguration from the service
     *
     * @return the IosDeviceFeaturesConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosDeviceFeaturesConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosDeviceFeaturesConfiguration with a source
     *
     * @param sourceIosDeviceFeaturesConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration, final ICallback<IosDeviceFeaturesConfiguration> callback);

    /**
     * Patches this IosDeviceFeaturesConfiguration with a source
     *
     * @param sourceIosDeviceFeaturesConfiguration the source object with updates
     * @return the updated IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosDeviceFeaturesConfiguration patch(final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration) throws ClientException;

    /**
     * Posts a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration, final ICallback<IosDeviceFeaturesConfiguration> callback);

    /**
     * Posts a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the new object to create
     * @return the created IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosDeviceFeaturesConfiguration post(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosDeviceFeaturesConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosDeviceFeaturesConfigurationRequest expand(final String value);

}

