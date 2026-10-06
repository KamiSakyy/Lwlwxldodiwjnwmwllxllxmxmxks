package ep;

import java.util.List;
import jo.oh0;
import jo.ph0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c10 implements aaShadow.a {
    public static final c10 a = new c10();
    public static final List b = sy.d0Shadow.o("viewer", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ph0 ph0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ph0Var = (ph0) aa.c.c(d10.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ph0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new oh0(ph0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oh0 oh0Var = (oh0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oh0Var, "value");
        fVar.z0("viewer");
        aa.c.c(d10.a, true).b(fVar, wVar, oh0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oh0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oh0Var.c);
    }
}
