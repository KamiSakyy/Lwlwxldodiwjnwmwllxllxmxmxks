package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.a {
    public static final m a = new m();
    public static final List b = sy.d0.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        j00.u uVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new j00.t(str, uVar);
                }
                uVar = (j00.u) aa.c.b(aa.c.c(n.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.t tVar = (j00.t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, tVar.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(n.a, false)).b(fVar, wVar, tVar.b);
    }
}
