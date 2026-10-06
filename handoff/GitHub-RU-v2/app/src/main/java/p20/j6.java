package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j6 implements aaShadow.a {
    public static final j6 a = new j6();
    public static final List b = sy.d0.o("hasNextPage", "endCursor");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new u10.o9(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.o9 o9Var = (u10.o9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o9Var, "value");
        fVar.z0("hasNextPage");
        jo.f4.C(o9Var.a, aa.c.f, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, o9Var.b);
    }
}
