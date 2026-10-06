package nb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        mb0.p pVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new mb0.o(str, pVar);
                }
                pVar = (mb0.p) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0.o oVar = (mb0.o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, oVar.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, oVar.b);
    }
}
