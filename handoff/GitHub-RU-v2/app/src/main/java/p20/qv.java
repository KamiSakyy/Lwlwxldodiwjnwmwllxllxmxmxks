package p20;

import java.util.List;
import u10.ja0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qv implements aaShadow.a {
    public static final qv a = new qv();
    public static final List b = sy.d0.o("isEmployee", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "isEmployee");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ja0(str, str2, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ja0 ja0Var = (ja0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ja0Var, "value");
        fVar.z0("isEmployee");
        jo.f4.C(ja0Var.a, aa.c.f, fVar, wVar, "id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ja0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ja0Var.c);
    }
}
