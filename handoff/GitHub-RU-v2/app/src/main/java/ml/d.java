package ml;

import y71.y;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final oa.g a;

    public d(oa.g gVar) {
        k71.k.g(gVar, "repositoryService");
        this.a = gVar;
    }

    public final y a(oa.j jVar, String str, String str2, String str3, j71.c cVar) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "selectedBranch");
        return b31.b.J(((g1) this.a.a(jVar)).w(str, str2, "refs/heads/".concat(str3)), jVar, cVar);
    }
}
