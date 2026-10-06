package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ee implements aaShadow.a {
    public static final ee a = new ee();
    public static final List b = sy.d0Shadow.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.hl hlVar = null;
        while (eVar.r0(b) == 0) {
            hlVar = (jn0.hl) aa.c.b(aa.c.c(fe.a, false)).a(eVar, wVar);
        }
        return new jn0.gl(hlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.gl glVar = (jn0.gl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(glVar, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(fe.a, false)).b(fVar, wVar, glVar.a);
    }
}
