package plugin_loader;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class ClassPathInit extends org.eclipse.jdt.core.ClasspathVariableInitializer {

	@Override
	public void initialize(String variable) {
		System.out.println("initialize bla" + variable);
		IPath p = new Path("/home/julien/test.jar");
		try {
			JavaCore.setClasspathVariable(variable, p, null);
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

}
