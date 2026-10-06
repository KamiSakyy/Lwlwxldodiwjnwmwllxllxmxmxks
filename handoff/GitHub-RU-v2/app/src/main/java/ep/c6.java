package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c6 implements aaShadow.a {
    public static final c6 a = new c6();
    public static final List b = sy.d0Shadow.n("createUserDisinterest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.d9 d9Var = null;
        while (eVar.r0(b) == 0) {
            d9Var = (jo.d9) aa.c.b(aa.c.c(b6.a, false)).a(eVar, wVar);
        }
        return new jo.e9(d9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.e9 e9Var = (jo.e9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e9Var, "value");
        fVar.z0("createUserDisinterest");
        aa.c.b(aa.c.c(b6.a, false)).b(fVar, wVar, e9Var.a);
    }
}
