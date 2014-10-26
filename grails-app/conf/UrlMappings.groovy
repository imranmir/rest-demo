class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
//        "/manufecturers"(resources: 'manufecturer')   //todo
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
