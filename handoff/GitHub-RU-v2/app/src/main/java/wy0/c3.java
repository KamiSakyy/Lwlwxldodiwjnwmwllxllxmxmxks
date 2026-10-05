package wy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 extends c71.c {
    public String u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rm0.c4 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(rm0.c4 c4Var, c71.c cVar) {
        super(cVar);
        this.x = c4Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return rm0.c4.u(this.x, null, 0, this);
    }
}
