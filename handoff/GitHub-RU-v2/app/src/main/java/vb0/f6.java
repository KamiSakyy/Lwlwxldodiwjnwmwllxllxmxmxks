package vb0;

import rm0.i8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f6 extends c71.c {
    public /* synthetic */ Object u;
    public int v;
    public final /* synthetic */ i8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(i8 i8Var, a71.c cVar) {
        super(cVar);
        this.w = i8Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return this.w.c(null, this);
    }
}
