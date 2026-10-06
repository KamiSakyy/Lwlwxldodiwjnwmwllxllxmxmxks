package ri;

import k71.k;
import oa.g;
import oa.j;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public g a;

    public e(g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(j jVar, String str, String str2, j71.c cVar) {
        k.g(jVar, "user");
        k.g(str, "checkSuiteId");
        k.g(cVar, "onError");
        return b31.b.J(((kn.b) this.a.a(jVar)).s(str, str2), jVar, cVar);
    }
}
