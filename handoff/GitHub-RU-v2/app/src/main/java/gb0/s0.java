package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "nameWithOwner", "owner"});

    public static fb0.v0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        fb0.w0 w0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                w0Var = (fb0.w0) aa.c.c(t0.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "nameWithOwner");
            throw null;
        }
        if (w0Var != null) {
            return new fb0.v0(str, str2, w0Var);
        }
        k41.b.B(eVar, "owner");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, fb0.v0 v0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v0Var.a);
        fVar.z0("nameWithOwner");
        bVar.b(fVar, wVar, v0Var.b);
        fVar.z0("owner");
        aa.c.c(t0.a, true).b(fVar, wVar, v0Var.c);
    }
}
