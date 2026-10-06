package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t6 implements aa.a {
    public static final t6 a = new t6();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        y4 c = l6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new f5(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f5 f5Var = (f5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, f5Var.b);
        List list = l6.a;
        y4 y4Var = f5Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y4Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, y4Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, y4Var.b);
        fVar.z0("login");
        bVar2.b(fVar, wVar, y4Var.c);
        List list2 = e30.d.a;
        e30.d.d(fVar, wVar, y4Var.d);
    }
}
