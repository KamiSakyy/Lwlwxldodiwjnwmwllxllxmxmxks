package eo0;

import java.util.List;
import jn0.jg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b00 implements aaShadow.a {
    public static final b00 a = new b00();
    public static final List b = sy.d0Shadow.o(new String[]{"isEmployee", "id", "__typename"});

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
            return new jg0(str, str2, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jg0 jg0Var = (jg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jg0Var, "value");
        fVar.z0("isEmployee");
        jo.f4Shadow.C(jg0Var.a, aa.c.f, fVar, wVar, "id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jg0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jg0Var.c);
    }
}
