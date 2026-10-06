package v71;

import java.util.concurrent.ScheduledFuture;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m0 implements n0 {
    public ScheduledFuture r;

    public m0(ScheduledFuture scheduledFuture) {
        this.r = scheduledFuture;
    }

    @Override // v71.n0
    public final void a() {
        this.r.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.r + ']';
    }
}
