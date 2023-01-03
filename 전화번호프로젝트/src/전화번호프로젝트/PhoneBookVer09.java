package 전화번호프로젝트;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

interface INIT_MENU {
	int INPUT=1, EXIT=2;
}

interface INPUT_SELECT {
	int NORMAL=1, UNIV=2, COMPANY=3;	
}

class menuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice=choice;
	}
	
	public void showWrongChoice() {
		
	}
}


