package c81;

import a81.u;
import java.util.concurrent.Executor;
import v71.v;
import v71.w0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends w0 implements Executor {
    public static final d t = new d();
    public static final v u;

    static {
        l lVar = l.t;
        int i = u.a;
        if (64 >= i) {
            i = 64;
        }
        u = lVar.M0(a81.bShadow.l(i, "kotlinx.coroutines.io.parallelism", 12));
    }

    @Override // v71.v
    public final void J0(a71.h hVar, Runnable runnable) {
        u.J0(hVar, runnable);
    }

    @Override // v71.v
    public final void K0(a71.h hVar, Runnable runnable) {
        u.K0(hVar, runnable);
    }

    @Override // v71.v
    public final v M0(int i) {
        return l.t.M0(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        J0(a71.i.r, runnable);
    }

    @Override // v71.v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
