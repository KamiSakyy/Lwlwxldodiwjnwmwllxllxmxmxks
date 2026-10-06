package wf;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.rudroid.common.m0;
import com.github.rudroid.searchandfilter.filter.sort.FilterSortFragment;
import ic.k9;
import java.util.List;
import wf.h;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends g<m0> {
    public List g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(FilterSortFragment filterSortFragment) {
        super(filterSortFragment, r0);
        m0 m0Var = m0.r;
        D(true);
        this.g = x61.l.r(new h[]{new h.b(m0Var, false, 2131954302), new h.b(m0.s, true, 2131954303), new h.b(m0.t, false, 2131954300), new h.b(m0.u, true, 2131954298), new h.b(m0.v, false, 2131954304), new h.b(m0.w, true, 2131954299), new h.c(1)});
    }

    @Override // wf.g
    /* renamed from: F */
    public final void v(com.github.rudroid.adapters.viewholders.e eVar, int i) {
        if (((h) this.g.get(i)) instanceof h.c) {
            m mVar = eVar instanceof m ? (m) eVar : null;
            if (mVar != null) {
                m0 m0Var = (m0) this.f;
                k71.k.g(m0Var, "filter");
                j jVar = mVar.w;
                jVar.getClass();
                jVar.f = m0Var;
                jVar.n();
            }
        } else {
            super.v(eVar, i);
        }
        eVar.u.F0();
    }

    @Override // wf.g
    /* renamed from: G */
    public final com.github.rudroid.adapters.viewholders.e w(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.w(viewGroup, i);
        }
        k9 b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559185, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new m(b, this.d);
    }

    @Override // wf.g
    public final List getData() {
        return this.g;
    }
    public Object D(boolean) { return null; }
}
