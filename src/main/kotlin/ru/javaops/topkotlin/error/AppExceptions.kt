package ru.javaops.topkotlin.error

open class AppException(message: String) : RuntimeException(message)
class DataConflictException(msg: String) : AppException(msg)
class IllegalRequestDataException(msg: String) : AppException(msg)
class NotFoundException(msg: String) : AppException(msg)