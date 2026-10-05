package vj;

import k71.k;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ c s;
    public final /* synthetic */ d t;

    public /* synthetic */ a(c cVar, d dVar, int i) {
        this.r = i;
        this.s = cVar;
        this.t = dVar;
    }

    public final Object k(Object obj) {
        v7.a aVar = (v7.a) obj;
        switch (this.r) {
            case 0:
                k.g(aVar, "_connection");
                this.s.c.z(aVar, this.t);
                break;
            default:
                k.g(aVar, "_connection");
                this.s.b.p(aVar, this.t);
                break;
        }
        return a0.a;
    }
}
