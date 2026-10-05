package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tq implements aa.a {
    public static final tq a = new tq();
    public static final List b = sy.d0.o("id", "color", "name", "description", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str5 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "color");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str5 != null) {
            return new jo.h20(str, str2, str3, str4, str5);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.h20 h20Var = (jo.h20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h20Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h20Var.a);
        fVar.z0("color");
        bVar.b(fVar, wVar, h20Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, h20Var.c);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, h20Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h20Var.e);
    }
}
