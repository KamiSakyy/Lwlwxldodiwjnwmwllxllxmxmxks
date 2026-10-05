package fd0;

import java.util.List;
import kc0.bb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jw implements aa.a {
    public static final jw a = new jw();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        wk0.c c = wk0.e.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new bb0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bb0 bb0Var = (bb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bb0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bb0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, bb0Var.b);
        List list = wk0.e.a;
        wk0.c cVar = bb0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(wk0.d.a, false)).b(fVar, wVar, cVar.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, cVar.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, cVar.c);
    }
}
