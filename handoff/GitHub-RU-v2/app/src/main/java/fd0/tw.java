package fd0;

import java.util.List;
import kc0.rb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tw implements aaShadow.a {
    public static final tw a = new tw();
    public static final List b = sy.d0.o(new String[]{"__typename", "login", "id", "name"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        eVar.s0();
        ud0.c c = ud0.d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str3 != null) {
            return new rb0(str, str2, str3, str4, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rb0 rb0Var = (rb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rb0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rb0Var.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, rb0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, rb0Var.c);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, rb0Var.d);
        List list = ud0.d.a;
        ud0.d.d(fVar, wVar, rb0Var.e);
    }
}
