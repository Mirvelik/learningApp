package com.vadimlopatka.patterns.facade;

import com.vadimlopatka.patterns.facade.services.HouseInteriorService;
import com.vadimlopatka.patterns.facade.services.HouseRoofService;
import com.vadimlopatka.patterns.facade.services.HouseSkeletonService;

public class BuildHouseFacade {

    private HouseRoofService roof;
    private HouseInteriorService interior;
    private HouseSkeletonService skeleton;

    public BuildHouseFacade() {
        roof = new HouseRoofService();
        interior = new HouseInteriorService();
        skeleton = new HouseSkeletonService();
    }


    /**
     * Facade for house building services
     */
    public void build() {
        skeleton.buildSkeleton();
        roof.buildRoof();
        interior.prepareInterior();
    }
}
