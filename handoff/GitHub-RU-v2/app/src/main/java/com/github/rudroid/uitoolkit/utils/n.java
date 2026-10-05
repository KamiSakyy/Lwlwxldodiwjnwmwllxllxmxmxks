package com.github.rudroid.uitoolkit.utils;

import a5.n1;
import a5.p2;
import a5.x1;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends n1 {
    public final /* synthetic */ View t;
    public final /* synthetic */ View u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ComposeView composeView, View view) {
        super(1);
        this.t = composeView;
        this.u = view;
    }

    public final void f(x1 x1Var) {
        if ((x1Var.a.d() & 8) == 0) {
            return;
        }
        Boolean a = o.a(this.u);
        this.t.setVisibility((a == null || !a.booleanValue()) ? 0 : 8);
    }

    public final void g(x1 x1Var) {
        if ((x1Var.a.d() & 8) == 0) {
            return;
        }
        Boolean a = o.a(this.u);
        this.t.setVisibility(a != null ? a.booleanValue() : true ? 0 : 8);
    }

    public final p2 h(p2 p2Var, List list) {
        k71.k.g(p2Var, "insets");
        k71.k.g(list, "runningAnimations");
        return p2Var;
    }










    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ComposeView<T1,T2,T3,T4> {
        public ComposeView() {
        }
    }
}
