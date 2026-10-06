package dw;

import java.util.Iterator;
import java.util.List;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n6 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "titleHTML", "number", "issueState", "assignedActors", "closedByPullRequestsReferences", "stateReason", "issueType", "repository", "parent", "duplicateOf"});

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
    
        return new dw.e6(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        k41.b.B(r21, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        k41.b.B(r21, "assignedActors");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        k41.b.B(r21, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        k41.b.B(r21, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        k41.b.B(r21, "titleHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        k41.b.B(r21, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        k41.b.B(r21, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        r21.s0();
        r2 = dw.c7.a;
        r16 = dw.c7.c(r21, r22);
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
    public static e6 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        String str;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        wi wiVar = null;
        w5 w5Var = null;
        x5 x5Var = null;
        yi yiVar = null;
        z5 z5Var = null;
        d6 d6Var = null;
        c6 c6Var = null;
        y5 y5Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 1:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 2:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 3:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                            str2 = str2;
                        }
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    str2 = str;
                    continue;
                case 4:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    wi.Companion.getClass();
                    Iterator it = wi.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Iterator it2 = it;
                            if (!((wi) obj).r.equals(u)) {
                                it = it2;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    wiVar = (wi) obj;
                    if (wiVar == null) {
                        wiVar = wi.v;
                        break;
                    }
                    break;
                case 5:
                    num = num2;
                    w5Var = (w5) aa.c.c(f6.a, false).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    x5Var = (x5) aa.c.b(aa.c.c(g6.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    yiVar = (yi) aa.c.b(n10.b.f).a(eVar, wVar);
                    continue;
                case 8:
                    num = num2;
                    z5Var = (z5) aa.c.b(aa.c.c(i6.a, true)).a(eVar, wVar);
                    break;
                case 9:
                    num = num2;
                    d6Var = (d6) aa.c.c(m6.a, false).a(eVar, wVar);
                    break;
                case 10:
                    num = num2;
                    c6Var = (c6) aa.c.b(aa.c.c(l6.a, false)).a(eVar, wVar);
                    break;
                case 11:
                    num = num2;
                    y5Var = (y5) aa.c.b(aa.c.c(h6.a, true)).a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, e6 e6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e6Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e6Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e6Var.b);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, e6Var.c);
        fVar.z0("number");
        fVar.z(e6Var.d);
        fVar.z0("issueState");
        fVar.I(e6Var.e.r);
        fVar.z0("assignedActors");
        aa.c.c(f6.a, false).b(fVar, wVar, e6Var.f);
        fVar.z0("closedByPullRequestsReferences");
        aa.c.b(aa.c.c(g6.a, false)).b(fVar, wVar, e6Var.g);
        fVar.z0("stateReason");
        aa.c.b(n10.b.f).b(fVar, wVar, e6Var.h);
        fVar.z0("issueType");
        aa.c.b(aa.c.c(i6.a, true)).b(fVar, wVar, e6Var.i);
        fVar.z0("repository");
        aa.c.c(m6.a, false).b(fVar, wVar, e6Var.j);
        fVar.z0("parent");
        aa.c.b(aa.c.c(l6.a, false)).b(fVar, wVar, e6Var.k);
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(h6.a, true)).b(fVar, wVar, e6Var.l);
        c7 c7Var = c7.a;
        c7.d(fVar, wVar, e6Var.m);
    }
}
