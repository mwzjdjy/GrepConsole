package krasa.grepconsole;

import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.openapi.project.Project;

public class MyConsoleViewImpl extends ConsoleViewImpl {
	private final ConsoleViewImpl parentConsoleView;

	public MyConsoleViewImpl(Project project, boolean viewer, ConsoleViewImpl parentConsoleView) {
		super(project, viewer);
		this.parentConsoleView = parentConsoleView;
	}

	public ConsoleViewImpl getParentConsoleView() {
		return parentConsoleView;
	}
}
