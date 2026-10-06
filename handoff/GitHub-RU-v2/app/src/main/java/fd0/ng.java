package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ng implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "path", "subjectType", "thread", "url", "state"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        return new kc0.lo(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        k41.b.B(r14, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        k41.b.B(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        k41.b.B(r14, "subjectType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        k41.b.B(r14, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r14.s0();
        r9 = se0.e.c(r14, r15);
        r14.s0();
        r1 = aj0.f.a;
        r10 = aj0.f.c(r14, r15);
        r14.s0();
        r11 = sk0.d.c(r14, r15);
        r14.s0();
        r12 = yh0.b.c(r14, r15);
        r14.s0();
        r1 = qh0.d.a;
        r13 = qh0.d.c(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        if (r5 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kc0.lo c(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        gn0.dn dnVar = null;
        kc0.ro roVar = null;
        String str4 = null;
        gn0.lm lmVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    String u = eVar.u();
                    k71.k.d(u);
                    gn0.dn.Companion.getClass();
                    Iterator it = gn0.dn.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((gn0.dn) obj2).r.equals(u)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    gn0.dn dnVar2 = (gn0.dn) obj2;
                    if (dnVar2 != null) {
                        dnVar = dnVar2;
                        break;
                    } else {
                        dnVar = gn0.dn.v;
                        break;
                    }
                case 4:
                    roVar = (kc0.ro) aa.c.b(aa.c.c(tg.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    gn0.lm.Companion.getClass();
                    Iterator it2 = gn0.lm.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((gn0.lm) obj).r.equals(u2)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    gn0.lm lmVar2 = (gn0.lm) obj;
                    if (lmVar2 != null) {
                        lmVar = lmVar2;
                        break;
                    } else {
                        lmVar = gn0.lm.t;
                        break;
                    }
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.lo loVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(loVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, loVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, loVar.b);
        fVar.z0("path");
        bVar.b(fVar, wVar, loVar.c);
        fVar.z0("subjectType");
        fVar.I(loVar.d.r);
        fVar.z0("thread");
        aa.c.b(aa.c.c(tg.a, true)).b(fVar, wVar, loVar.e);
        fVar.z0("url");
        bVar.b(fVar, wVar, loVar.f);
        fVar.z0("state");
        fVar.I(loVar.g.r);
        List list = se0.e.a;
        se0.e.d(fVar, wVar, loVar.h);
        aj0.f fVar2 = aj0.f.a;
        aj0.f.d(fVar, wVar, loVar.i);
        List list2 = sk0.d.a;
        sk0.d.d(fVar, wVar, loVar.j);
        List list3 = yh0.b.a;
        yh0.b.d(fVar, wVar, loVar.k);
        qh0.d dVar = qh0.d.a;
        qh0.d.d(fVar, wVar, loVar.l);
    }
}
