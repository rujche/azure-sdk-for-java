/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.paging.models.PageImpl;
import fixtures.paging.models.PagingGetMultiplePagesNextOptions;
import fixtures.paging.models.PagingGetMultiplePagesOptions;
import fixtures.paging.models.Product;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in PagingOperations.
 */
public final class PagingOperationsImpl implements PagingOperations {
    /** The Retrofit service to perform REST calls. */
    private PagingService service;
    /** The service client containing this operation class. */
    private AutoRestPagingTestService client;

    /**
     * Initializes an instance of PagingOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PagingOperationsImpl(Retrofit retrofit, AutoRestPagingTestService client) {
        this.service = retrofit.create(PagingService.class);
        this.client = client;
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePages() throws CloudException, IOException {
        Call<ResponseBody> call = service.getSinglePages(this.client.getAcceptLanguage());
        return getSinglePagesDelegate(call.execute(), null);
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSinglePagesAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getSinglePages(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePages(String clientRequestId, PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions) throws CloudException, IOException {
        Integer maxresults = null;
        Integer timeout = null;
        if (pagingGetMultiplePagesOptions != null) {
            maxresults = pagingGetMultiplePagesOptions.getMaxresults();
            timeout = pagingGetMultiplePagesOptions.getTimeout();
        }
        Call<ResponseBody> call = service.getMultiplePages(clientRequestId, this.client.getAcceptLanguage(), maxresults, timeout);
        return getMultiplePagesDelegate(call.execute(), null);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesAsync(String clientRequestId, PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Integer maxresults = null;
        Integer timeout = null;
        if (pagingGetMultiplePagesOptions != null) {
            maxresults = pagingGetMultiplePagesOptions.getMaxresults();
            timeout = pagingGetMultiplePagesOptions.getTimeout();
        }
        Call<ResponseBody> call = service.getMultiplePages(clientRequestId, this.client.getAcceptLanguage(), maxresults, timeout);
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirst() throws CloudException, IOException {
        Call<ResponseBody> call = service.getMultiplePagesRetryFirst(this.client.getAcceptLanguage());
        return getMultiplePagesRetryFirstDelegate(call.execute(), null);
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesRetryFirstAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesRetryFirst(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetryFirstDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecond() throws CloudException, IOException {
        Call<ResponseBody> call = service.getMultiplePagesRetrySecond(this.client.getAcceptLanguage());
        return getMultiplePagesRetrySecondDelegate(call.execute(), null);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesRetrySecondAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesRetrySecond(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetrySecondDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePagesFailure() throws CloudException, IOException {
        Call<ResponseBody> call = service.getSinglePagesFailure(this.client.getAcceptLanguage());
        return getSinglePagesFailureDelegate(call.execute(), null);
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSinglePagesFailureAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getSinglePagesFailure(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesFailureDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesFailureDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailure() throws CloudException, IOException {
        Call<ResponseBody> call = service.getMultiplePagesFailure(this.client.getAcceptLanguage());
        return getMultiplePagesFailureDelegate(call.execute(), null);
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesFailureAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesFailure(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUri() throws CloudException, IOException {
        Call<ResponseBody> call = service.getMultiplePagesFailureUri(this.client.getAcceptLanguage());
        return getMultiplePagesFailureUriDelegate(call.execute(), null);
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesFailureUriAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesFailureUri(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureUriDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePagesNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSinglePagesNext(nextPageLink, this.client.getAcceptLanguage());
        return getSinglePagesNextDelegate(call.execute(), null);
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSinglePagesNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSinglePagesNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesNextOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesNext(String nextPageLink, String clientRequestId, PagingGetMultiplePagesNextOptions pagingGetMultiplePagesNextOptions) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Integer maxresults = null;
        Integer timeout = null;
        if (pagingGetMultiplePagesNextOptions != null) {
            maxresults = pagingGetMultiplePagesNextOptions.getMaxresults();
            timeout = pagingGetMultiplePagesNextOptions.getTimeout();
        }
        Call<ResponseBody> call = service.getMultiplePagesNext(nextPageLink, clientRequestId, this.client.getAcceptLanguage(), maxresults, timeout);
        return getMultiplePagesNextDelegate(call.execute(), null);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesNextOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesNextAsync(String nextPageLink, String clientRequestId, PagingGetMultiplePagesNextOptions pagingGetMultiplePagesNextOptions, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Integer maxresults = null;
        Integer timeout = null;
        if (pagingGetMultiplePagesNextOptions != null) {
            maxresults = pagingGetMultiplePagesNextOptions.getMaxresults();
            timeout = pagingGetMultiplePagesNextOptions.getTimeout();
        }
        Call<ResponseBody> call = service.getMultiplePagesNext(nextPageLink, clientRequestId, this.client.getAcceptLanguage(), maxresults, timeout);
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getMultiplePagesRetryFirstNext(nextPageLink, this.client.getAcceptLanguage());
        return getMultiplePagesRetryFirstNextDelegate(call.execute(), null);
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesRetryFirstNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getMultiplePagesRetryFirstNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetryFirstNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getMultiplePagesRetrySecondNext(nextPageLink, this.client.getAcceptLanguage());
        return getMultiplePagesRetrySecondNextDelegate(call.execute(), null);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesRetrySecondNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getMultiplePagesRetrySecondNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetrySecondNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePagesFailureNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSinglePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
        return getSinglePagesFailureNextDelegate(call.execute(), null);
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSinglePagesFailureNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSinglePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesFailureNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesFailureNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailureNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getMultiplePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
        return getMultiplePagesFailureNextDelegate(call.execute(), null);
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesFailureNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getMultiplePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getMultiplePagesFailureUriNext(nextPageLink, this.client.getAcceptLanguage());
        return getMultiplePagesFailureUriNextDelegate(call.execute(), null);
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMultiplePagesFailureUriNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getMultiplePagesFailureUriNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureUriNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Product>, CloudException>()
                .register(200, new TypeToken<PageImpl<Product>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

}
