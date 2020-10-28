package io.sentry;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/** No-op implementation of ISerializer */
final class NoOpSerializer implements ISerializer {

  private static final NoOpSerializer instance = new NoOpSerializer();

  public static NoOpSerializer getInstance() {
    return instance;
  }

  private NoOpSerializer() {}

  @Override
  public @Nullable SentryEvent deserializeEvent(Reader reader) {
    return null;
  }

  @Override
  public @Nullable Session deserializeSession(Reader reader) {
    return null;
  }

  @Override
  public @Nullable Transaction deserializeTransaction(Reader reader) {
    return null;
  }

  @Override
  public @Nullable SentryEnvelope deserializeEnvelope(InputStream inputStream) {
    return null;
  }

  @Override
  public <T> void serialize(T entity, Writer writer) throws IOException {}

  @Override
  public void serialize(SentryEnvelope envelope, Writer outputStream) throws Exception {}

  @Override
  public @Nullable String serialize(Map<String, Object> data) throws Exception {
    return null;
  }
}
