package com.xed.model.project;

import com.xed.model.Node;

public class File extends Node {

	@Override
	public int getType() {
		return Project.typeFile;
	}

	@Override
	public boolean supportsChildType(int childType) {
		return false;
	}

}
