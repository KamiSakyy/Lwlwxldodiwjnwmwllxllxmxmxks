package wc0;

import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "status", "conclusion", "url", "duration", "event", "artifacts", "repository", "push", "branch", "commit", "rerunnable", "app", "checkRuns", "failedCheckRuns", "runningCheckRuns", "skippedCheckRuns", "neutralCheckRuns", "successfulCheckRuns", "__typename"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0033. Please report as an issue. */
    public static v c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        Integer valueOf;
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        gn0.r2 r2Var = null;
        gn0.l2 l2Var = null;
        String str2 = null;
        Boolean bool2 = null;
        String str3 = null;
        d dVar = null;
        r rVar = null;
        p pVar = null;
        f fVar = null;
        h hVar = null;
        c cVar = null;
        g gVar = null;
        i iVar = null;
        s sVar = null;
        t tVar = null;
        j jVar = null;
        u uVar = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    Integer num3 = num2;
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    gn0.r2.Companion.getClass();
                    Iterator it = gn0.r2.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((gn0.r2) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    r2Var = (gn0.r2) obj;
                    if (r2Var == null) {
                        r2Var = gn0.r2.t;
                    }
                    num2 = num3;
                    bool2 = bool;
                case 2:
                    l2Var = (gn0.l2) aa.c.b(hn0.a.b).a(eVar, wVar);
                case 3:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                case 4:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    bool2 = bool;
                case 5:
                    str3 = (String) aa.c.i.a(eVar, wVar);
                case 6:
                    num = num2;
                    dVar = (d) aa.c.b(aa.c.c(xShadow.a, false)).a(eVar, wVar);
                    num2 = num;
                case 7:
                    num = num2;
                    rVar = (r) aa.c.c(m0.a, false).a(eVar, wVar);
                    num2 = num;
                case 8:
                    num = num2;
                    pVar = (p) aa.c.b(aa.c.c(k0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 9:
                    num = num2;
                    fVar = (f) aa.c.b(aa.c.c(z.a, false)).a(eVar, wVar);
                    num2 = num;
                case 10:
                    num = num2;
                    hVar = (h) aa.c.c(c0.a, false).a(eVar, wVar);
                    num2 = num;
                case 11:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                case 12:
                    num = num2;
                    cVar = (c) aa.c.b(aa.c.c(w.a, false)).a(eVar, wVar);
                    num2 = num;
                case 13:
                    num = num2;
                    gVar = (g) aa.c.b(aa.c.c(a0Shadow.a, false)).a(eVar, wVar);
                    num2 = num;
                case 14:
                    num = num2;
                    iVar = (i) aa.c.b(aa.c.c(d0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 15:
                    num = num2;
                    sVar = (s) aa.c.b(aa.c.c(n0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 16:
                    num = num2;
                    tVar = (t) aa.c.b(aa.c.c(o0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 17:
                    num = num2;
                    jVar = (j) aa.c.b(aa.c.c(e0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 18:
                    num = num2;
                    uVar = (u) aa.c.b(aa.c.c(p0.a, false)).a(eVar, wVar);
                    num2 = num;
                case 19:
                    str4 = (String) aa.c.a.a(eVar, wVar);
            }
            Integer num4 = num2;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (r2Var == null) {
                k41.b.B(eVar, "status");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "duration");
                throw null;
            }
            Boolean bool3 = bool2;
            int intValue = num4.intValue();
            if (rVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (hVar == null) {
                k41.b.B(eVar, "commit");
                throw null;
            }
            if (bool3 == null) {
                k41.b.B(eVar, "rerunnable");
                throw null;
            }
            boolean booleanValue = bool3.booleanValue();
            if (str4 != null) {
                return new v(str, r2Var, l2Var, str2, intValue, str3, dVar, rVar, pVar, fVar, hVar, booleanValue, cVar, gVar, iVar, sVar, tVar, jVar, uVar, str4);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, v vVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.a);
        fVar.z0("status");
        fVar.I(vVar.b.r);
        fVar.z0("conclusion");
        aa.c.b(hn0.a.b).b(fVar, wVar, vVar.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, vVar.d);
        fVar.z0("duration");
        fVar.z(vVar.e);
        fVar.z0("event");
        aa.c.i.b(fVar, wVar, vVar.f);
        fVar.z0("artifacts");
        aa.c.b(aa.c.c(xShadow.a, false)).b(fVar, wVar, vVar.g);
        fVar.z0("repository");
        aa.c.c(m0.a, false).b(fVar, wVar, vVar.h);
        fVar.z0("push");
        aa.c.b(aa.c.c(k0.a, false)).b(fVar, wVar, vVar.i);
        fVar.z0("branch");
        aa.c.b(aa.c.c(z.a, false)).b(fVar, wVar, vVar.j);
        fVar.z0("commit");
        aa.c.c(c0.a, false).b(fVar, wVar, vVar.k);
        fVar.z0("rerunnable");
        f4.C(vVar.l, aa.c.f, fVar, wVar, "app");
        aa.c.b(aa.c.c(w.a, false)).b(fVar, wVar, vVar.m);
        fVar.z0("checkRuns");
        aa.c.b(aa.c.c(a0Shadow.a, false)).b(fVar, wVar, vVar.n);
        fVar.z0("failedCheckRuns");
        aa.c.b(aa.c.c(d0.a, false)).b(fVar, wVar, vVar.o);
        fVar.z0("runningCheckRuns");
        aa.c.b(aa.c.c(n0.a, false)).b(fVar, wVar, vVar.p);
        fVar.z0("skippedCheckRuns");
        aa.c.b(aa.c.c(o0.a, false)).b(fVar, wVar, vVar.q);
        fVar.z0("neutralCheckRuns");
        aa.c.b(aa.c.c(e0.a, false)).b(fVar, wVar, vVar.r);
        fVar.z0("successfulCheckRuns");
        aa.c.b(aa.c.c(p0.a, false)).b(fVar, wVar, vVar.s);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vVar.t);
    }
}
