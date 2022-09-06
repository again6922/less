package fu.sen.redis.exception;

public class RedisException extends RuntimeException {
    private String message;

    /**
     * 构造函数。
     *
     * @param mode 错误的模式。
     */
    public RedisException(String message) {
        super(message);
        this.message = message;
    }
}
