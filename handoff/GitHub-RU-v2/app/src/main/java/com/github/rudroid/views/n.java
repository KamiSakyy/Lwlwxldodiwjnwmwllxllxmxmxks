package com.github.rudroid.views;

import com.github.rudroid.views.LoadingViewFlipper;
import com.github.rudroid.views.refreshableviews.SwipeRefreshUiStateRecyclerView;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class n implements b8.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ j71.a b;

    public /* synthetic */ n(int i, j71.a aVar) {
        this.a = i;
        this.b = aVar;
    }

    public final void a() {
        int i = this.a;
        j71.a aVar = this.b;
        switch (i) {
            case 0:
                LoadingViewFlipper.a aVar2 = LoadingViewFlipper.Companion;
                aVar.a();
                break;
            default:
                int i2 = SwipeRefreshUiStateRecyclerView.o0;
                aVar.a();
                break;
        }
    }
}
