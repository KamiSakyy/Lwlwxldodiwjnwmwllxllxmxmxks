package im;

import k71.k;
import oa.j;
import y71.y;
import z01.o1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final oa.g a;

    public g(oa.g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(j jVar, String str, String str2, String str3, String str4, j71.c cVar) {
        k.g(jVar, "user");
        k.g(str, "ownerName");
        k.g(str2, "repoName");
        return b31.b.J(((o1) this.a.a(jVar)).c(str, str2, str3, str4), jVar, cVar);
    }
}
