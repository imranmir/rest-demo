package com.im.demo

import grails.rest.Resource

@Resource(uri = '/people', formats = ['xml','json'])
class User {
    String firstName
    String lastName
    String password
    String email
    Integer age

}
