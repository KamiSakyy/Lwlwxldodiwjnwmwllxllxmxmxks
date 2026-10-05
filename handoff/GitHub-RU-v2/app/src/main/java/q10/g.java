package q10;

import in.a1;
import k71.k;
import oa.h;
import oa.j;
import q81.u;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements oa.g {
    public final f a;
    public final qe.a b;
    public final h c;

    public g(f fVar, qe.a aVar, h hVar) {
        k.g(fVar, "okHttpFactory");
        k.g(hVar, "tokenManager");
        this.a = fVar;
        this.b = aVar;
        this.c = hVar;
    }

    public final Object a(j jVar) {
        k.g(jVar, "user");
        return new a1((u) this.a.a(jVar), jVar, this.c, this.b);
    }
}
