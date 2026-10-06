package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d2 implements aaShadow.a {
    public static final d2 a = new d2();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jo.n3(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.n3 n3Var = (jo.n3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n3Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, n3Var.a);
    }
}
