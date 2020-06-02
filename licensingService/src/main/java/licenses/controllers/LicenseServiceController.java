package licenses.controllers;

import licenses.model.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//tells the Spring Container that this Java class is going to be used for a REST-based service.
/* Unlike the traditional Spring @Controller annotation, the @RestController annotation
    doesn’t require you as the developer to return a ResponseBody class from your controller  class*/
@RequestMapping(value="/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @RequestMapping(value="/{licenseId}",method = RequestMethod.GET)
    public License getLicenses(
            @PathVariable("organizationId") String organizationId,
            @PathVariable("licenseId") String licenseId) {
        return new License()
                .withId(licenseId)
                .withProductName("Teleco")
                .withLicenseType("Seat")
                .withOrganizationId("TestOrg");
    }
}
