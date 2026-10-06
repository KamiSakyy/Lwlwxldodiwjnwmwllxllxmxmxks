package b91;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends Handler {
    public static final d a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        k71.k.g(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.a;
        String loggerName = logRecord.getLoggerName();
        k71.k.f(loggerName, "getLoggerName(...)");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        k71.k.f(message, "getMessage(...)");
        c.a(loggerName, i, message, logRecord.getThrown());
    }
    public Object ordinal() { return null; }
}
