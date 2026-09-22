package com.optimagrowth.license.service.Impl;

import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.optimagrowth.license.Repository.ServiceRepository;
import com.optimagrowth.license.model.LicenseModel;
import com.optimagrowth.license.service.LicenseService;

@Service
public class LicenseImpl implements LicenseService {

    @Autowired
    private MessageSource messages;

    @Autowired
    private ServiceRepository repository;

    @Override
    public LicenseModel getLicense(int licenseId, String organizationId) {
        Optional<LicenseModel> license = repository.findById(licenseId);
        if (license.isPresent()) {
            LicenseModel entity = license.get();
            if (organizationId != null && !organizationId.equals(entity.getOrganizationId())) {
                return null;
            }
            return entity;
        }
        return null;
    }

    @Override
    public String createLicense(LicenseModel license, String organizationId, Locale locale) {
        String responseMessage = null;
        if (!StringUtils.isEmpty(license)) {
            license.setOrganizationId(organizationId);
            repository.save(license);
            responseMessage = String.format(messages.getMessage("license.create.message", null, locale), license.toString());
        }
        return responseMessage;
    }

    @Override
    public String updateLicense(LicenseModel license, String organizationId) {
        String responseMessage = null;
        if (!StringUtils.isEmpty(license)) {
            license.setOrganizationId(organizationId);
            repository.save(license);
            responseMessage = String.format(messages.getMessage("license.update.message", null, null), license.toString());
        }
        return responseMessage;
    }

    @Override
    public String deleteLicense(int licenseId, String organizationId) {
        repository.deleteById(licenseId);
        return String.format(messages.getMessage("license.delete.message", null, null), licenseId, organizationId);
    }
}
