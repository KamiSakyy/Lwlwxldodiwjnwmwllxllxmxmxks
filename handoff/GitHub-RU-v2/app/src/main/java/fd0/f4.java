package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f4 implements aaShadow.a {
    public static final f4 a = new f4();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.o6 o6Var = null;
        while (eVar.r0(b) == 0) {
            o6Var = (kc0.o6) aa.c.b(aa.c.c(h4.a, true)).a(eVar, wVar);
        }
        return new kc0.m6(o6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.m6 m6Var = (kc0.m6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m6Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(h4.a, true)).b(fVar, wVar, m6Var.a);
    }
}
