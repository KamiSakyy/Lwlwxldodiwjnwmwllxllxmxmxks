package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pl implements aa.a {
    public static final pl a = new pl();
    public static final List b = sy.d0.o("id", "latestRelease", "releases", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.zu zuVar = null;
        jo.cv cvVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                zuVar = (jo.zu) aa.c.b(aa.c.c(ll.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                cvVar = (jo.cv) aa.c.c(ol.a, false).a(eVar, wVar);
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
        if (cvVar == null) {
            k41.b.B(eVar, "releases");
            throw null;
        }
        if (str2 != null) {
            return new jo.dv(str, zuVar, cvVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.dv dvVar = (jo.dv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dvVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dvVar.a);
        fVar.z0("latestRelease");
        aa.c.b(aa.c.c(ll.a, false)).b(fVar, wVar, dvVar.b);
        fVar.z0("releases");
        aa.c.c(ol.a, false).b(fVar, wVar, dvVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dvVar.d);
    }
}
