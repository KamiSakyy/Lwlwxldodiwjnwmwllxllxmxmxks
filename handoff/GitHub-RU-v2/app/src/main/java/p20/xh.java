package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xh implements aaShadow.a {
    public static final xh a = new xh();
    public static final List b = sy.d0Shadow.o("id", "latestRelease", "releases", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.vp vpVar = null;
        u10.yp ypVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                vpVar = (u10.vp) aa.c.b(aa.c.c(th.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                ypVar = (u10.yp) aa.c.c(wh.a, false).a(eVar, wVar);
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
        if (ypVar == null) {
            k41.b.B(eVar, "releases");
            throw null;
        }
        if (str2 != null) {
            return new u10.zp(str, vpVar, ypVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.zp zpVar = (u10.zp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zpVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zpVar.a);
        fVar.z0("latestRelease");
        aa.c.b(aa.c.c(th.a, false)).b(fVar, wVar, zpVar.b);
        fVar.z0("releases");
        aa.c.c(wh.a, false).b(fVar, wVar, zpVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, zpVar.d);
    }
}
