package uk;

import k71.k;
import oa.g;
import oa.j;
import y71.y;
import z01.x0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public g a;

    public c(g gVar) {
        k.g(gVar, "refComparisonFilesChangedService");
        this.a = gVar;
    }

    public final y a(j jVar, String str, String str2, String str3, String str4, j71.c cVar) {
        k.g(jVar, "user");
        k.g(str, "ownerName");
        k.g(str2, "repoName");
        k.g(str3, "baseRefName");
        k.g(str4, "headRefName");
        return b31.b.J(((x0) this.a.a(jVar)).b(str, str2, str3, str4), jVar, cVar);
    }
}
