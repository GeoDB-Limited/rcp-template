package com.geodb.e4.rcp.template.something.parts;

import javax.annotation.PostConstruct;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SomethingView {
	@PostConstruct
	public void createPartControl(Composite parent) {
		Label label = new Label(parent, SWT.BORDER);
		label.setText("GeoDB E4 RCP Something view");

	}
}
