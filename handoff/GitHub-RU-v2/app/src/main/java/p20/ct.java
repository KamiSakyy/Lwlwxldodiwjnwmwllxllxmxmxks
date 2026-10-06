package p20;

import java.util.Iterator;
import java.util.List;
import u10.f60;
import u10.i60;
import u10.j60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ct implements aaShadow.a {
    public static final ct a = new ct();
    public static final List b = sy.d0Shadow.o("__typename", "id", "url", "state", "milestone", "projectCards", "viewerCanDeleteHeadRef", "viewerCanReopen");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r9 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r11 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r15 = r10;
        r10 = r11.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r15 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        return new u10.j60(r4, r5, r6, r7, r8, r9, r10, r15.booleanValue(), r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        k41.b.B(r17, "viewerCanReopen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        k41.b.B(r17, "viewerCanDeleteHeadRef");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        k41.b.B(r17, "projectCards");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        k41.b.B(r17, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        k41.b.B(r17, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        k41.b.B(r17, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        k41.b.B(r17, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r17.s0();
        r12 = i30.j.c(r17, r18);
        r17.s0();
        r13 = c60.n.c(r17, r18);
        r17.s0();
        r14 = c40.e.c(r17, r18);
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r7 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        hc0.fm fmVar = null;
        f60 f60Var = null;
        i60 i60Var = null;
        Boolean bool3 = null;
        while (true) {
            switch (eVar.r0(b)) {
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
                    Boolean bool4 = bool2;
                    Boolean bool5 = bool3;
                    String u = eVar.u();
                    k71.k.d(u);
                    hc0.fm.Companion.getClass();
                    Iterator it = hc0.fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hc0.fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hc0.fm fmVar2 = (hc0.fm) obj;
                    fmVar = fmVar2 == null ? hc0.fm.v : fmVar2;
                    bool2 = bool4;
                    bool3 = bool5;
                    continue;
                case 4:
                    bool = bool2;
                    f60Var = (f60) aa.c.b(aa.c.c(ys.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    i60Var = (i60) aa.c.c(bt.a, false).a(eVar, wVar);
                    break;
                case 6:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 7:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j60 j60Var = (j60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j60Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j60Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j60Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, j60Var.c);
        fVar.z0("state");
        fVar.I(j60Var.d.r);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(ys.a, true)).b(fVar, wVar, j60Var.e);
        fVar.z0("projectCards");
        aa.c.c(bt.a, false).b(fVar, wVar, j60Var.f);
        fVar.z0("viewerCanDeleteHeadRef");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(j60Var.g, bVar2, fVar, wVar, "viewerCanReopen");
        bVar2.b(fVar, wVar, Boolean.valueOf(j60Var.h));
        List list = i30.j.a;
        i30.j.d(fVar, wVar, j60Var.i);
        List list2 = c60.n.a;
        c60.n.d(fVar, wVar, j60Var.j);
        List list3 = c40.e.a;
        c40.e.d(fVar, wVar, j60Var.k);
    }
}
