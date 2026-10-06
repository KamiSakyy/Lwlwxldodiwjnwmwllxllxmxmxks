package l4;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {
    public boolean e(View view) {
        return false;
    }

    public boolean f(View view, View view2) {
        return false;
    }

    public void g(e eVar) {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void i(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void j() {
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10, int[] iArr, int i11) {
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
        return false;
    }

    public void r(View view, Parcelable parcelable) {
    }

    public Parcelable s(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10) {
        return false;
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }









    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout {
        public CoordinatorLayout() {
        }
    }
}
