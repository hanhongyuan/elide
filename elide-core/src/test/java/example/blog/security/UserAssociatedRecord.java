/*
 * Copyright 2016, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package example.blog.security;

import example.blog.Blogger;

public interface UserAssociatedRecord {
    Blogger getUser();
}