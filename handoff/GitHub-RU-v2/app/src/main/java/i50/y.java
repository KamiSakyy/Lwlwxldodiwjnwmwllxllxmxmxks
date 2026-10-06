package i50;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "url", "viewerCanMarkAsAnswer", "viewerCanUnmarkAsAnswer", "isAnswer", "discussion", "id"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r15 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r16 = r7;
        r7 = r15.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r16 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r8 = r16.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return new i50.u(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        k41.b.B(r17, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        k41.b.B(r17, "isAnswer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        k41.b.B(r17, "viewerCanUnmarkAsAnswer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        k41.b.B(r17, "viewerCanMarkAsAnswer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        k41.b.B(r17, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        k41.b.B(r17, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        r17.s0();
        r11 = c40.e.c(r17, r18);
        r17.s0();
        r8 = i80.e.a;
        r12 = i80.e.c(r17, r18);
        r17.s0();
        r13 = g70.b.c(r17, r18);
        r17.s0();
        r8 = y60.c.a;
        r14 = y60.c.c(r17, r18);
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        r15 = r6;
        r6 = r8.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        t tVar = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 5:
                    tVar = (t) aa.c.b(aa.c.c(xShadow.a, false)).a(eVar, wVar);
                    bool2 = bool2;
                    bool3 = bool3;
                    continue;
                case 6:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, u uVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, uVar.b);
        fVar.z0("viewerCanMarkAsAnswer");
        aa.b bVar2 = aa.c.f;
        f4.C(uVar.c, bVar2, fVar, wVar, "viewerCanUnmarkAsAnswer");
        f4.C(uVar.d, bVar2, fVar, wVar, "isAnswer");
        f4.C(uVar.e, bVar2, fVar, wVar, "discussion");
        aa.c.b(aa.c.c(xShadow.a, false)).b(fVar, wVar, uVar.f);
        fVar.z0("id");
        bVar.b(fVar, wVar, uVar.g);
        List list = c40.e.a;
        c40.e.d(fVar, wVar, uVar.h);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, uVar.i);
        List list2 = g70.b.a;
        g70.b.d(fVar, wVar, uVar.j);
        y60.c cVar = y60.c.a;
        y60.c.d(fVar, wVar, uVar.k);
    }
}
