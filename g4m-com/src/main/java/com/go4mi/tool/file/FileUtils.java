package com.go4mi.tool.file;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.go4mi.original.entity.common.Result;


public class FileUtils implements StorageService{

	public void init() {
		
	}

	public Result store(MultipartFile file) {
		
		return null;
	}

	public Stream<Path> loadAll() {
		return null;
	}

	public Path load(String filename) {
		return null;
	}

	public Resource loadAsResource(String filename) {
		return null;
	}

	public Result deleteAll() {
		return null;
	}
}
