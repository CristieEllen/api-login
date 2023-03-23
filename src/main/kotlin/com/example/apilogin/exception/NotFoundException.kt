package com.example.apilogin.exception

class NotFoundException : Throwable {
    constructor ()
    constructor (message: String?)
    constructor (message: String, cause: Throwable?)
    constructor (cause: Throwable?)
}