package pw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = sy.d0.o(new String[]{"workflowRun", "app", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ow0.l0 l0Var = null;
        ow0.u uVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l0Var = (ow0.l0) aa.c.b(aa.c.c(c0.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                uVar = (ow0.u) aa.c.b(aa.c.c(m.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ow0.v(l0Var, uVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.v vVar = (ow0.v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(c0.a, false)).b(fVar, wVar, vVar.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(m.a, false)).b(fVar, wVar, vVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vVar.d);
    }
}
