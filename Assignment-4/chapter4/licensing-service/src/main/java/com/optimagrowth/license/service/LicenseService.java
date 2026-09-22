
package com.optimagrowth.license.service;
import java.util.Locale;

import com.optimagrowth.license.model.LicenseModel;

public interface LicenseService {

    LicenseModel getLicense(int licenseId, String organizationId);

    String createLicense(LicenseModel license, String organizationId, Locale locale);

    String updateLicense(LicenseModel license, String organizationId);

    String deleteLicense(int licenseId, String organizationId);
}


