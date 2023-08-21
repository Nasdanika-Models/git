module org.nasdanika.models.git.processors {
		
	requires transitive org.nasdanika.models.git;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.git.processors;
	opens org.nasdanika.models.git.processors; // For loading resources
	
}
