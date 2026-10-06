package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class zh implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "target", "message", "name", "commitUrl", "tagger"});

    public static kc0.hq c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.rq rqVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        kc0.qq qqVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                rqVar = (kc0.rq) aa.c.c(ji.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                qqVar = (kc0.qq) aa.c.b(aa.c.c(ii.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (rqVar == null) {
            k41.b.B(eVar, "target");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str4 != null) {
            return new kc0.hq(str, rqVar, str2, str3, str4, qqVar);
        }
        k41.b.B(eVar, "commitUrl");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.hq hqVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hqVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hqVar.a);
        fVar.z0("target");
        aa.c.c(ji.a, true).b(fVar, wVar, hqVar.b);
        fVar.z0("message");
        aa.c.i.b(fVar, wVar, hqVar.c);
        fVar.z0("name");
        bVar.b(fVar, wVar, hqVar.d);
        fVar.z0("commitUrl");
        bVar.b(fVar, wVar, hqVar.e);
        fVar.z0("tagger");
        aa.c.b(aa.c.c(ii.a, false)).b(fVar, wVar, hqVar.f);
    }
}
