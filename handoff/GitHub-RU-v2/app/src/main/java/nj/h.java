package nj;

import com.github.rudroid.copilot.h2;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ h2 C;
    public /* synthetic */ Object v;
    public final /* synthetic */ i w;
    public final /* synthetic */ oa.j x;
    public final /* synthetic */ String y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, oa.j jVar, String str, List list, String str2, String str3, h2 h2Var, a71.c cVar) {
        super(2, cVar);
        this.w = iVar;
        this.x = jVar;
        this.y = str;
        this.z = list;
        this.A = str2;
        this.B = str3;
        this.C = h2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        h hVar = new h(this.w, this.x, this.y, this.z, this.A, this.B, this.C, cVar);
        hVar.v = obj;
        return hVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (xn.s0) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        xn.s0 s0Var = (xn.s0) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        j0 j0Var = this.w.b;
        String str = s0Var.a;
        h2 h2Var = this.C;
        return new a61.l0(new y71.y(new cn.e(2, null, 3), j0Var.a(this.x, str, this.y, this.z, x61.r.r, this.A, this.B, h2Var)), s0Var, 26);
    }

}
