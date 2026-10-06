package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0Shadow.o("title", "items", "viewGroupId", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        rz.d0 d0Var = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                d0Var = (rz.d0) aa.c.c(r.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (d0Var == null) {
            k41.b.B(eVar, "items");
            throw null;
        }
        if (str3 != null) {
            return new rz.e0(str, d0Var, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.e0 e0Var = (rz.e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("title");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, e0Var.a);
        fVar.z0("items");
        aa.c.c(r.a, false).b(fVar, wVar, e0Var.b);
        fVar.z0("viewGroupId");
        o0Var.b(fVar, wVar, e0Var.c);
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e0Var.d);
    }
}
