package sk;

import java.util.List;
import k71.k;
import nl.g;
import oa.j;
import sy.d0;
import x61.r;
import y71.n1;
import y71.y;
import z01.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final c a;
    public final g b;

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
        List list = r.r;
        List n = str7 != null ? d0.n(new e01.b(str8, str7)) : list;
        if (z) {
            list = d0.n(new e01.c(str8));
        }
        return b31.b.J(in.r.l(n1.I(b31.b.J(((s) cVar2.a.a(jVar)).b(str, str2, str3, str4, str5, str6, new e01.a(n, list)), jVar, cVar), new a(null, this, jVar, str, str2, str9, str3, cVar))), jVar, cVar);
    }

}
