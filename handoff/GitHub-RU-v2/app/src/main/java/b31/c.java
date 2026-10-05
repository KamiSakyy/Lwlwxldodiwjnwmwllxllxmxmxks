package b31;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.i1;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.behavior.SwipeDismissBehavior;
import w31.e;
import w31.f;
import w51.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends z3 {
    public int b;
    public int c = -1;
    public final /* synthetic */ SwipeDismissBehavior d;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.d = swipeDismissBehavior;
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final void A(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.d;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.b);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.b) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(View view, float f, float f2) {
        int i;
        e eVar;
        this.c = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.d;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.e;
            if (i2 != 2) {
                i = i2 == 0 ? this.b : this.b;
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.b;
                if (left >= i3) {
                    i = i3 + width;
                    z = true;
                }
            }
            i = this.b - width;
            z = true;
        }
        if (swipeDismissBehavior.a.n(i, view.getTop())) {
            view.postOnAnimation(new i1(swipeDismissBehavior, view, z));
        } else {
            if (!z || (eVar = swipeDismissBehavior.b) == null) {
                return;
            }
            eVar.a(view);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final boolean U(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.d.w(view);
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final int j(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.d.e;
        if (i2 == 0) {
            if (z) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        } else if (z) {
            width = this.b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final int k(View view, int i) {
        return view.getTop();
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final int u(View view) {
        return view.getWidth();
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final void y(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.d;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final void z(int i) {
        e eVar = this.d.b;
        if (eVar != null) {
            f fVar = eVar.r.w;
            if (i == 0) {
                r.D().M(fVar);
            } else if (i == 1 || i == 2) {
                r.D().K(fVar);
            }
        }
    }
}
