package com.github.rudroid.searchandfilter.complexfilter;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.rudroid.fragments.BindingFragment;
import com.github.rudroid.searchandfilter.complexfilter.c0;
import com.github.rudroid.utilities.b2;
import ic.m1;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class SearchAndFilterBaseFragment<T> extends BindingFragment implements s<T> {
    public final int B0 = 2131558759;
    public final w61.p C0 = sy.w.t(new j71.a() { // from class: com.github.rudroid.searchandfilter.complexfilter.z
        public final Object a() {
            return new com.github.rudroid.utilities.b(SearchAndFilterBaseFragment.this.i4());
        }
    });
    public q1 D0;

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[fl.g.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fl.g gVar = fl.g.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final int C4() {
        return this.B0;
    }

    public abstract e0 H4();

    public abstract d0 I4();

    @Override // com.github.rudroid.searchandfilter.complexfilter.s
    public final void b2(Object obj) {
        I4().i(obj);
    }

    public void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        B4().Q.setAdapter(H4());
        B4().Q.j(new vf.e(I4()));
        RecyclerView recyclerView = B4().Q;
        k71.k.f(recyclerView, "recyclerView");
        recyclerView.setAccessibilityDelegateCompat(new b2(recyclerView));
        RecyclerView recyclerView2 = B4().Q;
        recyclerView2.j(new a0(recyclerView2, this));
        I4().getData().e(F3(), new c0.a(new y(0, this)));
    }
}
