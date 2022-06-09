package com.example.til.controller

import com.example.til.dto.PostRequestV1
import com.example.til.dto.PostResponseV1
import org.springframework.web.bind.annotation.*
import com.example.til.service.PostServiceV1

@RestController
@RequestMapping("/api/v1/post")
class PostControllerV1(
    private val postServiceV1: PostServiceV1
) {

    @GetMapping("/{id}")
    fun findPostById(@PathVariable id: Long): PostResponseV1 = postServiceV1.findPostById(id)

    @PostMapping
    fun save(@RequestBody requestDto: PostRequestV1.PostSaveRequestV1): Long? = postServiceV1.save(requestDto)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody requestDto: PostRequestV1.PostUpdateRequestV1): Long? = postServiceV1.update(id, requestDto)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): String? = postServiceV1.delete(id)

}