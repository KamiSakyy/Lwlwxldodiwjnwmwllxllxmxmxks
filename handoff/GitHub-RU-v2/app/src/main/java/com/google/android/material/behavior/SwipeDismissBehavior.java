package com.google.android.material.behavior;

import a5.c1;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b31.c;
import j5.d;
import l4.b;
import w31.e;

/* loaded from: /home/user/work/p/classes4.dex */
public class SwipeDismissBehavior<V extends View> extends b {
    public d a;
    public e b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final c h = new c(this);

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.d && this.a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            c1.m(view, 1048576);
            c1.i(view, 0);
            if (w(view)) {
                c1.n(view, b5.b.l, (String) null, new y51.c(15, this));
            }
        }
        return false;
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.i(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }






}
