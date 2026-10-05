package um;

import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;
    public final /* synthetic */ r t;
    public final /* synthetic */ oa.j u;

    public /* synthetic */ f(y71.i iVar, r rVar, oa.j jVar, int i) {
        this.r = i;
        this.s = iVar;
        this.t = rVar;
        this.u = jVar;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new e(jVar, this.t, this.u, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            case 1:
                Object b2 = this.s.b(new e(jVar, this.t, this.u, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b3 = this.s.b(new e(jVar, this.t, this.u, 2), cVar);
                if (b3 != b71.a.r) {
                    break;
                }
                break;
        }
        return a0.a;
    }
}
