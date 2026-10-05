package er0;

import ar0.j1;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "url", "viewerCanUpdate", "viewerCanMarkAsAnswer", "viewerCanUnmarkAsAnswer", "isAnswer", "deletedAt", "discussion"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        r18 = r7;
        r7 = r10.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r18 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        r19 = r8;
        r8 = r18.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r19 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        r20 = r9;
        r9 = r19.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r20 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        return new er0.i(r4, r5, r6, r7, r8, r9, r20.booleanValue(), r11, r12, r13, r14, r15, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        k41.b.B(r21, "isAnswer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        k41.b.B(r21, "viewerCanUnmarkAsAnswer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        k41.b.B(r21, "viewerCanMarkAsAnswer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        k41.b.B(r21, "viewerCanUpdate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        k41.b.B(r21, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        k41.b.B(r21, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        k41.b.B(r21, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r21.s0();
        r13 = yp0.e.c(r21, r22);
        r21.s0();
        r14 = gt0.b.c(r21, r22);
        r21.s0();
        r10 = at0.d.a;
        r15 = at0.d.c(r21, r22);
        r21.s0();
        r16 = ar0.j1.c(r21, r22);
        r21.s0();
        r10 = gu0.f.a;
        r17 = gu0.f.c(r21, r22);
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (r10 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        ZonedDateTime zonedDateTime = null;
        h hVar = null;
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
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) no.a.h(wVar, o7.a, eVar, wVar);
                    break;
                case 8:
                    hVar = (h) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
                    bool2 = bool2;
                    bool3 = bool3;
                    continue;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iVar.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, iVar.c);
        fVar.z0("viewerCanUpdate");
        aa.b bVar2 = aa.c.f;
        f4.C(iVar.d, bVar2, fVar, wVar, "viewerCanMarkAsAnswer");
        f4.C(iVar.e, bVar2, fVar, wVar, "viewerCanUnmarkAsAnswer");
        f4.C(iVar.f, bVar2, fVar, wVar, "isAnswer");
        f4.C(iVar.g, bVar2, fVar, wVar, "deletedAt");
        o7.Companion.getClass();
        aa.c.b(wVar.e(o7.a)).b(fVar, wVar, iVar.h);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, iVar.i);
        List list = yp0.e.a;
        yp0.e.d(fVar, wVar, iVar.j);
        List list2 = gt0.b.a;
        gt0.b.d(fVar, wVar, iVar.k);
        at0.d dVar = at0.d.a;
        at0.d.d(fVar, wVar, iVar.l);
        List list3 = j1.a;
        j1.d(fVar, wVar, iVar.m);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, iVar.n);
    }
}
