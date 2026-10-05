package im;

import b21.v;
import ja.o;
import k71.w;
import w61.a0;
import y71.i;
import y71.j;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements i {
    public final /* synthetic */ int r;
    public final /* synthetic */ i s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ c(i iVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.r = i;
        this.s = iVar;
        this.t = obj;
        this.u = obj2;
        this.x = obj3;
        this.v = obj4;
        this.w = obj5;
    }

    public final Object b(j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new b(jVar, (v2) this.t, (v2) this.u, (d) this.x, (oa.j) this.v, (String) this.w, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            case 1:
                Object b2 = this.s.b(new b(jVar, (v2) this.t, (v2) this.u, (f) this.x, (oa.j) this.v, (String) this.w, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b3 = this.s.b(new b(jVar, (aa.d) this.t, (v) this.u, (w) this.x, (o) this.v, (aa.w) this.w, 2), cVar);
                if (b3 != b71.a.r) {
                    break;
                }
                break;
        }
        return a0.a;
    }
}
