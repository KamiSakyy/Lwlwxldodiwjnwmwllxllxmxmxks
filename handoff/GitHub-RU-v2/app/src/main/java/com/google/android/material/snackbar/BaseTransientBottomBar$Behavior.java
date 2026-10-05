package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import s21.a;
import w31.f;
import w31.h;
import w51.r;

/* loaded from: /home/user/work/p/classes4.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final a i;

    public BaseTransientBottomBar$Behavior() {
        a aVar = new a(23, false);
        this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.e = 0;
        this.i = aVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        a aVar = this.i;
        aVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                r.D().M((f) aVar.s);
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            r.D().K((f) aVar.s);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.i.getClass();
        return view instanceof h;
    }


}
