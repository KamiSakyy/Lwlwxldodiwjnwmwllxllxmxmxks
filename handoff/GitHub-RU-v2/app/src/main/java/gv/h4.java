package gv;

import java.util.Iterator;
import java.util.List;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h4 implements aa.a {
    public static final h4 a = new h4();
    public static final List b = sy.d0Shadow.o("id", "state", "__typename");

    public static e4 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b00 b00Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                b00.Companion.getClass();
                Iterator it = b00.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((b00) obj).r.equals(u)) {
                        break;
                    }
                }
                b00 b00Var2 = (b00) obj;
                b00Var = b00Var2 == null ? b00.v : b00Var2;
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
        if (b00Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new e4(str, b00Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e4 e4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e4Var.a);
        fVar.z0("state");
        fVar.I(e4Var.b.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e4Var.c);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (e4) obj);
    }
}
