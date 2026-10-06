package com.github.rudroid.utilities;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 extends l7.t0 {
    public final void f(Rect rect, View view, RecyclerView recyclerView, l7.j1 j1Var) {
        k71.k.g(rect, "outRect");
        k71.k.g(view, "view");
        k71.k.g(j1Var, "state");
        l7.n1 P = RecyclerView.P(view);
        if ((P != null ? P.h() : -1) != 0) {
            rect.top = 0;
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView {
        public RecyclerView() {
        }
    }
}
