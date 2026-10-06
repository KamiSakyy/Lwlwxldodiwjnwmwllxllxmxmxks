package dl;

import k71.k;
import oa.j;
import y71.y;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public oa.g a;

    public d(oa.g gVar) {
        k.g(gVar, "repositoryService");
        this.a = gVar;
    }

    public final y a(j jVar, String str, String str2, String str3, j71.c cVar) {
        k.g(jVar, "user");
        k.g(str, "owner");
        k.g(str2, "name");
        return b31.b.J(((g1) this.a.a(jVar)).g(str, str2, str3), jVar, cVar);
    }

}
