package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import com.nowcoder.community.service.CommentService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    // 评论对象、评论对象id、分页起始、每页数目
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    int selectCountByEntity(int entityType, int entityId);

    int insertComment(Comment comment);

    Comment selectCommentById(int id);

}
