package z21;

import a5.p2;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import sy.o;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h extends i {
    public Rect c;
    public Rect d;
    public int e;
    public int f;

    public h() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout z;
        p2 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (z = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (z.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int totalScrollRange = z.getTotalScrollRange() + size;
        int measuredHeight = z.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.s(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // z21.i
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout z = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.l(view));
        if (z == null) {
            coordinatorLayout.r(view, i);
            this.e = 0;
            return;
        }
        l4.e layoutParams = view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int bottom = z.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int bottom2 = ((z.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        p2 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i2 = layoutParams.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int y = y(z);
        view.layout(rect2.left, rect2.top - y, rect2.right, rect2.bottom - y);
        this.e = rect2.top - z.getBottom();
    }

    public final int y(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            l4.b bVar = appBarLayout.getLayoutParams().a;
            int y = bVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) bVar).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + y > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (y / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return o.b((int) (f * i2), 0, i2);
    }

    public h(int i) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout {
        public CoordinatorLayout() {
        }
    }
}
