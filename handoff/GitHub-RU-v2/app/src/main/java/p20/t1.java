package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aaShadow.a {
    public static final t1 a = new t1();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new u10.z2(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.z2 z2Var = (u10.z2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z2Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, z2Var.a);
    }
}
