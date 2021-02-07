package com.lakshan.actuatordemo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "version")
public class VersionEndpoint {
    Map<String, Version> versions = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Version> getAllVersions() {
        return versions;
    }

    @ReadOperation
    public Version getVersion(@Selector String name) {
        return versions.get(name);
    }

    @WriteOperation
    public void setValue(@Selector String name, int version) {
        versions.put(name, new Version(version));
    }

    static class Version {
        int value;

        public Version(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
