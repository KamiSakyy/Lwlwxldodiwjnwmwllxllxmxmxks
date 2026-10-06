package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g5 implements aaShadow.a {
    public static final g5 a = new g5();
    public static final List b = sy.d0Shadow.o("clientMutationId", "copilot", "copilotProPlus", "copilotMax", "viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.v7 v7Var = null;
        jo.x7 x7Var = null;
        jo.w7 w7Var = null;
        jo.a8 a8Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                v7Var = (jo.v7) aa.c.b(aa.c.c(d5.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                x7Var = (jo.x7) aa.c.b(aa.c.c(f5.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                w7Var = (jo.w7) aa.c.b(aa.c.c(e5.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    return new jo.y7(str, v7Var, x7Var, w7Var, a8Var);
                }
                a8Var = (jo.a8) aa.c.b(aa.c.c(i5.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.y7 y7Var = (jo.y7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y7Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, y7Var.a);
        fVar.z0("copilot");
        aa.c.b(aa.c.c(d5.a, false)).b(fVar, wVar, y7Var.b);
        fVar.z0("copilotProPlus");
        aa.c.b(aa.c.c(f5.a, false)).b(fVar, wVar, y7Var.c);
        fVar.z0("copilotMax");
        aa.c.b(aa.c.c(e5.a, false)).b(fVar, wVar, y7Var.d);
        fVar.z0("viewer");
        aa.c.b(aa.c.c(i5.a, false)).b(fVar, wVar, y7Var.e);
    }
}
