package uu0;

import java.util.Iterator;
import java.util.List;
import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "titleHTML", "number", "issueState", "assignees", "closedByPullRequestsReferences", "stateReason", "issueType", "repository", "parent"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        r7 = r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r9 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r13 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return new uu0.j5(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        k41.b.B(r19, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        k41.b.B(r19, "assignees");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        k41.b.B(r19, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        k41.b.B(r19, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        k41.b.B(r19, "titleHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        k41.b.B(r19, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        k41.b.B(r19, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        r19.s0();
        r2 = uu0.g6.a;
        r15 = uu0.g6.c(r19, r20);
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r7 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j5 c(ea.e eVar, aa.w wVar) {
        Integer valueOf;
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        bf bfVar = null;
        c5 c5Var = null;
        d5 d5Var = null;
        df dfVar = null;
        e5 e5Var = null;
        i5 i5Var = null;
        h5 h5Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 3:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    continue;
                case 4:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    bf.Companion.getClass();
                    Iterator it = bf.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((bf) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    bfVar = (bf) obj;
                    if (bfVar == null) {
                        bfVar = bf.v;
                        break;
                    }
                    break;
                case 5:
                    c5Var = (c5) aa.c.c(k5.a, false).a(eVar, wVar);
                    continue;
                case 6:
                    d5Var = (d5) aa.c.b(aa.c.c(l5.a, false)).a(eVar, wVar);
                    continue;
                case 7:
                    dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
                    continue;
                case 8:
                    num = num2;
                    e5Var = (e5) aa.c.b(aa.c.c(m5.a, true)).a(eVar, wVar);
                    break;
                case 9:
                    i5Var = (i5) aa.c.c(q5.a, false).a(eVar, wVar);
                    continue;
                case 10:
                    h5Var = (h5) aa.c.b(aa.c.c(p5.a, false)).a(eVar, wVar);
                    continue;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, j5 j5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j5Var.b);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, j5Var.c);
        fVar.z0("number");
        fVar.z(j5Var.d);
        fVar.z0("issueState");
        fVar.I(j5Var.e.r);
        fVar.z0("assignees");
        aa.c.c(k5.a, false).b(fVar, wVar, j5Var.f);
        fVar.z0("closedByPullRequestsReferences");
        aa.c.b(aa.c.c(l5.a, false)).b(fVar, wVar, j5Var.g);
        fVar.z0("stateReason");
        aa.c.b(qz0.a.x).b(fVar, wVar, j5Var.h);
        fVar.z0("issueType");
        aa.c.b(aa.c.c(m5.a, true)).b(fVar, wVar, j5Var.i);
        fVar.z0("repository");
        aa.c.c(q5.a, false).b(fVar, wVar, j5Var.j);
        fVar.z0("parent");
        aa.c.b(aa.c.c(p5.a, false)).b(fVar, wVar, j5Var.k);
        g6 g6Var = g6.a;
        g6.d(fVar, wVar, j5Var.l);
    }
}
