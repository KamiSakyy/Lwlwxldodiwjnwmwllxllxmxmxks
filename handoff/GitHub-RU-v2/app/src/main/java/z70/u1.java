package z70;

import hc0.fm;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "pullRequestState", "title", "url", "number", "isDraft", "repository", "__typename"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0019. Please report as an issue. */
    public static t1 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer num2;
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num3 = null;
        String str = null;
        fm fmVar = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        s1 s1Var = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num3;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 1:
                    num2 = num3;
                    bool = bool2;
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
                    fm fmVar2 = (fm) obj;
                    fmVar = fmVar2 == null ? fm.v : fmVar2;
                    num3 = num2;
                    bool2 = bool;
                case 2:
                    num = num3;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 3:
                    num = num3;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 4:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        num3 = Integer.valueOf((int) nextLong);
                    } else {
                        num3 = Integer.valueOf((int) nextLong);
                    }
                    bool2 = bool;
                case 5:
                    num = num3;
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 6:
                    num2 = num3;
                    bool = bool2;
                    s1Var = (s1) aa.c.c(w1.a, false).a(eVar, wVar);
                    num3 = num2;
                    bool2 = bool;
                case 7:
                    num = num3;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
            }
            Integer num4 = num3;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (fmVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool3 = bool2;
            int intValue = num4.intValue();
            if (bool3 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            boolean booleanValue = bool3.booleanValue();
            if (s1Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (str4 != null) {
                return new t1(str, fmVar, str2, str3, intValue, booleanValue, s1Var, str4);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, t1 t1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t1Var.a);
        fVar.z0("pullRequestState");
        fVar.I(t1Var.b.r);
        fVar.z0("title");
        bVar.b(fVar, wVar, t1Var.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, t1Var.d);
        fVar.z0("number");
        fVar.z(t1Var.e);
        fVar.z0("isDraft");
        jo.f4.C(t1Var.f, aa.c.f, fVar, wVar, "repository");
        aa.c.c(w1.a, false).b(fVar, wVar, t1Var.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t1Var.h);
    }
}
