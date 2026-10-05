package j$.time;

import java.time.Duration;

/* loaded from: /home/user/work/p/classes2.dex */
public final class DesugarDuration {
    public static long toDaysPart(Duration duration) {
        return duration.getSeconds() / 86400;
    }

    public static int toHoursPart(Duration duration) {
        return (int) (duration.toHours() % 24);
    }

    public static int toMinutesPart(Duration duration) {
        return (int) (duration.toMinutes() % 60);
    }
}
