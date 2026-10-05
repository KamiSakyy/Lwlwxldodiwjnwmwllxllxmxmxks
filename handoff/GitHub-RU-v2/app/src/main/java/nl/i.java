package nl;

import y71.y;
import z01.c1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final oa.g a;

    public i(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(oa.j jVar, String str, String str2, String str3, String str4, j71.c cVar) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        return b31.b.J(((c1) this.a.a(jVar)).b(str, str2, str3, str4), jVar, cVar);
    }
}
