package ep;

import java.util.List;
import jo.o60;
import jo.s60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rt implements aaShadow.a {
    public static final rt a = new rt();
    public static final List b = sy.d0Shadow.o("shortcuts", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s60 s60Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                s60Var = (s60) aa.c.c(vt.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (s60Var == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new o60(s60Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o60 o60Var = (o60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o60Var, "value");
        fVar.z0("shortcuts");
        aa.c.c(vt.a, false).b(fVar, wVar, o60Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o60Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, o60Var.c);
    }
}
