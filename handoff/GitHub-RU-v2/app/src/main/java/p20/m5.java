package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m5 implements aaShadow.a {
    public static final m5 a = new m5();
    public static final List b = sy.d0Shadow.o("id", "pullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.k8 k8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                k8Var = (u10.k8) aa.c.c(l5.a, true).a(eVar, wVar);
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
        if (k8Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new u10.l8(str, k8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.l8 l8Var = (u10.l8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l8Var.a);
        fVar.z0("pullRequest");
        aa.c.c(l5.a, true).b(fVar, wVar, l8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l8Var.c);
    }
}
