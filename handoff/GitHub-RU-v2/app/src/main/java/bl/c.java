package bl;

import aa.s0;
import aa.w;
import do0.q;
import e1.g;
import java.io.Serializable;
import java.util.List;
import w61.a0;
import y71.i;
import y71.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements i {
    public final /* synthetic */ int r;
    public final /* synthetic */ i s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Serializable v;
    public final /* synthetic */ Object w;

    public /* synthetic */ c(i iVar, Object obj, Object obj2, Object obj3, Serializable serializable, int i) {
        this.r = i;
        this.s = iVar;
        this.t = obj;
        this.w = obj2;
        this.u = obj3;
        this.v = serializable;
    }

    public final Object b(j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new b(jVar, (List) this.t, (d) this.w, (oa.j) this.u, (String) this.v, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            case 1:
                Object b2 = this.s.b(new b(jVar, (List) this.t, (f) this.w, (oa.j) this.u, (String) this.v, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b3 = this.s.b(new q(jVar, (s0) this.t, (w) this.w, (g) this.u, this.v), cVar);
                if (b3 != b71.a.r) {
                    break;
                }
                break;
        }
        return a0.a;
    }
}
