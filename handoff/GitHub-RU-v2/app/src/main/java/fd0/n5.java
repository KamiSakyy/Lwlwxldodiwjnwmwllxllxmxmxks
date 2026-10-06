package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n5 implements aaShadow.a {
    public static final n5 a = new n5();
    public static final List b = sy.d0.n("deleteRef");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.n8 n8Var = null;
        while (eVar.r0(b) == 0) {
            n8Var = (kc0.n8) aa.c.b(aa.c.c(o5.a, false)).a(eVar, wVar);
        }
        return new kc0.m8(n8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.m8 m8Var = (kc0.m8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m8Var, "value");
        fVar.z0("deleteRef");
        aa.c.b(aa.c.c(o5.a, false)).b(fVar, wVar, m8Var.a);
    }
}
