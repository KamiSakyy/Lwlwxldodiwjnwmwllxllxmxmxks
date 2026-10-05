package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0.o("__typename", "id", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jo.e1 e1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                e1Var = (jo.e1) aa.c.c(l0.a, true).a(eVar, wVar);
            }
        }
        eVar.s0();
        lv.c c = lv.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (e1Var != null) {
            return new jo.f1(str, str2, e1Var, c);
        }
        k41.b.B(eVar, "pullRequest");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.f1 f1Var = (jo.f1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, f1Var.b);
        fVar.z0("pullRequest");
        aa.c.c(l0.a, true).b(fVar, wVar, f1Var.c);
        List list = lv.f.a;
        lv.f.d(fVar, wVar, f1Var.d);
    }
}
