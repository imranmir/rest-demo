package com.im.demo.v1

import com.im.demo.Phone
import grails.rest.RestfulController

class PhoneController extends RestfulController<Phone>{

    static namespace = "v1"

    public PhoneController(){
        super(Phone)
    }

    def index(){
        respond(['status': "This version is depricated"])
    }


}
