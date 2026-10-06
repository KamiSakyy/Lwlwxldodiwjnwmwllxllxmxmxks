package sc0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = sy.d0.o(new String[]{"id", "branch", "rerunnable", "repository", "workflowRun", "app", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return new rc0.c(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        k41.b.B(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        k41.b.B(r11, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        k41.b.B(r11, "rerunnable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        k41.b.B(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r4 = r4.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r5 == null) goto L15;
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
        rc0.b bVar = null;
        rc0.l lVar = null;
        rc0.o oVar = null;
        rc0.a aVar = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    bVar = (rc0.b) aa.c.b(aa.c.c(b.a, false)).a(eVar, wVar);
                    break;
                case 2:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    bool = bool2;
                    lVar = (rc0.l) aa.c.c(k.a, false).a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    oVar = (rc0.o) aa.c.b(aa.c.c(n.a, false)).a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    aVar = (rc0.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0.c cVar = (rc0.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("branch");
        aa.c.b(aa.c.c(b.a, false)).b(fVar, wVar, cVar.b);
        fVar.z0("rerunnable");
        f4.C(cVar.c, aa.c.f, fVar, wVar, "repository");
        aa.c.c(k.a, false).b(fVar, wVar, cVar.d);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(n.a, false)).b(fVar, wVar, cVar.e);
        fVar.z0("app");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.f);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cVar.g);
    }
    public Object b(Object p1) { return null; }
    public static final Object f = null;
    public static final Object i = null;
}
