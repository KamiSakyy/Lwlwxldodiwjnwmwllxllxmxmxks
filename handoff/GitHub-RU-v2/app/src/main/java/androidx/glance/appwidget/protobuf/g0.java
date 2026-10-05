package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public final class g0 {
    public static d0 a(long j10, Object obj) {
        d0 d0Var = (d0) i1.f2729c.i(j10, obj);
        if (((b) d0Var).f2692r) {
            return d0Var;
        }
        int size = d0Var.size();
        d0 r10 = d0Var.r(size == 0 ? 10 : size * 2);
        i1.p(j10, obj, r10);
        return r10;
    }
}
