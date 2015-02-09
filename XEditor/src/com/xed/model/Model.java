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
			parentNode.insertChild(childNode.getId(), position);
		}
	}
	
	public void addChild(String parentNodeId, Node childNode) {
		
		Node parentNode = nodeMap.get(parentNodeId);
		
		if (parentNode!=null && childNode!=null && childNode.getName()!=null) {
			
			// TODO: validate node names
			
			childNode.setId(parentNodeId + "/" + childNode.getName());
			
			nodeMap.put(childNode.getId(), childNode);
			parentNode.addChild(childNode.getId());
		}
	}

	public void replaceChild(String parentNodeId, Node childNode, int position) {
		
		Node parentNode = nodeMap.get(parentNodeId);
		
		if (parentNode!=null && childNode!=null && childNode.getName()!=null) {
			
			// TODO: validate node names
			
			String oldChildId = parentNode.getChildId(position);
			
			nodeMap.remove(oldChildId);
			
			childNode.setId(parentNodeId + "/" + childNode.getName());
			
			nodeMap.put(childNode.getId(), childNode);
			parentNode.replaceChild(childNode.getId(), position);
		}
	}

	public void removeChild(String parentNodeId, int position) {
		
		Node parentNode = nodeMap.get(parentNodeId);
		
		if (parentNode!=null) {
			
			// TODO: validate node names
			
			String oldChildId = parentNode.getChildId(position);
			
			nodeMap.remove(oldChildId);
			
			parentNode.removeChild(position);
		}
	}

	public void removeChild(String parentNodeId, String childId) {
		
		Node parentNode = nodeMap.get(parentNodeId);
		
		if (parentNode!=null && childId!=null) {
			
			// TODO: validate node names
			
			nodeMap.remove(childId);
			
			parentNode.removeChild(childId);
		}
	}

}
