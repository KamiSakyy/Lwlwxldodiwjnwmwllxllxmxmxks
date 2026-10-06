package vn0;

import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b3 implements aa.a {
    public static final b3 a = new b3();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "status", "conclusion", "workflowFilePath", "repository", "matchingPullRequests", "duration", "branch", "creator", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r10 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r13 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return new vn0.r2(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        k41.b.B(r19, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        k41.b.B(r19, "duration");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        k41.b.B(r19, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        k41.b.B(r19, "status");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        k41.b.B(r19, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r10 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        pz0.e3 e3Var = null;
        pz0.y2 y2Var = null;
        String str2 = null;
        x2 x2Var = null;
        u2 u2Var = null;
        q2 q2Var = null;
        s2 s2Var = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
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
                case 2:
                    num = num2;
                    y2Var = (pz0.y2) aa.c.b(qz0.a.c).a(eVar, wVar);
                    break;
                case 3:
                    num = num2;
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    num = num2;
                    x2Var = (x2) aa.c.c(h3.a, false).a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    u2Var = (u2) aa.c.b(aa.c.c(e3.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                        continue;
                    }
                case 7:
                    num = num2;
                    q2Var = (q2) aa.c.b(aa.c.c(a3.a, false)).a(eVar, wVar);
                    break;
                case 8:
                    num = num2;
                    s2Var = (s2) aa.c.b(aa.c.c(c3.a, false)).a(eVar, wVar);
                    break;
                case 9:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r2 r2Var = (r2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r2Var.a);
        fVar.z0("status");
        fVar.I(r2Var.b.r);
        fVar.z0("conclusion");
        aa.c.b(qz0.a.c).b(fVar, wVar, r2Var.c);
        fVar.z0("workflowFilePath");
        aa.c.i.b(fVar, wVar, r2Var.d);
        fVar.z0("repository");
        aa.c.c(h3.a, false).b(fVar, wVar, r2Var.e);
        fVar.z0("matchingPullRequests");
        aa.c.b(aa.c.c(e3.a, false)).b(fVar, wVar, r2Var.f);
        fVar.z0("duration");
        fVar.z(r2Var.g);
        fVar.z0("branch");
        aa.c.b(aa.c.c(a3.a, false)).b(fVar, wVar, r2Var.h);
        fVar.z0("creator");
        aa.c.b(aa.c.c(c3.a, false)).b(fVar, wVar, r2Var.i);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r2Var.j);
    }
}
