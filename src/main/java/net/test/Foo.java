package net.test;

import org.springframework.security.access.prepost.PreAuthorize;

public interface Foo {

    @PreAuthorize("hasAuthority('ROLE_USER')")
    void userRequired();
    
    @PreAuthorize("hasAuthority('ROLE_GOD')")
    void godRequired();
}
