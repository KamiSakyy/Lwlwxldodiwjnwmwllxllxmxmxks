package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qi implements aaShadow.a {
    public static final qi a = new qi();
    public static final List b = sy.d0Shadow.o("id", "ref", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.mr mrVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                mrVar = (jo.mr) aa.c.b(aa.c.c(pi.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
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
            return new jo.nr(str, mrVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nr nrVar = (jo.nr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nrVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nrVar.a);
        fVar.z0("ref");
        aa.c.b(aa.c.c(pi.a, false)).b(fVar, wVar, nrVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, nrVar.c);
    }
}
