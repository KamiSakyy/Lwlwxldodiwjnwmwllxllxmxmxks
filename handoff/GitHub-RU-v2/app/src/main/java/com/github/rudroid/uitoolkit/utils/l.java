package com.github.rudroid.uitoolkit.utils;

import android.view.View;
import androidx.compose.runtime.i0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements i0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ k b;

    public l(View view, k kVar) {
        this.a = view;
        this.b = kVar;
    }

    public final void a() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
    }
}
