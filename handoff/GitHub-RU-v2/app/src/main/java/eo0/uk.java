package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uk implements aaShadow.a {
    public static final uk a = new uk();
    public static final List b = sy.d0.n("removeSubIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.hu huVar = null;
        while (eVar.r0(b) == 0) {
            huVar = (jn0.hu) aa.c.b(aa.c.c(yk.a, false)).a(eVar, wVar);
        }
        return new jn0.du(huVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.du duVar = (jn0.du) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(duVar, "value");
        fVar.z0("removeSubIssue");
        aa.c.b(aa.c.c(yk.a, false)).b(fVar, wVar, duVar.a);
    }
}
