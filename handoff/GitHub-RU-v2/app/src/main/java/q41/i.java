package q41;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends x3.g implements ScheduledFuture {
    public final ScheduledFuture y;

    public i(h hVar) {
        this.y = hVar.a(new kk.a(24, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.y.compareTo(delayed);
    }

    public final void d() {
        ScheduledFuture scheduledFuture = this.y;
        Object obj = ((x3.g) this).r;
        scheduledFuture.cancel((obj instanceof x3.a) && ((x3.a) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.y.getDelay(timeUnit);
    }
}
