package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b5.f;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends a5.b {
    public final /* synthetic */ AppBarLayout u;
    public final /* synthetic */ CoordinatorLayout v;
    public final /* synthetic */ AppBarLayout.BaseBehavior w;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.w = baseBehavior;
        this.u = appBarLayout;
        this.v = coordinatorLayout;
    }

    public final void d(View view, f fVar) {
        ((a5.b) this).r.onInitializeAccessibilityNodeInfo(view, fVar.a);
        fVar.j(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.u;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.v;
        AppBarLayout.BaseBehavior baseBehavior = this.w;
        View B = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (B == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((z21.c) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    fVar.b(b5.b.h);
                    fVar.p(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!B.canScrollVertically(-1)) {
                        fVar.b(b5.b.i);
                        fVar.p(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            fVar.b(b5.b.i);
                            fVar.p(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.u;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.w;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.v;
            View B = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!B.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.E(coordinatorLayout, this.u, B, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }


}
