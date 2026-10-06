package wf;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import ic.i9;
import java.util.List;
import l7.m0;
import l7.n1;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j extends m0 {
    public s d;
    public List e;
    public com.github.rudroid.common.m0 f;

    public j(s sVar) {
        k71.k.g(sVar, "callback");
        this.d = sVar;
        this.f = com.github.rudroid.common.m0.r;
        D(true);
        this.e = d0.o(new k(com.github.rudroid.common.m0.x, "👍"), new k(com.github.rudroid.common.m0.y, "👎"), new k(com.github.rudroid.common.m0.z, "😄"), new k(com.github.rudroid.common.m0.A, "🎉"), new k(com.github.rudroid.common.m0.B, "😕"), new k(com.github.rudroid.common.m0.C, "❤️"), new k(com.github.rudroid.common.m0.D, "🚀"), new k(com.github.rudroid.common.m0.E, "👀"));
    }

    public final int k() {
        return this.e.size();
    }

    public final long l(int i) {
        return i;
    }

    public final void v(n1 n1Var, int i) {
        l lVar = (l) n1Var;
        k kVar = (k) this.e.get(i);
        com.github.rudroid.common.m0 m0Var = this.f;
        k71.k.g(kVar, "item");
        k71.k.g(m0Var, "filter");
        i9 i9Var = ((com.github.rudroid.adapters.viewholders.e) lVar).u;
        i9 i9Var2 = i9Var instanceof i9 ? i9Var : null;
        if (i9Var2 != null) {
            TextView textView = i9Var2.N;
            textView.setSelected(kVar.a == m0Var);
            textView.setText(kVar.b);
            i9Var.N.setOnClickListener(new w31.k(5, lVar, kVar));
        }
        i9Var.F0();
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        i9 b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559184, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new l(b, this.d);
    }
    public Object n() { return null; }
    public Object D(boolean p1) { return null; }
}
