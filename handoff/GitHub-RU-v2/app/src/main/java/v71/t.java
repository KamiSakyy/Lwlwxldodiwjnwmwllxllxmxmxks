package v71;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public class t {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public Throwable a;

    public t(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
