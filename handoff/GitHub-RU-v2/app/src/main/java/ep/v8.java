package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v8 implements aa.a {
    public static final v8 a = new v8();
    public static final List b = sy.d0.o("repository", "search", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.id idVar = null;
        jo.jd jdVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                idVar = (jo.id) aa.c.b(aa.c.c(y8.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                jdVar = (jo.jd) aa.c.c(z8.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (jdVar == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.fd(idVar, jdVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fd fdVar = (jo.fd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fdVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(y8.a, false)).b(fVar, wVar, fdVar.a);
        fVar.z0("search");
        aa.c.c(z8.a, false).b(fVar, wVar, fdVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fdVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fdVar.d);
    }
}
