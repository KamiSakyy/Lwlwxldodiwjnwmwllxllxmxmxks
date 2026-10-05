package vm0;

import vb0.r7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends c71.c {
    public /* synthetic */ Object u;
    public int v;
    public final /* synthetic */ r7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r7 r7Var, a71.c cVar) {
        super(cVar);
        this.w = r7Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return this.w.c(null, this);
    }
}
