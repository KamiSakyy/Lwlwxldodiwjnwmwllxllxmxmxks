package wy0;

import pz0.cv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a6 extends c71.c {
    public cv u;
    public boolean v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ rm0.y6 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(rm0.y6 y6Var, c71.c cVar) {
        super(cVar);
        this.y = y6Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return rm0.y6.f(this.y, null, null, false, this);
    }
}
