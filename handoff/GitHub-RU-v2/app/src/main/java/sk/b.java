package sk;

import java.util.List;
import k71.k;
import nl.g;
import oa.j;
import sy.d0Shadow;
import x61.rShadow;
import y71.n1Shadow;
import y71.y;
import z01.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public c a;
    public g b;

    public b(c cVar, g gVar) {
        k.g(cVar, "createCommitOnBranchUseCase");
        k.g(gVar, "fetchAheadBehindUseCase");
        this.a = cVar;
        this.b = gVar;
    }

    public final y a(j jVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, j71.c cVar) {
        k.g(str, "owner");
        k.g(str2, "repoName");
        k.g(str3, "headBranchName");
        k.g(str6, "$v$c$com-github-android-common-datatypes-CommitOid$-branchOid$0");
        k.g(str8, "path");
        k.g(str9, "baseBranch");
        c cVar2 = this.a;
        cVar2.getClass();
        List list = rShadow.r;
        List n = str7 != null ? d0Shadow.n(new e01.b(str8, str7)) : list;
        if (z) {
            list = d0Shadow.n(new e01.c(str8));
        }
        return b31.b.J(in.rShadow.l(n1Shadow.I(b31.b.J(((s) cVar2.a.a(jVar)).b(str, str2, str3, str4, str5, str6, new e01.a(n, list)), jVar, cVar), new a(null, this, jVar, str, str2, str9, str3, cVar))), jVar, cVar);
    }

}
