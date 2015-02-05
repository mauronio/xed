package com.xed.model;

import java.util.ArrayList;
import java.util.List;

public class Node {

	List<String> children = new ArrayList<String>();
	String id = null;
	String name = null;
	String desc = null;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	protected void setId(String id) {
		this.id = id;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return 0;
	};

	public boolean supportsChildType(int childType) {
		return true;
	};
	
	String getChildId(int index) {
		return children.get(index);
	};

	protected void insertChildId(String childId, int position) {
		if (position<children.size()) {
			children.add(position, childId);
		}
	}

	protected void addChildId(String childId) {
		children.add(childId);
	}

	protected void replaceChildId(String childId, int position) {
		if (position<children.size()) {
			children.set(position, childId);
		}
	}
	
	protected void removeChildId(int position) {
		if (position<children.size()) {
			children.remove(position);
		}
	}
	
	public int getChildrenSize() {
		return children.size();
	}
	
	public List getChildren() {
		return children;
	}
}
