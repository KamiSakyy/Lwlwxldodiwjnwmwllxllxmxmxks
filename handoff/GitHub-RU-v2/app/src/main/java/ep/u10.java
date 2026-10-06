package ep;

import java.util.List;
import jo.ti0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u10 implements aaShadow.a {
    public static final u10 a = new u10();
    public static final List b = sy.d0.o("copilotLicenseType", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m10.m8 m8Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                m8Var = (m10.m8) aa.c.b(n10Shadow.a.o).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new ti0(str, str2, m8Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ti0 ti0Var = (ti0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ti0Var, "value");
        fVar.z0("copilotLicenseType");
        aa.c.b(n10Shadow.a.o).b(fVar, wVar, ti0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ti0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ti0Var.c);
    }
}
