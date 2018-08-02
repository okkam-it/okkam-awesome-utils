package org.okkam.awesome.utils.flink.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.flink.api.common.functions.RichMapFunction;

/**
 * @author simone
 * @param <T> The dataset type
 *
 */
public class JacksonObjectMapper<T> extends RichMapFunction<T, String> {

  private static final long serialVersionUID = 1L;

  @Override
  public String map(T value) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.writeValueAsString(value);
  }

}
