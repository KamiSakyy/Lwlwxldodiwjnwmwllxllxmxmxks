package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q7 implements aaShadow.a {
    public static final List a = sy.d0.n("discussion");

    public static jn0.jb c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.hb hbVar = null;
        while (eVar.r0(a) == 0) {
            hbVar = (jn0.hb) aa.c.b(aa.c.c(o7.a, false)).a(eVar, wVar);
        }
        return new jn0.jb(hbVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.jb jbVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jbVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(o7.a, false)).b(fVar, wVar, jbVar.a);
    }
}
