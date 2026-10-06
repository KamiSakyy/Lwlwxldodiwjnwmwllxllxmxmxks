package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f7 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "status", "repository", "creator", "workflowRun", "checkRuns", "matchingPullRequests"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return new jo.va(r2, r3, r4, r5, r6, r7, r8, r9);
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
    public static jo.va c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        m10.b4 b4Var = null;
        jo.ya yaVar = null;
        jo.oa oaVar = null;
        jo.ab abVar = null;
        jo.ma maVar = null;
        jo.qa qaVar = null;
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
                    m10.b4.Companion.getClass();
                    Iterator it = m10.b4.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((m10.b4) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    m10.b4 b4Var2 = (m10.b4) obj;
                    if (b4Var2 != null) {
                        b4Var = b4Var2;
                        break;
                    } else {
                        b4Var = m10.b4.t;
                        break;
                    }
                case 3:
                    yaVar = (jo.ya) aa.c.c(i7.a, false).a(eVar, wVar);
                    break;
                case 4:
                    oaVar = (jo.oa) aa.c.b(aa.c.c(y6.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    abVar = (jo.ab) aa.c.b(aa.c.c(k7.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    maVar = (jo.ma) aa.c.b(aa.c.c(x6.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    qaVar = (jo.qa) aa.c.b(aa.c.c(a7.a, false)).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jo.va vaVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vaVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vaVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, vaVar.b);
        fVar.z0("status");
        fVar.I(vaVar.c.r);
        fVar.z0("repository");
        aa.c.c(i7.a, false).b(fVar, wVar, vaVar.d);
        fVar.z0("creator");
        aa.c.b(aa.c.c(y6.a, true)).b(fVar, wVar, vaVar.e);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(k7.a, false)).b(fVar, wVar, vaVar.f);
        fVar.z0("checkRuns");
        aa.c.b(aa.c.c(x6.a, false)).b(fVar, wVar, vaVar.g);
        fVar.z0("matchingPullRequests");
        aa.c.b(aa.c.c(a7.a, false)).b(fVar, wVar, vaVar.h);
    }
}
