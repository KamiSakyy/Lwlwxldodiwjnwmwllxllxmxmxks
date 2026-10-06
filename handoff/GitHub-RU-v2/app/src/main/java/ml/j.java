package ml;

import y71.y;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public oa.g a;

    public j(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(oa.j jVar, String str, String str2, j71.c cVar) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        return b31.b.J(((g1) this.a.a(jVar)).I(str, str2), jVar, cVar);
    }
}
