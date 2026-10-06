package fd0;

import java.util.List;
import kc0.b20;
import kc0.c20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fq implements aaShadow.a {
    public static final fq a = new fq();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "pullRequest", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b20 b20Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                b20Var = (b20) aa.c.c(eq.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        wi0.c c = wi0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (b20Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new c20(str, b20Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c20 c20Var = (c20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c20Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c20Var.a);
        fVar.z0("pullRequest");
        aa.c.c(eq.a, true).b(fVar, wVar, c20Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, c20Var.c);
        List list = wi0.f.a;
        wi0.f.d(fVar, wVar, c20Var.d);
    }
}
