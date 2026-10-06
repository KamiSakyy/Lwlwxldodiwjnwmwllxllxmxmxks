package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ln implements aaShadow.a {
    public static final ln a = new ln();
    public static final List b = sy.d0Shadow.o("id", "mergingEntries", "entriesCount", "entries", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.yx yxVar = null;
        jo.wx wxVar = null;
        jo.vx vxVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                yxVar = (jo.yx) aa.c.b(aa.c.c(mn.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                wxVar = (jo.wx) aa.c.b(aa.c.c(kn.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                vxVar = (jo.vx) aa.c.b(aa.c.c(jn.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
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
            return new jo.xx(str, yxVar, wxVar, vxVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.xx xxVar = (jo.xx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xxVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xxVar.a);
        fVar.z0("mergingEntries");
        aa.c.b(aa.c.c(mn.a, false)).b(fVar, wVar, xxVar.b);
        fVar.z0("entriesCount");
        aa.c.b(aa.c.c(kn.a, false)).b(fVar, wVar, xxVar.c);
        fVar.z0("entries");
        aa.c.b(aa.c.c(jn.a, false)).b(fVar, wVar, xxVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xxVar.e);
    }
}
