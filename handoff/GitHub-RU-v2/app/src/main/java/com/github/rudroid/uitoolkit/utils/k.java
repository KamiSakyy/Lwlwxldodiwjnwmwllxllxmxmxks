package com.github.rudroid.uitoolkit.utils;

import a5.c1;
import a5.p2;
import a5.u0;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.f1;
import java.util.WeakHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ f1 r;
    public final /* synthetic */ View s;

    public /* synthetic */ k(f1 f1Var, View view) {
        this.r = f1Var;
        this.s = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakHashMap weakHashMap = c1.a;
        p2 a = u0.a(this.s);
        this.r.setValue(Boolean.valueOf(a != null ? a.a.q(8) : true));
    }
}
