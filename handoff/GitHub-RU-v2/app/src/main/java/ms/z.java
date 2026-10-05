package ms;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z implements aa.a {
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
    
        return new ms.v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
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
        r11 = ar.e.c(r17, r18);
        r17.s0();
        r8 = pv.f.a;
        r12 = pv.f.c(r17, r18);
        r17.s0();
        r13 = pu.b.c(r17, r18);
        r17.s0();
        r8 = ju.d.a;
        r14 = ju.d.c(r17, r18);
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
    public static v c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        u uVar = null;
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
                    uVar = (u) aa.c.b(aa.c.c(y.a, false)).a(eVar, wVar);
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

    public static void d(ea.f fVar, aa.w wVar, v vVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, vVar.b);
        fVar.z0("viewerCanMarkAsAnswer");
        aa.b bVar2 = aa.c.f;
        f4.C(vVar.c, bVar2, fVar, wVar, "viewerCanUnmarkAsAnswer");
        f4.C(vVar.d, bVar2, fVar, wVar, "isAnswer");
        f4.C(vVar.e, bVar2, fVar, wVar, "discussion");
        aa.c.b(aa.c.c(y.a, false)).b(fVar, wVar, vVar.f);
        fVar.z0("id");
        bVar.b(fVar, wVar, vVar.g);
        List list = ar.e.a;
        ar.e.d(fVar, wVar, vVar.h);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, vVar.i);
        List list2 = pu.b.a;
        pu.b.d(fVar, wVar, vVar.j);
        ju.d dVar = ju.d.a;
        ju.d.d(fVar, wVar, vVar.k);
    }
}
