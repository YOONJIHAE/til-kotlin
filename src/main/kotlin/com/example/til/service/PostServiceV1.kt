package com.example.til.service

import com.example.til.constant.ErrorCodeEnum
import com.example.til.dto.PostRequestV1
import com.example.til.dto.PostResponseV1
import com.example.til.exception.NotFoundException
import com.example.til.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class PostServiceV1(
    private val postRepository: PostRepository
) {
    @Transactional
    fun save(requestDto: PostRequestV1.PostSaveRequestV1): Long? = postRepository.save(requestDto.toEntity()).id

    @Transactional
    fun update(id: Long, requestDto: PostRequestV1.PostUpdateRequestV1): Long? {
        val post = postRepository.findByIdOrNull(id) ?: throw NotFoundException(ErrorCodeEnum.BAD_REQUEST)

        post.title = requestDto.title
        post.content = requestDto.content

        return id
    }

    @Transactional
    fun findPostById(id: Long): PostResponseV1 {
        val post = postRepository.findByIdOrNull(id) ?: throw NotFoundException(ErrorCodeEnum.BAD_REQUEST)
        return PostResponseV1(post)
    }

    @Transactional
    fun delete(id: Long): String {
        val post = postRepository.findByIdOrNull(id) ?: throw NotFoundException(ErrorCodeEnum.BAD_REQUEST)
        postRepository.delete(post)
        return "id = $id, 해당하는 게시글을 삭제했습니다."
    }
}