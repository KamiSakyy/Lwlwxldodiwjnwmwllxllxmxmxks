package a81;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public class k {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a2 = mVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                m c = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) a.get(this);
        mVar.getClass();
        long j = m.f.get(mVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d = mVar.d();
            if (d != m.g) {
                return d;
            }
            m c = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
