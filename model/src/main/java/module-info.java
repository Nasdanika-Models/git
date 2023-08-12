module org.nasdanika.models.git {
	exports org.nasdanika.models.git;
	exports org.nasdanika.models.git.impl;
	exports org.nasdanika.models.git.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.jgit;
	
}