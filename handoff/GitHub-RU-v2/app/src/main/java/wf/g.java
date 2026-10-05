package wf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.rudroid.fragments.BindingFragment;
import com.github.rudroid.utilities.b3;
import ic.g9;
import java.util.List;
import l7.m0;
import wf.h;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g<T> extends m0 {
    public final BindingFragment d;
    public final Object e;
    public Object f;

    public g(s sVar, Object obj) {
        this.d = (BindingFragment) sVar;
        this.e = obj;
        this.f = obj;
    }

    @Override // 
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void v(com.github.rudroid.adapters.viewholders.e eVar, int i) {
        h hVar = (h) getData().get(i);
        if (!(hVar instanceof h.b)) {
            throw new IllegalStateException();
        }
        i iVar = eVar instanceof i ? (i) eVar : null;
        if (iVar != null) {
            h.b bVar = (h.b) hVar;
            Object obj = this.f;
            Object obj2 = bVar.b;
            g9 g9Var = ((com.github.rudroid.adapters.viewholders.e) iVar).u;
            g9 g9Var2 = g9Var instanceof g9 ? g9Var : null;
            if (g9Var2 != null) {
                TextView textView = g9Var2.O;
                g9 g9Var3 = g9Var;
                View view = ((k5.f) g9Var3).A;
                ConstraintLayout constraintLayout = g9Var3.N;
                textView.setText(view.getResources().getString(bVar.c));
                g9Var2.P.setChecked(k71.k.b(obj2, obj));
                g9Var2.N.setSelected(k71.k.b(obj2, obj));
                constraintLayout.setOnClickListener(new w31.k(4, iVar, bVar));
                g9Var3.P.setOnCheckedChangeListener(new wc.a(iVar, bVar, 1));
                int dimensionPixelSize = bVar.d ? ((k5.f) g9Var3).A.getResources().getDimensionPixelSize(2131165315) : 0;
                k71.k.f(constraintLayout, "container");
                b3.d(constraintLayout, 0, 0, 0, dimensionPixelSize);
            }
        }
        eVar.u.F0();
    }

    @Override // 
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public com.github.rudroid.adapters.viewholders.e w(ViewGroup viewGroup, int i) {
        if (i != 0) {
            throw new IllegalStateException();
        }
        g9 b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559183, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new i(b, this.d);
    }

    public abstract List getData();

    public final int k() {
        return getData().size();
    }

    public final long l(int i) {
        return i;
    }

    public final int m(int i) {
        return ((h) getData().get(i)).a;
    }

}
