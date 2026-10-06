package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0Shadow.o("name", "about", "title", "body", "filename", "assignees", "labels");

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        k41.b.B(r11, "filename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        k41.b.B(r11, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r6 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return new w80.d(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        a aVar = null;
        e eVar2 = null;
        while (true) {
            switch (eVar.r0(b)) {
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
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    aVar = (a) aa.c.b(aa.c.c(i.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    eVar2 = (e) aa.c.b(aa.c.c(n.a, false)).a(eVar, wVar);
                    break;
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d dVar = (d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("about");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, dVar.b);
        fVar.z0("title");
        o0Var.b(fVar, wVar, dVar.c);
        fVar.z0("body");
        o0Var.b(fVar, wVar, dVar.d);
        fVar.z0("filename");
        bVar.b(fVar, wVar, dVar.e);
        fVar.z0("assignees");
        aa.c.b(aa.c.c(i.a, false)).b(fVar, wVar, dVar.f);
        fVar.z0("labels");
        aa.c.b(aa.c.c(n.a, false)).b(fVar, wVar, dVar.g);
    }
}
