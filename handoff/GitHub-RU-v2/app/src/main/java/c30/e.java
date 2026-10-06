package c30;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = sy.d0.o("id", "viewerIsFollowing", "isFollowingViewer", "followers", "following", "viewerCanBlock", "viewerCanUnblock", "__typename");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r14 = r6;
        r6 = r13.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r7 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r14 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r15 = r9;
        r9 = r14.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r15 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r10 = r15.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r11 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return new c30.c(r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        k41.b.B(r17, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        k41.b.B(r17, "viewerCanUnblock");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        k41.b.B(r17, "viewerCanBlock");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        k41.b.B(r17, "following");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        k41.b.B(r17, "followers");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        k41.b.B(r17, "isFollowingViewer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        k41.b.B(r17, "viewerIsFollowing");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        k41.b.B(r17, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r4 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r13 = r5;
        r5 = r10.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r13 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        a aVar = null;
        b bVar = null;
        Boolean bool5 = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 2:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    aVar = (a) aa.c.c(f.a, false).a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    bVar = (b) aa.c.c(g.a, false).a(eVar, wVar);
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
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c cVar = (c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("viewerIsFollowing");
        aa.b bVar2 = aa.c.f;
        f4.C(cVar.b, bVar2, fVar, wVar, "isFollowingViewer");
        f4.C(cVar.c, bVar2, fVar, wVar, "followers");
        aa.c.c(f.a, false).b(fVar, wVar, cVar.d);
        fVar.z0("following");
        aa.c.c(g.a, false).b(fVar, wVar, cVar.e);
        fVar.z0("viewerCanBlock");
        f4.C(cVar.f, bVar2, fVar, wVar, "viewerCanUnblock");
        f4.C(cVar.g, bVar2, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, cVar.h);
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
