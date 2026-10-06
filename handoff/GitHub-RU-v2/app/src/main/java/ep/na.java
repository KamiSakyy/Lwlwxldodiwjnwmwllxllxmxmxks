package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class na implements aaShadow.a {
    public static final na a = new na();
    public static final List b = sy.d0Shadow.o("__typename", "id", "dashboard");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jo.jf jfVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                jfVar = (jo.jf) aa.c.b(aa.c.c(ga.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.qf(str, str2, jfVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.qf qfVar = (jo.qf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qfVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qfVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, qfVar.b);
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(ga.a, false)).b(fVar, wVar, qfVar.c);
    }
}
