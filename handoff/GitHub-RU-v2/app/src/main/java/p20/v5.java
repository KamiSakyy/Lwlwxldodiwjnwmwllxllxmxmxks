package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "status", "repository", "creator", "workflowRun", "checkRuns", "matchingPullRequests"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return new u10.w8(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        k41.b.B(r12, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        k41.b.B(r12, "status");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        k41.b.B(r12, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u10.w8 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        hc0.p2 p2Var = null;
        u10.z8 z8Var = null;
        u10.p8 p8Var = null;
        u10.b9 b9Var = null;
        u10.n8 n8Var = null;
        u10.r8 r8Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    String u = eVar.u();
                    k71.k.d(u);
                    hc0.p2.Companion.getClass();
                    Iterator it = hc0.p2.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hc0.p2) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hc0.p2 p2Var2 = (hc0.p2) obj;
                    if (p2Var2 != null) {
                        p2Var = p2Var2;
                        break;
                    } else {
                        p2Var = hc0.p2.t;
                        break;
                    }
                case 3:
                    z8Var = (u10.z8) aa.c.c(y5.a, false).a(eVar, wVar);
                    break;
                case 4:
                    p8Var = (u10.p8) aa.c.b(aa.c.c(o5.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    b9Var = (u10.b9) aa.c.b(aa.c.c(a6.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    n8Var = (u10.n8) aa.c.b(aa.c.c(n5.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    r8Var = (u10.r8) aa.c.b(aa.c.c(q5.a, false)).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, u10.w8 w8Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w8Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, w8Var.b);
        fVar.z0("status");
        fVar.I(w8Var.c.r);
        fVar.z0("repository");
        aa.c.c(y5.a, false).b(fVar, wVar, w8Var.d);
        fVar.z0("creator");
        aa.c.b(aa.c.c(o5.a, true)).b(fVar, wVar, w8Var.e);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(a6.a, false)).b(fVar, wVar, w8Var.f);
        fVar.z0("checkRuns");
        aa.c.b(aa.c.c(n5.a, false)).b(fVar, wVar, w8Var.g);
        fVar.z0("matchingPullRequests");
        aa.c.b(aa.c.c(q5.a, false)).b(fVar, wVar, w8Var.h);
    }
}
