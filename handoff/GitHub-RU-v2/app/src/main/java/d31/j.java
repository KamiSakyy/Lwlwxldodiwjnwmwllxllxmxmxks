package d31;

import a5.c1;
import a5.t0;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.measurement.internal.x3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.b0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends b0 {
    public FrameLayout A;
    public boolean B;
    public boolean C;
    public boolean D;
    public i E;
    public boolean F;
    public l51.h G;
    public h H;
    public BottomSheetBehavior x;
    public FrameLayout y;
    public CoordinatorLayout z;

    /* JADX WARN: Multi-variable type inference failed */
    public final void cancel() {
        g();
        super/*android.app.Dialog*/.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.y == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), 2131558761, null);
            this.y = frameLayout;
            this.z = frameLayout.findViewById(2131362177);
            FrameLayout frameLayout2 = (FrameLayout) this.y.findViewById(2131362220);
            this.A = frameLayout2;
            BottomSheetBehavior A = BottomSheetBehavior.A(frameLayout2);
            this.x = A;
            h hVar = this.H;
            ArrayList arrayList = A.Z;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
            this.x.G(this.B);
            this.G = new l51.h(this.x, this.A);
        }
    }

    public final BottomSheetBehavior g() {
        if (this.x == null) {
            f();
        }
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrameLayout h(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout findViewById = this.y.findViewById(2131362177);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) findViewById, false);
        }
        if (this.F) {
            FrameLayout frameLayout = this.y;
            x3 x3Var = new x3(4, this);
            WeakHashMap weakHashMap = c1.a;
            t0.m(frameLayout, x3Var);
        }
        this.A.removeAllViews();
        if (layoutParams == null) {
            this.A.addView(view);
        } else {
            this.A.addView(view, layoutParams);
        }
        findViewById.findViewById(2131363463).setOnClickListener(new com.google.android.material.datepicker.k(1, this));
        c1.p(this.A, new androidx.viewpager.widget.f(2, this));
        this.A.setOnTouchListener(new g(0));
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.app.Dialog*/.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.F && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.y;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.z;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            b4.g0(window, !z);
            i iVar = this.E;
            if (iVar != null) {
                iVar.e(window);
            }
        }
        l51.h hVar = this.G;
        if (hVar == null) {
            return;
        }
        View view = (View) hVar.u;
        p31.c cVar = (p31.c) hVar.s;
        if (this.B) {
            if (cVar != null) {
                cVar.b((p31.b) hVar.t, view, false);
            }
        } else if (cVar != null) {
            cVar.c(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void onDetachedFromWindow() {
        p31.c cVar;
        i iVar = this.E;
        if (iVar != null) {
            iVar.e(null);
        }
        l51.h hVar = this.G;
        if (hVar == null || (cVar = (p31.c) hVar.s) == null) {
            return;
        }
        cVar.c((View) hVar.u);
    }

    public final void onStart() {
        super/*d.l*/.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.x;
        if (bottomSheetBehavior == null || bottomSheetBehavior.O != 5) {
            return;
        }
        bottomSheetBehavior.I(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCancelable(boolean z) {
        l51.h hVar;
        super/*android.app.Dialog*/.setCancelable(z);
        if (this.B != z) {
            this.B = z;
            BottomSheetBehavior bottomSheetBehavior = this.x;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z);
            }
            if (getWindow() == null || (hVar = this.G) == null) {
                return;
            }
            View view = (View) hVar.u;
            p31.c cVar = (p31.c) hVar.s;
            if (this.B) {
                if (cVar != null) {
                    cVar.b((p31.b) hVar.t, view, false);
                }
            } else if (cVar != null) {
                cVar.c(view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCanceledOnTouchOutside(boolean z) {
        super/*android.app.Dialog*/.setCanceledOnTouchOutside(z);
        if (z && !this.B) {
            this.B = true;
        }
        this.C = z;
        this.D = true;
    }

    public final void setContentView(int i) {
        super.setContentView(h(null, i, null));
    }

    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout {
        public CoordinatorLayout() {
        }
    }
}
