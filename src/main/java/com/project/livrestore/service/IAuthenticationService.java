package com.project.livrestore.service;

import com.project.livrestore.model.User;


public interface IAuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
