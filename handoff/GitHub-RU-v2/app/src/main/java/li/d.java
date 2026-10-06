package li;

import k71.k;
import oa.g;
import oa.j;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public g a;

    public d(g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(j jVar, String str, j71.c cVar) {
        k.g(jVar, "user");
        k.g(str, "checkRunId");
        k.g(cVar, "onError");
        return b31.b.J(((kn.b) this.a.a(jVar)).n(str), jVar, cVar);
    }
}
