package com.wepay.business;

import com.wepay.business.resource.storage.FileSystemStorageService;
import com.wepay.business.resource.storage.StorageProperties;
import com.wepay.business.resource.storage.StorageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}

	@Bean
  public StorageService fileSystemStorageService(StorageProperties storageProperties) {
	  return new FileSystemStorageService(storageProperties);
  }
}
