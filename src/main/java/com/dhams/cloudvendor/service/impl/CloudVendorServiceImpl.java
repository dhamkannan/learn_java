package com.dhams.cloudvendor.service.impl;

import com.dhams.cloudvendor.model.CloudVendor;
import com.dhams.cloudvendor.repository.CloudVendorRepository;
import com.dhams.cloudvendor.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public void createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public void deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
    }

    @Override
    public List<CloudVendor> listCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
