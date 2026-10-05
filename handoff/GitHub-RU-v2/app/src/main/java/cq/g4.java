package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "url", "name", "shortDescriptionHTML", "tagName", "mentions", "repository", "discussion"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r9 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return new cq.c4(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        k41.b.B(r12, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        k41.b.B(r12, "tagName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        k41.b.B(r12, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r12.s0();
        r1 = pv.f.a;
        r11 = pv.f.c(r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r7 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        z3 z3Var = null;
        b4 b4Var = null;
        y3 y3Var = null;
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
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    str5 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 5:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    z3Var = (z3) aa.c.b(aa.c.c(e4.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    b4Var = (b4) aa.c.c(h4.a, true).a(eVar, wVar);
                    break;
                case 8:
                    y3Var = (y3) aa.c.b(aa.c.c(d4.a, false)).a(eVar, wVar);
                    break;
            }
        }
    }
}
