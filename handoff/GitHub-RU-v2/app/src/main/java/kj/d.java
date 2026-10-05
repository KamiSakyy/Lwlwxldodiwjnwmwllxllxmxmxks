package kj;

import yz0.r3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.y s;
    public final /* synthetic */ r3 t;

    public /* synthetic */ d(y71.y yVar, r3 r3Var, int i) {
        this.r = i;
        this.s = yVar;
        this.t = r3Var;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new c(jVar, this.t, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.b(new c(jVar, this.t, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
