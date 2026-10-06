package rm0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 extends c71.c {
    public /* synthetic */ Object u;
    public int v;
    public final /* synthetic */ d1Shadow w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1Shadow d1Var, a71.c cVar) {
        super(cVar);
        this.w = d1Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return this.w.c(null, this);
    }
}
