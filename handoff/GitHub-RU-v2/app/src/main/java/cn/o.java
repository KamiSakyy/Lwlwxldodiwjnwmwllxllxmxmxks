package cn;

import w61.a0;
import y71.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ h1 s;
    public final /* synthetic */ String t;

    public /* synthetic */ o(h1 h1Var, String str, int i) {
        this.r = i;
        this.s = h1Var;
        this.t = str;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.r.b(new n(jVar, this.t, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.r.b(new n(jVar, this.t, 16), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return a0.a;
    }
}
