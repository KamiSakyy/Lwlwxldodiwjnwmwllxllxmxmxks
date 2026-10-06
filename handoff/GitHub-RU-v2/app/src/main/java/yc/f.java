package yc;

import androidx.compose.runtime.f1;
import k71.k;
import s3.q;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements p2.a {

    /* renamed from: r, reason: collision with root package name */
    public f1 f34301r;

    /* renamed from: s, reason: collision with root package name */
    public int f34302s;

    public f(f1 f1Var, int i) {
        k.g(f1Var, "inFling");
        this.f34301r = f1Var;
        this.f34302s = i;
    }

    @Override // p2.a
    public final Object I(long j10, long j11, a71.c cVar) {
        this.f34301r.setValue(Boolean.FALSE);
        return super.I(j10, j11, cVar);
    }

    @Override // p2.a
    public final Object N(long j10, a71.c cVar) {
        this.f34301r.setValue(Boolean.valueOf(Math.abs(q.c(j10)) > ((float) this.f34302s)));
        return super.N(j10, cVar);
    }
}
