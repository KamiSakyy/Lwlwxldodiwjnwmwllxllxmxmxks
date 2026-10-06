package j10;

import aa.w;
import i10.u;
import i10.v;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.a {
    public static final m a = new m();
    public static final List b = d0Shadow.o("email", "primaryEmail", "login", "mobileAuthStatus", "id", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        u uVar = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                uVar = (u) aa.c.b(aa.c.c(l.a, false)).a(eVar, wVar);
            } else if (r0 == 4) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str5 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "email");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str5 != null) {
            return new v(str, str2, str3, uVar, str4, str5);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        v vVar = (v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("email");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.a);
        fVar.z0("primaryEmail");
        aa.c.i.b(fVar, wVar, vVar.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, vVar.c);
        fVar.z0("mobileAuthStatus");
        aa.c.b(aa.c.c(l.a, false)).b(fVar, wVar, vVar.d);
        fVar.z0("id");
        bVar.b(fVar, wVar, vVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vVar.f);
    }

}
