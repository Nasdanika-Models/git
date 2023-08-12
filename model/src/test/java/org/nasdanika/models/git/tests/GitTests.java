package org.nasdanika.models.git.tests;

import java.io.File;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.RefDatabase;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.junit.jupiter.api.Test;

public class GitTests {
	
	@Test
	public void testLoadGitRepository() throws Exception {
		File file = new File("..").getCanonicalFile();
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder().readEnvironment();
		repositoryBuilder.findGitDir(file);
		File gitDir = repositoryBuilder.getGitDir();
		System.out.println(gitDir.getCanonicalPath());
		if (gitDir != null) {
			try (Repository repository = repositoryBuilder.build()) {
//				try (Git git = new Git(repository)) {
//					Iterable<RevCommit> log = git.log().call();
//					for (RevCommit logEntry: log) {
//						System.out.println("------------------");
//						System.out.println(logEntry.getAuthorIdent());
//						System.out.println(logEntry.getCommitterIdent());
//						System.out.println(logEntry.getFooterLines());
//						System.out.println(logEntry.getFullMessage());
//						System.out.println(logEntry.getId());
//						System.out.println(logEntry.getName());
//						System.out.println(logEntry.getParents());
//						System.out.println(logEntry.getShortMessage()); // Not needed?
//						RevTree tree = logEntry.getTree();
//						System.out.println(tree);
//						try (TreeWalk treeWalk = new TreeWalk(repository)) {
//							treeWalk.addTree(tree);
//							treeWalk.setRecursive(true);
//							// TODO
//						}												
//					}
//				}
				
				RefDatabase refDb = repository.getRefDatabase();
				for (Ref ref: refDb.getRefs()) {
					System.out.println(ref);
					System.out.println(ref.getTarget());
					System.out.println("---");
				}
				
//				org.nasdanika.models.git.Repository modelRepository = GitFactory.eINSTANCE.createRepository();
//				RefDatabase refDatabase = repository.getRefDatabase();
				
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
