package rw0;

import bz0.c0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends c71.c {
    public String u;
    public String v;
    public /* synthetic */ Object w;
    public final /* synthetic */ c0 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c0 c0Var, c71.c cVar) {
        super(cVar);
        this.x = c0Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.d(null, null, this);
    }
}
