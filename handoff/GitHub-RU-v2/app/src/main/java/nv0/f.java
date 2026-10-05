package nv0;

import aa.w;
import java.util.List;
import k71.k;
import pz0.f40;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.o(new String[]{"__typename", "id", "viewerSubscription", "viewerCanSubscribe"});

    public static b c(ea.e eVar, w wVar) {
        Boolean bool;
        a aVar;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        f40 f40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                f40Var = (f40) aa.c.b(qz0.b.v).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
            bool2 = bool;
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            aVar = e.c(eVar, wVar);
        } else {
            aVar = null;
        }
        Boolean bool3 = bool2;
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool3 != null) {
            return new b(str, str2, f40Var, bool3.booleanValue(), aVar);
        }
        k41.b.B(eVar, "viewerCanSubscribe");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("viewerSubscription");
        aa.c.b(qz0.b.v).b(fVar, wVar, bVar.c);
        fVar.z0("viewerCanSubscribe");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(bVar.d));
        a aVar = bVar.e;
        if (aVar != null) {
            e.d(fVar, wVar, aVar);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, w wVar, Object obj) {
        d(fVar, wVar, (b) obj);
    }
}
