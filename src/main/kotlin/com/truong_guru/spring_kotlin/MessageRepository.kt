package com.truong_guru.spring_kotlin

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>