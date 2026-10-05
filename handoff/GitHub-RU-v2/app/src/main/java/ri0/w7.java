package ri0;

import gn0.lm;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w7 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "position", "pullRequestReview", "thread", "path", "state", "url"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (r11 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return new ri0.s7(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        k41.b.B(r17, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        k41.b.B(r17, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        k41.b.B(r17, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        k41.b.B(r17, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        k41.b.B(r17, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r17.s0();
        r12 = se0.e.c(r17, r18);
        r17.s0();
        r3 = aj0.f.a;
        r13 = aj0.f.c(r17, r18);
        r17.s0();
        r14 = sk0.d.c(r17, r18);
        r17.s0();
        r15 = yh0.b.c(r17, r18);
        r17.s0();
        r3 = qh0.d.a;
        r16 = qh0.d.c(r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r10 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s7 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        p7 p7Var = null;
        r7 r7Var = null;
        String str3 = null;
        lm lmVar = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    num = (Integer) aa.c.b(od0.b.a).a(eVar, wVar);
                    break;
                case 3:
                    p7Var = (p7) aa.c.b(aa.c.c(u7.a, false)).a(eVar, wVar);
                    break;
                case 4:
                    r7Var = (r7) aa.c.b(aa.c.c(x7.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    String u = eVar.u();
                    k71.k.d(u);
                    lm.Companion.getClass();
                    Iterator it = lm.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((lm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    lm lmVar2 = (lm) obj;
                    if (lmVar2 != null) {
                        lmVar = lmVar2;
                        break;
                    } else {
                        lmVar = lm.t;
                        break;
                    }
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, s7 s7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, s7Var.b);
        fVar.z0("position");
        aa.c.b(od0.b.a).b(fVar, wVar, s7Var.c);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(u7.a, false)).b(fVar, wVar, s7Var.d);
        fVar.z0("thread");
        aa.c.b(aa.c.c(x7.a, true)).b(fVar, wVar, s7Var.e);
        fVar.z0("path");
        bVar.b(fVar, wVar, s7Var.f);
        fVar.z0("state");
        fVar.I(s7Var.g.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, s7Var.h);
        List list = se0.e.a;
        se0.e.d(fVar, wVar, s7Var.i);
        aj0.f fVar2 = aj0.f.a;
        aj0.f.d(fVar, wVar, s7Var.j);
        List list2 = sk0.d.a;
        sk0.d.d(fVar, wVar, s7Var.k);
        List list3 = yh0.b.a;
        yh0.b.d(fVar, wVar, s7Var.l);
        qh0.d dVar = qh0.d.a;
        qh0.d.d(fVar, wVar, s7Var.m);
    }
}
