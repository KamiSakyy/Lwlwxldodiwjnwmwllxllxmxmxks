package v91;

import b21.v;
import c21.h0;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends u91.b {
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t91.d dVar, v vVar, int i) {
        super(dVar, vVar);
        k.g(dVar, "myConstraints");
        this.e = i;
    }

    @Override // u91.b
    public final boolean b() {
        return false;
    }

    @Override // u91.b
    public final int c(s91.c cVar) {
        return this.e;
    }

    @Override // u91.b
    public final u91.a d(s91.c cVar, t91.d dVar) {
        k.g(dVar, "currentConstraints");
        return cVar.c < this.e ? u91.a.e : u91.a.f;
    }

    @Override // u91.b
    public final h0 e() {
        return j91.a.m;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return true;
    }
}
