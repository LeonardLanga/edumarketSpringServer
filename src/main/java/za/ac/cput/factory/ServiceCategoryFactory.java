package za.ac.cput.factory;

import za.ac.cput.domain.Service;
import za.ac.cput.domain.ServiceCategory;
import za.ac.cput.util.Helper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ServiceCategoryFactory {

    public static ServiceCategory buildServiceCategory(int serviceCat_id, String serviceCat_name) {
        if(Helper.isZero(serviceCat_id) || Helper.isNullOrEmpty(serviceCat_name))
            return null;
        return new ServiceCategory.Builder()
                .setServiceCat_id(serviceCat_id)
                .setServiceCat_Name(serviceCat_name)
                .build();
    }

    public static class ServiceCategoryBuilder {
        private Set<Service> services = new HashSet<>();

        public ServiceCategoryBuilder service(Service service) {
            this.services.add(service);
            return this;
        }
    }
}
