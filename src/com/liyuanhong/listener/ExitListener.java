package com.liyuanhong.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);		
	}
}
