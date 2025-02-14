package com.sparta.hanghaestartproject.errorcode;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CommonErrorCode implements ErrorCode {
     
     INVALID_PARAMETER("Invalid parameter included",HttpStatus.BAD_REQUEST.value()),
     INTERNAL_SERVER_ERROR("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR.value()),
     NO_ARTICLE("게시글이 존재하지 않습니다", HttpStatus.BAD_REQUEST.value()),
     NO_COMMENT("댓글이 존재하지 않습니다.", HttpStatus.BAD_REQUEST.value()),
     INVALID_USER("작성자만 삭제/수정할 수 있습니다.", HttpStatus.BAD_REQUEST.value());
     
     private final String msg;
     private final int statusCode;
}
