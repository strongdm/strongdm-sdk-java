// Todo: this package name is hard coded
package com.strongdm.api.v1;

// Todo: this class name should be capitalized
// Todo: each inner class should be in its own file, so we can remove trimProto and the outer class
public class nodes {
    /* RequestMetadata */ 
    public static class RequestMetadata {
            
            private String page;
            public String getPage() {
                return this.page;
            }
            public setPage(String in) {
                this.page = in;
            }
        
    }
    /* ResponseMetadata */ 
    public static class ResponseMetadata {
            
            private String next_page;
            public String getNextPage() {
                return this.next_page;
            }
            public setNextPage(String in) {
                this.next_page = in;
            }
        
            
            private long found;
            public long getFound() {
                return this.found;
            }
            public setFound(long in) {
                this.found = in;
            }
        
            
            private long affected;
            public long getAffected() {
                return this.affected;
            }
            public setAffected(long in) {
                this.affected = in;
            }
        
    }
    
    public static class NodeCreateRequest {
            
            private RequestMetadata metadata;
            public RequestMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(RequestMetadata in) {
                this.metadata = in;
            }
        
            
            private Node nodes;
            public Node getNodes() {
                return this.nodes;
            }
            public setNodes(Node in) {
                this.nodes = in;
            }
        
    }
    
    public static class NodeCreateResponse {
            
            private ResponseMetadata metadata;
            public ResponseMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(ResponseMetadata in) {
                this.metadata = in;
            }
        
            
            private Node nodes;
            public Node getNodes() {
                return this.nodes;
            }
            public setNodes(Node in) {
                this.nodes = in;
            }
        
            
            private NodeCreateResponse.TokensEntry tokens;
            public NodeCreateResponse.TokensEntry getTokens() {
                return this.tokens;
            }
            public setTokens(NodeCreateResponse.TokensEntry in) {
                this.tokens = in;
            }
        
    }
    
    public static class NodeGetRequest {
            
            private RequestMetadata metadata;
            public RequestMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(RequestMetadata in) {
                this.metadata = in;
            }
        
            
            private String id;
            public String getId() {
                return this.id;
            }
            public setId(String in) {
                this.id = in;
            }
        
    }
    
    public static class NodeGetResponse {
            
            private ResponseMetadata metadata;
            public ResponseMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(ResponseMetadata in) {
                this.metadata = in;
            }
        
            
            private Node node;
            public Node getNode() {
                return this.node;
            }
            public setNode(Node in) {
                this.node = in;
            }
        
    }
    
    public static class NodeUpdateRequest {
            
            private RequestMetadata metadata;
            public RequestMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(RequestMetadata in) {
                this.metadata = in;
            }
        
            
            private String id;
            public String getId() {
                return this.id;
            }
            public setId(String in) {
                this.id = in;
            }
        
            
            private Node node;
            public Node getNode() {
                return this.node;
            }
            public setNode(Node in) {
                this.node = in;
            }
        
    }
    
    public static class NodeUpdateResponse {
            
            private ResponseMetadata metadata;
            public ResponseMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(ResponseMetadata in) {
                this.metadata = in;
            }
        
            
            private Node node;
            public Node getNode() {
                return this.node;
            }
            public setNode(Node in) {
                this.node = in;
            }
        
    }
    
    public static class NodeDeleteRequest {
            
            private RequestMetadata metadata;
            public RequestMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(RequestMetadata in) {
                this.metadata = in;
            }
        
            
            private String id;
            public String getId() {
                return this.id;
            }
            public setId(String in) {
                this.id = in;
            }
        
    }
    
    public static class NodeDeleteResponse {
            
            private ResponseMetadata metadata;
            public ResponseMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(ResponseMetadata in) {
                this.metadata = in;
            }
        
    }
    
    public static class NodeListRequest {
            
            private RequestMetadata metadata;
            public RequestMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(RequestMetadata in) {
                this.metadata = in;
            }
        
            
            private String filter;
            public String getFilter() {
                return this.filter;
            }
            public setFilter(String in) {
                this.filter = in;
            }
        
    }
    
    public static class NodeListResponse {
            
            private ResponseMetadata metadata;
            public ResponseMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(ResponseMetadata in) {
                this.metadata = in;
            }
        
            
            private Node nodes;
            public Node getNodes() {
                return this.nodes;
            }
            public setNodes(Node in) {
                this.nodes = in;
            }
        
    }
    
    public static class NodeBatchUpdateRequest {
            
            private RequestMetadata metadata;
            public RequestMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(RequestMetadata in) {
                this.metadata = in;
            }
        
            
            private Node nodes;
            public Node getNodes() {
                return this.nodes;
            }
            public setNodes(Node in) {
                this.nodes = in;
            }
        
    }
    
    public static class NodeBatchUpdateResponse {
            
