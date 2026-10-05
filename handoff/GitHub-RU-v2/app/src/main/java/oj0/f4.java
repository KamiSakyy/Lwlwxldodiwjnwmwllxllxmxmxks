package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f4 implements aa.a {
    public static final f4 a = new f4();
    public static final List b = sy.d0.o(new String[]{"id", "lists", "__typename"});

    public static a4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y3 y3Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                y3Var = (y3) aa.c.c(d4.a, false).a(eVar, wVar);
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
        if (y3Var == null) {
            k41.b.B(eVar, "lists");
            throw null;
        }
        if (str2 != null) {
            return new a4(str, y3Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, a4 a4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a4Var.a);
        fVar.z0("lists");
        aa.c.c(d4.a, false).b(fVar, wVar, a4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, a4Var.c);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (a4) obj);
    }
}
