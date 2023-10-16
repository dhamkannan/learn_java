package com.dhams.cloudvendor.service;

import com.dhams.cloudvendor.model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CloudVendorService {
    public void createCloudVendor(CloudVendor cloudVendor);
    public CloudVendor getCloudVendor(String vendorId);
    public void deleteCloudVendor(String vendorId);
    public List<CloudVendor> listCloudVendors();
}
