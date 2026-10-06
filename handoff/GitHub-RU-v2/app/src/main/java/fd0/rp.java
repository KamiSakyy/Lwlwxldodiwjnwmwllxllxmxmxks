package fd0;

import java.util.List;
import kc0.i10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rp implements aaShadow.a {
    public static final rp a = new rp();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "isArchived", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        oj0.v3 c = oj0.x3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new i10(str, booleanValue, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i10 i10Var = (i10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i10Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i10Var.a);
        fVar.z0("isArchived");
        jo.f4Shadow.C(i10Var.b, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, i10Var.c);
        List list = oj0.x3.a;
        oj0.x3.d(fVar, wVar, i10Var.d);
    }
}
