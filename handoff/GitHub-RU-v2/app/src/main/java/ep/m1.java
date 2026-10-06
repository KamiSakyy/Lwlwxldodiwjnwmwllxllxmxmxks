package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 implements aaShadow.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jo.q2(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q2 q2Var = (jo.q2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q2Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, q2Var.a);
    }
}
