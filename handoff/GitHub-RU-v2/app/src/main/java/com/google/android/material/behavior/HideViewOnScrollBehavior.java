package com.google.android.material.behavior;

import a0.s0;
import a5.k1;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.h1;
import b31.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jo.f4;
import l4.b;

/* loaded from: /home/user/work/p/classes4.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {
    public b31.b a;
    public AccessibilityManager b;
    public a c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            a aVar = new a(this, view, 1);
            this.c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new h1(2, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = view.getLayoutParams().c;
        if (i3 == 80 || i3 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.a.a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.i = measuredHeight + i2;
        this.e = k41.b.J(2130969534, 225, view.getContext());
        this.f = k41.b.J(2130969540, 175, view.getContext());
        this.g = k41.b.K(view.getContext(), 2130969550, y21.a.d);
        this.h = k41.b.K(view.getContext(), 2130969550, y21.a.c);
        return false;
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.d.iterator();
            if (it.hasNext()) {
                throw f4.g(it);
            }
            this.k = this.a.U(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new k1(2, this));
        }
    }

    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        int i2;
        b31.b bVar = this.a;
        if (bVar != null) {
            switch (bVar.a) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i == 0) {
            this.a = new b31.b(2);
        } else if (i == 1) {
            this.a = new b31.b(0);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(s0.i("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
            }
            this.a = new b31.b(1);
        }
    }

    public final void x(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw f4.g(it);
        }
        this.a.getClass();
        this.k = this.a.U(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new k1(2, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout {
        public CoordinatorLayout() {
        }
    }
}
