package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a5 implements aaShadow.a {
    public static final a5 a = new a5();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.s7 s7Var = null;
        while (eVar.r0(b) == 0) {
            s7Var = (jo.s7) aa.c.b(aa.c.c(c5.a, true)).a(eVar, wVar);
        }
        return new jo.q7(s7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q7 q7Var = (jo.q7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q7Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(c5.a, true)).b(fVar, wVar, q7Var.a);
    }
}
