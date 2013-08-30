/**
 * A nice fake client
 */
package com.simperium.testapp.mock;

import com.simperium.client.ClientFactory;
import com.simperium.client.User;
import com.simperium.client.Bucket;

import com.simperium.storage.MemoryStore;

public class MockClient implements ClientFactory {

    public String accessToken = "fake-token";

    @Override
    public MockAuthProvider buildAuthProvider(String appId, String appSecret){
        return new MockAuthProvider(){
            @Override
            public String getAccessToken(){
                return accessToken;
            }

            @Override
            public void setAccessToken(String token){
                accessToken = token;
            }

            @Override
            public void clearAccessToken(){
                accessToken = null;
            }
        };
    }

    @Override
    public MockChannelProvider buildChannelProvider(String appId){
        return new MockChannelProvider();
    }

    @Override
    public MemoryStore buildStorageProvider(){
        return new MemoryStore();
    }

    @Override
    public MockGhostStore buildGhostStorageProvider(){
        return new MockGhostStore();
    }

    @Override
    public MockCacheProvider buildObjectCacheProvider(){
        return new MockCacheProvider();
    }

    @Override
    public MockSyncService buildSyncService(){
        return new MockSyncService();
    }

}