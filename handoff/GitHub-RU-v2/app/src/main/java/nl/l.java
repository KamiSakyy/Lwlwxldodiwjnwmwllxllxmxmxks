package nl;

import dn.o;
import y71.y;
import z01.c1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public oa.g a;

    public l(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(oa.j jVar, String str, String str2, j71.c cVar) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        return b31.b.J(new o(((c1) this.a.a(jVar)).c(str, str2, jVar.c + "-patch-"), jVar, 2), jVar, cVar);
    }
}
