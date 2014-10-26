class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/v1/phones"(resources: 'phone', namespace: 'v1')
        "/v2/phones"(resources: 'phone', namespace: 'v2')
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
