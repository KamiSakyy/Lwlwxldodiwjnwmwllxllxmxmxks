package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 implements aa.a {
    public static final z1 a = new z1();
    public static final List b = sy.d0Shadow.o("id", "totalCommentsCount", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
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
            return new x1(num, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x1 x1Var = (x1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x1Var.a);
        fVar.z0("totalCommentsCount");
        aa.c.b(y20.a.a).b(fVar, wVar, x1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x1Var.c);
    }
}
