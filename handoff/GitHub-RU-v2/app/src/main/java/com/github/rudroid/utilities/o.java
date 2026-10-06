package com.github.rudroid.utilities;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends l7.t0 {
    public final void f(Rect rect, View view, RecyclerView recyclerView, l7.j1 j1Var) {
        k71.k.g(rect, "outRect");
        k71.k.g(view, "view");
        k71.k.g(j1Var, "state");
        l7.n1 P = RecyclerView.P(view);
        int h = P != null ? P.h() : -1;
        l7.n1 O = recyclerView.O(view);
        if (h != 0) {
            if (O instanceof cd.s) {
                rect.top = view.getResources().getDimensionPixelSize(2131165316);
            } else if (!(O instanceof cd.a)) {
                super.f(rect, view, recyclerView, j1Var);
            } else if (h != 3) {
                rect.top = view.getResources().getDimensionPixelSize(2131165316);
            }
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView {
        public RecyclerView() {
        }
    }
}
