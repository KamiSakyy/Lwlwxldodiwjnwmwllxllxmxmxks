package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bl implements aaShadow.a {
    public static final bl a = new bl();
    public static final List b = sy.d0Shadow.o("id", "owner", "ref", "release", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.iu iuVar = null;
        jo.ku kuVar = null;
        jo.lu luVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                iuVar = (jo.iu) aa.c.c(wk.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                kuVar = (jo.ku) aa.c.b(aa.c.c(yk.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                luVar = (jo.lu) aa.c.b(aa.c.c(zk.a, true)).a(eVar, wVar);
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
        if (iuVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new jo.nu(str, iuVar, kuVar, luVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nu nuVar = (jo.nu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nuVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nuVar.a);
        fVar.z0("owner");
        aa.c.c(wk.a, true).b(fVar, wVar, nuVar.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(yk.a, false)).b(fVar, wVar, nuVar.c);
        fVar.z0("release");
        aa.c.b(aa.c.c(zk.a, true)).b(fVar, wVar, nuVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, nuVar.e);
    }
}
