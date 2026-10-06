package p20;

import java.util.List;
import u10.d00;
import u10.e00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vo implements aaShadow.a {
    public static final vo a = new vo();
    public static final List b = sy.d0Shadow.o("__typename", "pullRequest", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        d00 d00Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                d00Var = (d00) aa.c.c(uo.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        e80.c c = e80.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (d00Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new e00(str, d00Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e00 e00Var = (e00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e00Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e00Var.a);
        fVar.z0("pullRequest");
        aa.c.c(uo.a, true).b(fVar, wVar, e00Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, e00Var.c);
        List list = e80.f.a;
        e80.f.d(fVar, wVar, e00Var.d);
    }
}
