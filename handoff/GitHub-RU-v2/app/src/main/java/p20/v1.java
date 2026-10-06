package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 implements aaShadow.a {
    public static final v1 a = new v1();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new u10.d3(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.d3 d3Var = (u10.d3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d3Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, d3Var.a);
    }
}
