package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m7 implements aa.a {
    public static final m7 a = new m7();
    public static final List b = sy.d0Shadow.o("isViewer", "login", "avatarUrl", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "isViewer");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "avatarUrl");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str4 != null) {
            return new j7(str, str2, str3, str4, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j7 j7Var = (j7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j7Var, "value");
        fVar.z0("isViewer");
        jo.f4Shadow.C(j7Var.a, aa.c.f, fVar, wVar, "login");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j7Var.b);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, j7Var.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, j7Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j7Var.e);
    }
}
