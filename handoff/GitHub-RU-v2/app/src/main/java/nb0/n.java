package nb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        mb0.v vVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new mb0.u(str, vVar);
                }
                vVar = (mb0.v) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0.u uVar = (mb0.u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, uVar.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, uVar.b);
    }
}
