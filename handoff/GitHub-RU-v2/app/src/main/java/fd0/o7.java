package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o7 implements aaShadow.a {
    public static final o7 a = new o7();
    public static final List b = sy.d0Shadow.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.kb kbVar = null;
        while (eVar.r0(b) == 0) {
            kbVar = (kc0.kb) aa.c.b(aa.c.c(p7.a, false)).a(eVar, wVar);
        }
        return new kc0.jb(kbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.jb jbVar = (kc0.jb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jbVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(p7.a, false)).b(fVar, wVar, jbVar.a);
    }
}
