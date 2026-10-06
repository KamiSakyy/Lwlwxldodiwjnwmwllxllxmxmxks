package v71;

import com.google.android.gms.internal.measurement.b4;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i0 extends a81.q {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(i0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // a81.q, v71.j1
    public final void n(Object obj) {
        o(obj);
    }

    @Override // a81.q, v71.j1
    public final void o(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = v;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                a81.bShadow.h(b4.T(this.u), b0.B(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
