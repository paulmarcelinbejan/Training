package com.paulmarcelinbejan.training.stackoverflow.jackson.Q1;

import static com.paulmarcelinbejan.toolbox.utils.io.config.FileType.YAML;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.paulmarcelinbejan.toolbox.utils.io.FileUtils;
import com.paulmarcelinbejan.toolbox.utils.io.config.FileInfo;
import com.paulmarcelinbejan.toolbox.utils.io.enums.DirectoryPath;
import com.paulmarcelinbejan.toolbox.utils.yaml.YamlFileUtils;
import com.paulmarcelinbejan.toolbox.utils.yaml.config.YamlFileUtilsConfig;
import com.paulmarcelinbejan.toolbox.utils.yaml.config.YamlReaderConfig;
import com.paulmarcelinbejan.toolbox.utils.yaml.config.YamlWriterConfig;

/**
 * 
 * https://stackoverflow.com/questions/77491853/generated-yaml-file-not-being-formatted-as-desired/77510481#77510481
 *
 */
class YamlTest {

	@Test
	void writeYamlTest() throws IOException {
		YamlReaderConfig readerConfig = new YamlReaderConfig(
				Collections.emptyMap(), 
				List.of(DeserializationFeature.UNWRAP_ROOT_VALUE), 
				Collections.emptyList());
		YamlWriterConfig writerConfig = new YamlWriterConfig(
				Collections.emptyMap(), 
				List.of(SerializationFeature.WRAP_ROOT_VALUE), 
				Collections.emptyList());
		YamlFileUtilsConfig yamlFileUtilsConfig = new YamlFileUtilsConfig(Collections.emptyList(), List.of(YAMLGenerator.Feature.INDENT_ARRAYS_WITH_INDICATOR), List.of(YAMLGenerator.Feature.WRITE_DOC_START_MARKER, YAMLGenerator.Feature.USE_NATIVE_TYPE_ID), readerConfig, writerConfig);
		
		YamlFileUtils<DataList> yaml = new YamlFileUtils<>(DataList.class, yamlFileUtilsConfig);
		FileInfo fileInfo = new FileInfo(DirectoryPath.SRC_TEST_RESOURCES.value, "users", YAML);
		
		DataList list = new DataList();
		  
		for (int inc = 0; inc < 5; inc++) {
			DataTest test = DataTest.builder()
					.userID(inc + 1)
					.userName(SomeData.theNames[inc])
					.streetAddress(SomeData.theAddresses[inc])
					.theCity(SomeData.theCities[inc])
					.build();
			list.add(test);
		}

		yaml.write(fileInfo, list);
		
		assertDoesNotThrow(() -> FileUtils.createFileReader(fileInfo));
	}
	
}
