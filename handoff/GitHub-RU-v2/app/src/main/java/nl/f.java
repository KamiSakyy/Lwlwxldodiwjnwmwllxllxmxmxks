package nl;

import y71.n1;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public ml.j a;
    public oa.g b;

    public f(ml.j jVar, oa.g gVar) {
        k71.k.g(jVar, "fetchRepositoryIdUseCase");
        k71.k.g(gVar, "service");
        this.a = jVar;
        this.b = gVar;
    }

    public final y a(oa.j jVar, String str, String str2, String str3, String str4, String str5, String str6, j71.c cVar) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "title");
        k71.k.g(str4, "body");
        k71.k.g(str5, "baseRefName");
        k71.k.g(str6, "headRefName");
        return b31.b.J(n1.I(this.a.a(jVar, str, str2, cVar), new e(null, this, jVar, str3, str4, str5, str6)), jVar, cVar);
    }
}
