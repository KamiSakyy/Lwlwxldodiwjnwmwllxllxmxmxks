package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class md implements aa.a {
    public static final md a = new md();
    public static final List b = sy.d0.o("id", "copilotLicenseType", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        m10.m8 m8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m8Var = (m10.m8) aa.c.b(n10.a.o).a(eVar, wVar);
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
            return new jo.tj(str, str2, m8Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.tj tjVar = (jo.tj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tjVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tjVar.a);
        fVar.z0("copilotLicenseType");
        aa.c.b(n10.a.o).b(fVar, wVar, tjVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tjVar.c);
    }
}
