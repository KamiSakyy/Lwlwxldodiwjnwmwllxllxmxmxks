package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jh implements aaShadow.a {
    public static final jh a = new jh();
    public static final List b = sy.d0Shadow.o("id", "owner", "ref", "release", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.ep epVar = null;
        u10.gp gpVar = null;
        u10.hp hpVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                epVar = (u10.ep) aa.c.c(eh.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                gpVar = (u10.gp) aa.c.b(aa.c.c(gh.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                hpVar = (u10.hp) aa.c.b(aa.c.c(hh.a, true)).a(eVar, wVar);
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
        if (epVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new u10.jp(str, epVar, gpVar, hpVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.jp jpVar = (u10.jp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jpVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jpVar.a);
        fVar.z0("owner");
        aa.c.c(eh.a, true).b(fVar, wVar, jpVar.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(gh.a, false)).b(fVar, wVar, jpVar.c);
        fVar.z0("release");
        aa.c.b(aa.c.c(hh.a, true)).b(fVar, wVar, jpVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jpVar.e);
    }
}
