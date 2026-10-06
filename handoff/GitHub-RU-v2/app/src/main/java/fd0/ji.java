package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ji implements aaShadow.a {
    public static final ji a = new ji();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.gq gqVar;
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
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            gqVar = yh.c(eVar, wVar);
        } else {
            gqVar = null;
        }
        if (str2 != null) {
            return new kc0.rq(str, str2, gqVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.rq rqVar = (kc0.rq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rqVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rqVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, rqVar.b);
        kc0.gq gqVar = rqVar.c;
        if (gqVar != null) {
            yh.d(fVar, wVar, gqVar);
        }
    }
}
