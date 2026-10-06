package d31;

import a5.p2;
import a5.q2;
import a5.r2;
import a5.t2;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import b6.a2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends d {
    public Boolean a;
    public p2 b;
    public Window c;
    public boolean d;

    public i(View view, p2 p2Var) {
        this.b = p2Var;
        u31.j jVar = BottomSheetBehavior.A(view).j;
        ColorStateList backgroundTintList = jVar != null ? jVar.s.d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(a.a.o(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList c = a2.c(view.getBackground());
        Integer valueOf = c != null ? Integer.valueOf(c.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(a.a.o(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // d31.d
    public final void a(View view) {
        d(view);
    }

    @Override // d31.d
    public final void b(View view) {
        d(view);
    }

    @Override // d31.d
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        p2 p2Var = this.b;
        if (top < p2Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                y51.c cVar = new y51.c(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new t2(window, cVar) : i >= 30 ? new r2(window, cVar) : new q2(window, cVar)).W(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), p2Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                y51.c cVar2 = new y51.c(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new t2(window2, cVar2) : i2 >= 30 ? new r2(window2, cVar2) : new q2(window2, cVar2)).W(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            y51.c cVar = new y51.c(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new t2(window, cVar) : i >= 30 ? new r2(window, cVar) : new q2(window, cVar)).P();
        }
    }


    public Object a;
}
