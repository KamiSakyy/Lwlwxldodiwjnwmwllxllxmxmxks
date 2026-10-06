package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p6 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "status", "repository", "creator", "workflowRun", "checkRuns", "matchingPullRequests"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return new jn0.y9(r2, r3, r4, r5, r6, r7, r8, r9);
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
    public static jn0.y9 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        pz0.e3 e3Var = null;
        jn0.ba baVar = null;
        jn0.r9 r9Var = null;
        jn0.da daVar = null;
        jn0.p9 p9Var = null;
        jn0.t9 t9Var = null;
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
                    pz0.e3.Companion.getClass();
                    Iterator it = pz0.e3.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((pz0.e3) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    pz0.e3 e3Var2 = (pz0.e3) obj;
                    if (e3Var2 != null) {
                        e3Var = e3Var2;
                        break;
                    } else {
                        e3Var = pz0.e3.t;
                        break;
                    }
                case 3:
                    baVar = (jn0.ba) aa.c.c(s6.a, false).a(eVar, wVar);
                    break;
                case 4:
                    r9Var = (jn0.r9) aa.c.b(aa.c.c(i6.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    daVar = (jn0.da) aa.c.b(aa.c.c(u6.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    p9Var = (jn0.p9) aa.c.b(aa.c.c(h6.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    t9Var = (jn0.t9) aa.c.b(aa.c.c(k6.a, false)).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.y9 y9Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y9Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, y9Var.b);
        fVar.z0("status");
        fVar.I(y9Var.c.r);
        fVar.z0("repository");
        aa.c.c(s6.a, false).b(fVar, wVar, y9Var.d);
        fVar.z0("creator");
        aa.c.b(aa.c.c(i6.a, true)).b(fVar, wVar, y9Var.e);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(u6.a, false)).b(fVar, wVar, y9Var.f);
        fVar.z0("checkRuns");
        aa.c.b(aa.c.c(h6.a, false)).b(fVar, wVar, y9Var.g);
        fVar.z0("matchingPullRequests");
        aa.c.b(aa.c.c(k6.a, false)).b(fVar, wVar, y9Var.h);
    }
}
