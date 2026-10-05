package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 implements aa.a {
    public static final t2 a = new t2();
    public static final List b = sy.d0.o("topic", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i2 i2Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i2Var = (i2) aa.c.c(e3.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (i2Var == null) {
            k41.b.B(eVar, "topic");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new y1(i2Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y1 y1Var = (y1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y1Var, "value");
        fVar.z0("topic");
        aa.c.c(e3.a, false).b(fVar, wVar, y1Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y1Var.c);
    }
}
