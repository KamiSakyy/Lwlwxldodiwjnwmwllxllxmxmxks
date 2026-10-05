package ck;

import k71.k;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ f s;
    public final /* synthetic */ h t;

    public /* synthetic */ c(f fVar, h hVar, int i) {
        this.r = i;
        this.s = fVar;
        this.t = hVar;
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