            private ResponseMetadata metadata;
            public ResponseMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(ResponseMetadata in) {
                this.metadata = in;
            }
        
            
            private Node nodes;
            public Node getNodes() {
                return this.nodes;
            }
            public setNodes(Node in) {
                this.nodes = in;
            }
        
    }
    
    public static class NodeBatchDeleteRequest {
            
            private RequestMetadata metadata;
            public RequestMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(RequestMetadata in) {
                this.metadata = in;
            }
        
            
            private String ids;
            public String getIds() {
                return this.ids;
            }
            public setIds(String in) {
                this.ids = in;
            }
        
    }
    
    public static class NodeBatchDeleteResponse {
            
            private ResponseMetadata metadata;
            public ResponseMetadata getMetadata() {
                return this.metadata;
            }
            public setMetadata(ResponseMetadata in) {
                this.metadata = in;
            }
        
    }
    /* Node is a domain object. */ 
    public static class Node {
            
            private Relay relay;
            public Relay getRelay() {
                return this.relay;
            }
            public setRelay(Relay in) {
                this.relay = in;
            }
        
            
            private Gateway gateway;
            public Gateway getGateway() {
                return this.gateway;
            }
            public setGateway(Gateway in) {
                this.gateway = in;
            }
        
    }
    
    public static class Relay {
             /* id is the unique ID of a relay */ 
            private String id;
            public String getId() {
                return this.id;
            }
            public setId(String in) {
                this.id = in;
            }
        
             /* name is the human readable unique name for this relay. */ 
            private String name;
            public String getName() {
                return this.name;
            }
            public setName(String in) {
                this.name = in;
            }
        
    }
    
    public static class Gateway {
             /* id is the unique ID of a gateway */ 
            private String id;
            public String getId() {
                return this.id;
            }
            public setId(String in) {
                this.id = in;
            }
        
             /* name is the human readable unique name for this relay. */ 
            private String name;
            public String getName() {
                return this.name;
            }
            public setName(String in) {
                this.name = in;
            }
        
             /* listen_address represents the network address to which nodes should dial to. */ 
            private String listen_address;
            public String getListenAddress() {
                return this.listen_address;
            }
            public setListenAddress(String in) {
                this.listen_address = in;
            }
        
             /* bind_address represents the local network address to which the gateway
 must try to bind itself. */ 
            private String bind_address;
            public String getBindAddress() {
                return this.bind_address;
            }
            public setBindAddress(String in) {
                this.bind_address = in;
            }
        
    }
    

    public static class Nodes {
         /* Nodes service */ 
        public Nodes() {
            // Todo: init
        }

        
         /* Create creates new nodes and returns them. */ 
        public NodeCreateResponse create(NodeCreateRequest request) {
            // TODO: implement this
            // Host: 
            // BasePath: 
            // Dial to /v1/nodes by POST
            // Body: *
            // ResponseBody: 
            return new NodeCreateResponse();
        }
        
         /* Get reads one node by ID */ 
        public NodeGetResponse get(NodeGetRequest request) {
            // TODO: implement this
            // Host: 
            // BasePath: 
            // Dial to /v1/nodes/{id} by GET
            // Body: 
            // ResponseBody: 
            return new NodeGetResponse();
        }
        
         /* Update patches a node by ID */ 
        public NodeUpdateResponse update(NodeUpdateRequest request) {
            // TODO: implement this
            // Host: 
            // BasePath: 
            // Dial to /v1/nodes/{id} by PUT
            // Body: *
            // ResponseBody: 
            return new NodeUpdateResponse();
        }
        
         /* Delete removes a node by ID */ 
        public NodeDeleteResponse delete(NodeDeleteRequest request) {
            // TODO: implement this
            // Host: 
            // BasePath: 
            // Dial to /v1/nodes/{id} by DELETE
            // Body: 
            // ResponseBody: 
            return new NodeDeleteResponse();
        }
        
         /* List is a batched Get call */ 
        public NodeListResponse list(NodeListRequest request) {
            // TODO: implement this
            // Host: 
            // BasePath: 
            // Dial to /v1/nodes by GET
            // Body: 
            // ResponseBody: 
            return new NodeListResponse();
        }
        
         /* BatchUpdate is a batched Update call */ 
        public NodeBatchUpdateResponse batch_update(NodeBatchUpdateRequest request) {
            // TODO: implement this
            // Host: 
            // BasePath: 
            // Dial to /v1/nodes by PUT
            // Body: *
            // ResponseBody: 
            return new NodeBatchUpdateResponse();
        }
        
         /* BatchDelete is a batched Delete call */ 
        public NodeBatchDeleteResponse batch_delete(NodeBatchDeleteRequest request) {
            // TODO: implement this
            // Host: 
            // BasePath: 
            // Dial to /v1/nodes by DELETE
            // Body: 
            // ResponseBody: 
            return new NodeBatchDeleteResponse();
        }
        
    }
    
}