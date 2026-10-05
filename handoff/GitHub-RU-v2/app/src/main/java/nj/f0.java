package nj;

import java.util.List;
import xn.g4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 extends c71.j implements j71.g {
    public /* synthetic */ g4 v;
    public /* synthetic */ boolean w;
    public /* synthetic */ d x;
    public final /* synthetic */ g0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, a71.c cVar) {
        super(4, cVar);
        this.y = g0Var;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        f0 f0Var = new f0(this.y, (a71.c) obj4);
        f0Var.v = (g4) obj;
        f0Var.w = booleanValue;
        f0Var.x = (d) obj3;
        return f0Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        g4 g4Var = this.v;
        boolean z = this.w;
        d dVar = this.x;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (!z) {
            return g4Var;
        }
        this.y.s.getClass();
        k71.k.g(g4Var, "real");
        k71.k.g(dVar, "fieldOverrides");
        xn.e1 e1Var = dVar.a;
        if (e1Var == null) {
            e1Var = g4Var.a;
        }
        xn.e1 e1Var2 = e1Var;
        Boolean bool = dVar.b;
        boolean booleanValue = bool != null ? bool.booleanValue() : g4Var.b;
        Boolean bool2 = dVar.c;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : g4Var.c;
        Boolean bool3 = dVar.d;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : g4Var.d;
        xn.f1 f1Var = dVar.e;
        if (f1Var == null) {
            f1Var = g4Var.h;
        }
        sz0.b bVar = g4Var.e;
        List list = g4Var.f;
        String str = g4Var.g;
        k71.k.g(e1Var2, "licenseType");
        k71.k.g(list, "availableCopilotUpgradeSkus");
        return new g4(e1Var2, booleanValue, booleanValue2, booleanValue3, bVar, list, str, f1Var);
    }
}
