package w4;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import sy.y;
import v71.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: r, reason: collision with root package name */
    public final l f33315r;

    public a(l lVar) {
        super(false);
        this.f33315r = lVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f33315r.i(y.d(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f33315r.i(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
