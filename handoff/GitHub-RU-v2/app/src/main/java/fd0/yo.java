package fd0;

import java.util.List;
import kc0.f00;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class yo implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static f00 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        oj0.v3 c = oj0.x3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new f00(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, f00 f00Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f00Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f00Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, f00Var.b);
        List list = oj0.x3.a;
        oj0.x3.d(fVar, wVar, f00Var.c);
    }
}
