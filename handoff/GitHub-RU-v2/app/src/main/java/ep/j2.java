package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 implements aaShadow.a {
    public static final j2 a = new j2();
    public static final List b = sy.d0Shadow.o("hasNextPage", "hasPreviousPage", "endCursor");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasNextPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new jo.y3(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.y3 y3Var = (jo.y3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y3Var, "value");
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(y3Var.a, bVar, fVar, wVar, "hasPreviousPage");
        jo.f4Shadow.C(y3Var.b, bVar, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, y3Var.c);
    }
}
