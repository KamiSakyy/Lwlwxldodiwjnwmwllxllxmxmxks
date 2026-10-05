package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import l4.b;

@Deprecated
/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    public abstract boolean f(View view, View view2);

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList l = coordinatorLayout.l(view);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view, (View) l.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }





}
