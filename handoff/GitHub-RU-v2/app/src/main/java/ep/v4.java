package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v4 implements aaShadow.a {
    public static final v4 a = new v4();
    public static final List b = sy.d0.n("commit");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.f7 f7Var = null;
        while (eVar.r0(b) == 0) {
            f7Var = (jo.f7) aa.c.b(aa.c.c(u4.a, true)).a(eVar, wVar);
        }
        return new jo.h7(f7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.h7 h7Var = (jo.h7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h7Var, "value");
        fVar.z0("commit");
        aa.c.b(aa.c.c(u4.a, true)).b(fVar, wVar, h7Var.a);
    }
}
