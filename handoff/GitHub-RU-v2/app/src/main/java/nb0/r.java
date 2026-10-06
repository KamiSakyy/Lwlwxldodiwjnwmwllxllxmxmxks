package nb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        mb0.b0 b0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new mb0.a0(str, b0Var);
                }
                b0Var = (mb0.b0) aa.c.b(aa.c.c(s.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0.a0 a0Var = (mb0.a0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, a0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(s.a, false)).b(fVar, wVar, a0Var.b);
    }
}
