package com.xed.model;

import java.util.Map;

public class Model {

	private Map<String, Node> nodeMap = null;
	private Node rootNode = new Node();
	
	public Node getNode(String id) {
		return nodeMap.get(id);
	};
	
	public void insertChild(String parentNodeId, Node childNode, int position) {
		
		Node parentNode = nodeMap.get(parentNodeId);
		
		if (parentNode!=null && childNode!=null && childNode.getName()!=null) {
			
			// TODO: validate node names
			
			childNode.setId(parentNodeId + "/" + childNode.getName());
			
			nodeMap.put(childNode.getId(), childNode);
			parentNode.insertChildId(childNode.getId(), position);
		}
	}
	
}
