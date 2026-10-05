package com.github.rudroid.searchandfilter.complexfilter;

import androidx.recyclerview.widget.RecyclerView;
import l7.b1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 extends b1 {
    public final /* synthetic */ RecyclerView a;
    public final /* synthetic */ SearchAndFilterBaseFragment b;

    public a0(RecyclerView recyclerView, SearchAndFilterBaseFragment searchAndFilterBaseFragment) {
        this.a = recyclerView;
        this.b = searchAndFilterBaseFragment;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.b.B4().O.setSelected(i2 > 0 || this.a.computeVerticalScrollOffset() != 0);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView<T1,T2,T3,T4> {
        public RecyclerView() {
        }
    }
}
