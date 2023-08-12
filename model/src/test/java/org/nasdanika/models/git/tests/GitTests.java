package org.nasdanika.models.git.tests;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;
import java.util.Optional;

import org.eclipse.jgit.internal.storage.commitgraph.CommitGraph;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectDatabase;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.RefDatabase;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.git.GitFactory;

public class GitTests {
	
	@Test
	public void testLoadGitRepository() throws Exception {
		File file = new File("..").getCanonicalFile();
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder().readEnvironment();
		repositoryBuilder.findGitDir(file);
		if (repositoryBuilder.getGitDir() != null) {
			try (Repository repository = repositoryBuilder.build()) {
				try (RevWalk revWalk = new RevWalk(repository)) {
					revWalk.forEach(rc -> {
						System.out.println(rc);
					});
				}
				
				org.nasdanika.models.git.Repository modelRepository = GitFactory.eINSTANCE.createRepository();
				RefDatabase refDatabase = repository.getRefDatabase();
				
//				StoredConfig config = repository.getConfig();
//				for (String remote: repository.getRemoteNames()) {
//					template.getRemotes().put(remote, config.getString("remote", "origin", "url"));
//				}
//				template.setBranch(repository.getBranch());
//				for (Ref ref: repository.getRefDatabase().getRefs()) {
//					if (ref.getName().equals(Constants.HEAD)) {
//						template.setHead(ref.getObjectId().getName());
//						for (Ref refTwo: repository.getRefDatabase().getRefs()) {
//							if (!refTwo.getName().equals(Constants.HEAD) && refTwo.getObjectId().equals(ref.getObjectId())) {
//								template.getHeadRefs().add(refTwo.getName());
//							}
//						}							
//					}
//				}
//				templates.put(repository.getWorkTree(), template);
//				GitMarker marker = EcoreUtil.copy(template);
//				URI repoWorkTreeURI = repository.getWorkTree().toURI();					
//				marker.setPath(repoWorkTreeURI.relativize(locationURI).toString());
//				marker.setLocation(location);
			}
		}
	}

}
