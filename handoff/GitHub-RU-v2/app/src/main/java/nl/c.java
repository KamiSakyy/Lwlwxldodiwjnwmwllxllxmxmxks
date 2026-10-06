package nl;

import y71.n1Shadow;
import z01.c1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public d a;
    public sk.b b;

    public c(d dVar, sk.b bVar) {
        k71.k.g(dVar, "createBranchUseCase");
        k71.k.g(bVar, "createCommitCachedOnBranchUseCase");
        this.a = dVar;
        this.b = bVar;
    }

    public final z71.k a(oa.j jVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, j71.c cVar) {
        k71.k.g(str, "repoId");
        k71.k.g(str2, "repoOwner");
        k71.k.g(str3, "repoName");
        k71.k.g(str4, "newBranchName");
        k71.k.g(str5, "baseBranchName");
        k71.k.g(str6, "$v$c$com-github-android-common-datatypes-CommitOid$-refOid$0");
        k71.k.g(str10, "path");
        d dVar = this.a;
        dVar.getClass();
        return n1Shadow.I(b31.b.J(((c1) dVar.a.a(jVar)).a(str, "refs/heads/".concat(str4), str6), jVar, cVar), new a(null, this, jVar, str2, str3, str8, str7, str9, z, str10, str5, cVar));
    }
    public Object j(Object p1) { return null; }
}
