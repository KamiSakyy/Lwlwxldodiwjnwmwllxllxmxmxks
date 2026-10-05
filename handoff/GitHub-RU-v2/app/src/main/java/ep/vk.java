package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class vk implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "target", "message", "name", "commitUrl", "tagger"});

    public static jo.hu c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.ru ruVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        jo.qu quVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ruVar = (jo.ru) aa.c.c(fl.a, true).a(eVar, wVar);
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
                quVar = (jo.qu) aa.c.b(aa.c.c(el.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (ruVar == null) {
            k41.b.B(eVar, "target");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str4 != null) {
            return new jo.hu(str, ruVar, str2, str3, str4, quVar);
        }
        k41.b.B(eVar, "commitUrl");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.hu huVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(huVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, huVar.a);
        fVar.z0("target");
        aa.c.c(fl.a, true).b(fVar, wVar, huVar.b);
        fVar.z0("message");
        aa.c.i.b(fVar, wVar, huVar.c);
        fVar.z0("name");
        bVar.b(fVar, wVar, huVar.d);
        fVar.z0("commitUrl");
        bVar.b(fVar, wVar, huVar.e);
        fVar.z0("tagger");
        aa.c.b(aa.c.c(el.a, false)).b(fVar, wVar, huVar.f);
    }
}
