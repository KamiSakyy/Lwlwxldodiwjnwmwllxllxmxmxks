package gb0;

import hc0.fm;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "isDraft", "number", "pullRequestState", "repository", "titleHTML"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    public static fb0.n c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Integer valueOf;
        Boolean bool2;
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        fm fmVar = null;
        fb0.h0 h0Var = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool3;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool3 = bool;
                case 1:
                    bool = bool3;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool3 = bool;
                case 2:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                case 3:
                    bool = bool3;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    bool3 = bool;
                case 4:
                    bool2 = bool3;
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    fm.Companion.getClass();
                    Iterator it = fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fmVar = (fm) obj;
                    if (fmVar == null) {
                        fmVar = fm.v;
                    }
                    bool3 = bool2;
                    num2 = num;
                case 5:
                    bool2 = bool3;
                    num = num2;
                    h0Var = (fb0.h0) aa.c.c(g0.a, false).a(eVar, wVar);
                    bool3 = bool2;
                    num2 = num;
                case 6:
                    bool = bool3;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool3 = bool;
            }
            Boolean bool4 = bool3;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (bool4 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Integer num3 = num2;
            boolean booleanValue = bool4.booleanValue();
            if (num3 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            int intValue = num3.intValue();
            if (fmVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (h0Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (str3 != null) {
                return new fb0.n(str, str2, booleanValue, intValue, fmVar, h0Var, str3);
            }
            k41.b.B(eVar, "titleHTML");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, fb0.n nVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, nVar.b);
        fVar.z0("isDraft");
        f4Shadow.C(nVar.c, aa.c.f, fVar, wVar, "number");
        fVar.z(nVar.d);
        fVar.z0("pullRequestState");
        fVar.I(nVar.e.r);
        fVar.z0("repository");
        aa.c.c(g0.a, false).b(fVar, wVar, nVar.f);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, nVar.g);
    }
}
