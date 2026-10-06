package ep;

import java.util.List;
import jo.s70;
import jo.v70;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class nu implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"starredRepositories", "id"});

    public static s70 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v70 v70Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                v70Var = (v70) aa.c.c(qu.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (v70Var == null) {
            k41.b.B(eVar, "starredRepositories");
            throw null;
        }
        if (str != null) {
            return new s70(v70Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s70 s70Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s70Var, "value");
        fVar.z0("starredRepositories");
        aa.c.c(qu.a, false).b(fVar, wVar, s70Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, s70Var.b);
    }
}
