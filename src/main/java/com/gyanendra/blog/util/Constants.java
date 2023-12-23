package com.gyanendra.blog.util;

public class Constants {

    public static final String API_VERSION = "/v1";
    public static final String BASE_URL = "/api" + API_VERSION;

    public static final class UserPaths {
        public static final String USER_PATH = BASE_URL + "/user";
    }

    public static final class TagPath {
        public static final String TAG_PATH = BASE_URL + "/tag";
    }

    public static final class RolePath {
        public static final String ROLE_PATH = BASE_URL + "/role";
    }

    public static final class PostPaths {
        public static final String POST_PATH = BASE_URL + "/post";
    }

    public static final class Exception {
        public static final class Common {
            public static final String INVALID_PARAM_CODE = "000001";
            public static final String INVALID_PARAM = "Invalid request params";
        }

        // USER
        public static final class User {
            public static final String USER_NOT_FOUND_CODE = "000100";
            public static final String USER_NOT_FOUND = "User not found";

            public static final String USER_ALREADY_EXIST_CODE = "000101";
            public static final String USER_ALREADY_EXIST = "User already exist";

            public static final String USER_INVALID_CREDENTIALS_CODE = "000102";
            public static final String USER_INVALID_CREDENTIALS = "Invalid credentials";

            public static final String USER_ACCOUNT_LOCKED_CODE = "000103";
            public static final String USER_ACCOUNT_LOCKED = "User account is locked";
        }

        // ROLE
        public static final class Role {
            public static final String ROLE_NOT_FOUND_CODE = "000200";
            public static final String ROLE_NOT_FOUND = "Role Does not Exist";

            public static final String ROLE_ALREADY_EXIST_CODE = "000201";
            public static final String ROLE_ALREADY_EXIST = "Role Already Exist";

            public static final String ROLE_ASSIGNMENT_FAILED_CODE = "000202";
            public static final String ROLE_ASSIGNMENT_FAILED = "Role assignment failed";
        }

        // TAG
        public static final class Tag {
            public static final String TAG_NOT_FOUND_CODE = "000300";
            public static final String TAG_NOT_FOUND = "Tag not found";

            public static final String TAG_CREATION_FAILED_CODE = "000301";
            public static final String TAG_CREATION_FAILED = "Tag creation failed";

            public static final String TAG_UPDATE_FAILED_CODE = "000302";
            public static final String TAG_UPDATE_FAILED = "Tag update failed";
        }

        // POST
        public static final class Post {
            public static final String POST_NOT_FOUND_CODE = "000400";
            public static final String POST_NOT_FOUND = "Post not found";

            public static final String POST_CREATION_FAILED_CODE = "000401";
            public static final String POST_CREATION_FAILED = "Post creation failed";

            public static final String POST_UPDATE_FAILED_CODE = "000402";
            public static final String POST_UPDATE_FAILED = "Post update failed";
        }

        // AUTHENTICATION
        public static final class Authentication {
            public static final String AUTHENTICATION_FAILED_CODE = "000500";
            public static final String AUTHENTICATION_FAILED = "Authentication failed";
        }

        // AUTHORIZATION
        public static final class Authorization {
            public static final String AUTHORIZATION_FAILED_CODE = "000600";
            public static final String AUTHORIZATION_FAILED = "Authorization failed";
        }
    }

    public static final class Client {
        public static final String BASE_URL = "http://localhost:3000";
    }

}
