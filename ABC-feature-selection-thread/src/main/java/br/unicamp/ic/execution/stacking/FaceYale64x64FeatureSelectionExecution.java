package br.unicamp.ic.execution.stacking;

public class FaceYale64x64FeatureSelectionExecution extends FeatureSelectionExecution {

	public FaceYale64x64FeatureSelectionExecution(boolean[] features) {
		super("faces-yale.arff", features, 150, 6, 0.3);
	}
	
	public static void main(String[] args) {
		boolean features[] = { true, true, true, true, true, true, true, true, true, true,
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,        		               
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true, true, true, true, true,
		 		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,
        		               true, true, true, true, true, true, true, true, true, true,        		               
        		               true, true, true, true, true, true};
		
		FeatureSelectionExecution fs = new FaceYale64x64FeatureSelectionExecution(features);
		fs.executeAll();

//		Date date1 = new Date();
//		final int KFOLD = 10;
//		final String datasetFilename = "faces-yale.arff";		
//		ClassifierExecutor executor = new StackingClassifierExecutor();
//		executor.loadFeatures(datasetFilename);		
//		double r = executor.execute(features, KFOLD);
//		
//		long time = new Date().getTime() - date1.getTime();
//
//		System.out.println("End "+time);
	}
	
	@Override
	public void executeAll() {
		executeFullFeaturesWithNoFilters();		
		executeWithNoFilter();
	}
}
