package daggerok.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie implements Serializable {

  private static final long serialVersionUID = -4371272260347529772L;

  @Id String id;
  @NonNull String title;
}
