package um;

import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ c00.g s;
    public final /* synthetic */ r t;

    public /* synthetic */ j(c00.g gVar, r rVar, int i) {
        this.r = i;
        this.s = gVar;
        this.t = rVar;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new h(jVar, this.t, 1), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.b(new h(jVar, this.t, 2), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return a0.a;
    }
}
