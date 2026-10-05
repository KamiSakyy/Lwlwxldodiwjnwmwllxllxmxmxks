package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class il implements aa.a {
    public static final il a = new il();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.tu tuVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                tuVar = (kc0.tu) aa.c.c(gl.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(cl.a, true)))).a(eVar, wVar);
            }
        }
        if (tuVar != null) {
            return new kc0.vu(tuVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.vu vuVar = (kc0.vu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vuVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(gl.a, false).b(fVar, wVar, vuVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(cl.a, true)))).b(fVar, wVar, vuVar.b);
    }
}
