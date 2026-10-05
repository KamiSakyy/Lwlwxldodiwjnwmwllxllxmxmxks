package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class aj implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "path", "subjectType", "thread", "url", "state"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        return new jo.zr(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
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
        r9 = ar.e.c(r14, r15);
        r14.s0();
        r1 = pv.f.a;
        r10 = pv.f.c(r14, r15);
        r14.s0();
        r11 = mx.d.c(r14, r15);
        r14.s0();
        r12 = pu.b.c(r14, r15);
        r14.s0();
        r1 = ju.d.a;
        r13 = ju.d.c(r14, r15);
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
    public static jo.zr c(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        m10.xz xzVar = null;
        jo.fs fsVar = null;
        String str4 = null;
        m10.fz fzVar = null;
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
                    m10.xz.Companion.getClass();
                    Iterator it = m10.xz.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((m10.xz) obj2).r.equals(u)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    m10.xz xzVar2 = (m10.xz) obj2;
                    if (xzVar2 != null) {
                        xzVar = xzVar2;
                        break;
                    } else {
                        xzVar = m10.xz.v;
                        break;
                    }
                case 4:
                    fsVar = (jo.fs) aa.c.b(aa.c.c(gj.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    m10.fz.Companion.getClass();
                    Iterator it2 = m10.fz.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((m10.fz) obj).r.equals(u2)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    m10.fz fzVar2 = (m10.fz) obj;
                    if (fzVar2 != null) {
                        fzVar = fzVar2;
                        break;
                    } else {
                        fzVar = m10.fz.t;
                        break;
                    }
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jo.zr zrVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zrVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zrVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, zrVar.b);
        fVar.z0("path");
        bVar.b(fVar, wVar, zrVar.c);
        fVar.z0("subjectType");
        fVar.I(zrVar.d.r);
        fVar.z0("thread");
        aa.c.b(aa.c.c(gj.a, true)).b(fVar, wVar, zrVar.e);
        fVar.z0("url");
        bVar.b(fVar, wVar, zrVar.f);
        fVar.z0("state");
        fVar.I(zrVar.g.r);
        List list = ar.e.a;
        ar.e.d(fVar, wVar, zrVar.h);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, zrVar.i);
        List list2 = mx.d.a;
        mx.d.d(fVar, wVar, zrVar.j);
        List list3 = pu.b.a;
        pu.b.d(fVar, wVar, zrVar.k);
        ju.d dVar = ju.d.a;
        ju.d.d(fVar, wVar, zrVar.l);
    }
}
