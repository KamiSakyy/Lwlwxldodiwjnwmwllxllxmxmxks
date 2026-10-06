package il;

import z01.r0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final oa.g a;

    public e(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    public final y71.y a(boolean z, String str, oa.j jVar, String str2, j71.c cVar) {
        k71.k.g(str, "login");
        oa.g gVar = this.a;
        return b31.b.J(z ? ((r0) gVar.a(jVar)).q(str, str2) : ((r0) gVar.a(jVar)).k(str, str2), jVar, cVar);
    }
}
