package com.dhams.cloudvendor.controller;

import com.dhams.cloudvendor.model.CloudVendor;
import com.dhams.cloudvendor.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @PostMapping("/create")
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Created Successfully";
    }

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendor(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
    public List<CloudVendor> listCloudVendors(){
        return cloudVendorService.listCloudVendors();
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Deleted Successfully";
    }
}
