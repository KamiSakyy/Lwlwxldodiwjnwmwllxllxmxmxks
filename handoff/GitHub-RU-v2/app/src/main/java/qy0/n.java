package qy0;

import aa.o0;
import aa.w;
import java.util.List;
import py0.z;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0Shadow.o(new String[]{"filename", "body"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new z(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        z zVar = (z) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("filename");
        o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, zVar.a);
        fVar.z0("body");
        o0Var.b(fVar, wVar, zVar.b);
    }
}
