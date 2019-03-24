package com.go4mi.tool.file;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.go4mi.original.entity.common.Result;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    Result store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    Result deleteAll();

}