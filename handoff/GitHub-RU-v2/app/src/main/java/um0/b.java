package um0;

import t00.x9;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends c71.c {
    public /* synthetic */ Object u;
    public int v;
    public final /* synthetic */ x9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x9 x9Var, a71.c cVar) {
        super(cVar);
        this.w = x9Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return this.w.c((Object) null, this);
    }
}
