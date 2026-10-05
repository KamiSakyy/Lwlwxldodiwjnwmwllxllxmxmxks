package s01;

import aa.v0;
import java.util.Collection;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class b implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ l s;
    public final /* synthetic */ Object t;

    public /* synthetic */ b(l lVar, Object obj, int i) {
        this.r = i;
        this.s = lVar;
        this.t = obj;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        v0 v0Var = (v0) obj;
        switch (this.r) {
            case 0:
                k71.k.g(v0Var, "data");
                l lVar = this.s;
                return (v0) lVar.m.s(lVar.g.s(v0Var, x61.m.m0((Collection) lVar.j.k(v0Var), this.t)), 1);
            default:
                k71.k.g(v0Var, "$this$observeWithPartialResultErrors");
                Boolean bool = (Boolean) this.s.n.s(v0Var, this.t);
                bool.booleanValue();
                return bool;
        }
    }
}
