package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b6 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "status", "repository", "creator", "workflowRun", "checkRuns", "matchingPullRequests"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return new kc0.e9(r2, r3, r4, r5, r6, r7, r8, r9);
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
    public static kc0.e9 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        gn0.r2 r2Var = null;
        kc0.h9 h9Var = null;
        kc0.x8 x8Var = null;
        kc0.j9 j9Var = null;
        kc0.v8 v8Var = null;
        kc0.z8 z8Var = null;
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
                    gn0.r2 r2Var2 = (gn0.r2) obj;
                    if (r2Var2 != null) {
                        r2Var = r2Var2;
                        break;
                    } else {
                        r2Var = gn0.r2.t;
                        break;
                    }
                case 3:
                    h9Var = (kc0.h9) aa.c.c(e6.a, false).a(eVar, wVar);
                    break;
                case 4:
                    x8Var = (kc0.x8) aa.c.b(aa.c.c(u5.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    j9Var = (kc0.j9) aa.c.b(aa.c.c(g6.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    v8Var = (kc0.v8) aa.c.b(aa.c.c(t5.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    z8Var = (kc0.z8) aa.c.b(aa.c.c(w5.a, false)).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.e9 e9Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e9Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, e9Var.b);
        fVar.z0("status");
        fVar.I(e9Var.c.r);
        fVar.z0("repository");
        aa.c.c(e6.a, false).b(fVar, wVar, e9Var.d);
        fVar.z0("creator");
        aa.c.b(aa.c.c(u5.a, true)).b(fVar, wVar, e9Var.e);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(g6.a, false)).b(fVar, wVar, e9Var.f);
        fVar.z0("checkRuns");
        aa.c.b(aa.c.c(t5.a, false)).b(fVar, wVar, e9Var.g);
        fVar.z0("matchingPullRequests");
        aa.c.b(aa.c.c(w5.a, false)).b(fVar, wVar, e9Var.h);
    }
}
