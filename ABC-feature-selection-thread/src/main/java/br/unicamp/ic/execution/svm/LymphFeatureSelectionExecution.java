package br.unicamp.ic.execution.svm;

import weka.classifiers.functions.LibSVM;

public class LymphFeatureSelectionExecution extends FeatureSelectionExecution {

	public LymphFeatureSelectionExecution(boolean[] features) {
		super("lymph.arff", features, 100, 6, 0.1, new LibSVM());
	}
	
	public static void main(String[] args) {
		boolean features[] = { true, true, true, true, true, true, true, true,
				true, true, true, true, true, true, true, true, true, true};		
		FeatureSelectionExecution fs = new LymphFeatureSelectionExecution(features);
		fs.executeAll();
	}
	
	@Override
	public void executeAll() {
		executeFullFeaturesZScore();		
		executeWithZScore();
	}
}
