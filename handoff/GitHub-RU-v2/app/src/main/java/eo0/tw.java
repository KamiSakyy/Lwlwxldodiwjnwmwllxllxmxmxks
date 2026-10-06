package eo0;

import java.util.List;
import jn0.jb0;
import jn0.kb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tw implements aaShadow.a {
    public static final tw a = new tw();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kb0 kb0Var = null;
        while (eVar.r0(b) == 0) {
            kb0Var = (kb0) aa.c.b(aa.c.c(uw.a, true)).a(eVar, wVar);
        }
        return new jb0(kb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jb0 jb0Var = (jb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jb0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(uw.a, true)).b(fVar, wVar, jb0Var.a);
    }
}
