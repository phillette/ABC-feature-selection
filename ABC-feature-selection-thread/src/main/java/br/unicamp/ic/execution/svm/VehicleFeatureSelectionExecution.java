package br.unicamp.ic.execution.svm;

import weka.classifiers.functions.LibSVM;

public class VehicleFeatureSelectionExecution extends FeatureSelectionExecution {

	public VehicleFeatureSelectionExecution(boolean[] features) {
		super("vehicle.arff", features, 100, 6, 0.1, new LibSVM());
	}

	public static void main(String[] args) {
		boolean features[] = { true, true, true, true, true, true, true, true,
				true, true, true, true, true, true, true, true, true, true };
		FeatureSelectionExecution fs = new VehicleFeatureSelectionExecution(
				features);
		fs.executeAll();
	}
}
