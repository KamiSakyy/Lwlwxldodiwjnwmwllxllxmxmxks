package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dl implements aaShadow.a {
    public static final dl a = new dl();
    public static final List b = sy.d0Shadow.n("reopenIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.su suVar = null;
        while (eVar.r0(b) == 0) {
            suVar = (jn0.su) aa.c.b(aa.c.c(fl.a, false)).a(eVar, wVar);
        }
        return new jn0.qu(suVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qu quVar = (jn0.qu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(quVar, "value");
        fVar.z0("reopenIssue");
        aa.c.b(aa.c.c(fl.a, false)).b(fVar, wVar, quVar.a);
    }
}
