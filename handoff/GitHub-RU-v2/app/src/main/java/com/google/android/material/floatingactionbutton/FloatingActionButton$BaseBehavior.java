package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import l4.b;
import l4.e;
import x21.a;

/* loaded from: /home/user/work/p/classes4.dex */
public class FloatingActionButton$BaseBehavior<T> extends b {
    public FloatingActionButton$BaseBehavior() {
    }

    public final boolean e(View view) {
        throw new ClassCastException();
    }

    public final void g(e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }






}
