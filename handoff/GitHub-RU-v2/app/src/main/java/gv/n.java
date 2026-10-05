package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "baseCommitOid", "headCommitOid", "endCommitOid", "startCommitOid", "startLine", "endLine"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        k41.b.B(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        return new gv.h(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            nn.a aVar = tp.a.a;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 3:
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    str5 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 5:
                    num = (Integer) aa.c.b(aVar).a(eVar, wVar);
                    break;
                case 6:
                    num2 = (Integer) aa.c.b(aVar).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hVar.a);
        fVar.z0("baseCommitOid");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, hVar.b);
        fVar.z0("headCommitOid");
        o0Var.b(fVar, wVar, hVar.c);
        fVar.z0("endCommitOid");
        o0Var.b(fVar, wVar, hVar.d);
        fVar.z0("startCommitOid");
        o0Var.b(fVar, wVar, hVar.e);
        fVar.z0("startLine");
        nn.a aVar = tp.a.a;
        aa.c.b(aVar).b(fVar, wVar, hVar.f);
        fVar.z0("endLine");
        aa.c.b(aVar).b(fVar, wVar, hVar.g);
    }
}
