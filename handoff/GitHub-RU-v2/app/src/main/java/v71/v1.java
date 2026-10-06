package v71;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class v1 extends a81.q implements Runnable {
    public long v;

    public v1(long j, c71.c cVar) {
        super(cVar, cVar.q());
        this.v = j;
    }

    @Override // v71.j1
    public final String Z() {
        return super.Z() + "(timeMillis=" + this.v + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0.p(this.t);
        u(new TimeoutCancellationException("Timed out waiting for " + this.v + " ms", this));
    }
}
