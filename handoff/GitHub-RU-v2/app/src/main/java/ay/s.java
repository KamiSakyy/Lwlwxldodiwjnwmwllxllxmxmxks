package ay;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0.o("node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zx.g0 g0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g0Var = (zx.g0) aa.c.b(aa.c.c(t.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new zx.f0(g0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.f0 f0Var = (zx.f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(t.a, true)).b(fVar, wVar, f0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f0Var.c);
    }
}
