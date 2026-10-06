package c81;

import v71.v;

/* loaded from: /home/user/work/p/classes5.dex */
public final class l extends v {
    public static final l t = new l();

    @Override // v71.v
    public final void J0(a71.h hVar, Runnable runnable) {
        e.u.t.m(runnable, true, false);
    }

    @Override // v71.v
    public final void K0(a71.h hVar, Runnable runnable) {
        e.u.t.m(runnable, true, true);
    }

    @Override // v71.v
    public final v M0(int i) {
        a81.bShadow.a(i);
        return i >= k.d ? this : super.M0(i);
    }

    @Override // v71.v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
