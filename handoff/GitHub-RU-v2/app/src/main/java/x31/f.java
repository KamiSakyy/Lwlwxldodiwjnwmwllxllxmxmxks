package x31;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import e50.z0;
import o31.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends LinearLayout {
    public static final /* synthetic */ int t = 0;
    public ValueAnimator r;
    public final /* synthetic */ TabLayout s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.s = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.s;
        if (tabLayout.o0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            z0 z0Var = tabLayout.c0;
            Drawable drawable = tabLayout.F;
            z0Var.getClass();
            RectF a = z0.a(tabLayout, childAt);
            drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
            tabLayout.r = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.s;
        Rect bounds = tabLayout.F.getBounds();
        tabLayout.F.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.s;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.F;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.F.getBounds().bottom);
        } else {
            tabLayout.c0.b(tabLayout, view, view2, f, tabLayout.F);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        TabLayout tabLayout = this.s;
        if (tabLayout.r == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.r = i;
        e eVar = new e(this, childAt, childAt2);
        if (!z) {
            this.r.removeAllUpdateListeners();
            this.r.addUpdateListener(eVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.r = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.d0);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.s;
        int height2 = tabLayout.F.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.F.getIntrinsicHeight();
        }
        int i = tabLayout.S;
        if (i == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                height2 = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.F.getBounds().width() > 0) {
            Rect bounds = tabLayout.F.getBounds();
            tabLayout.F.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.F.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.r;
        TabLayout tabLayout = this.s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.r == -1) {
            tabLayout.r = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.s;
        boolean z = true;
        if (tabLayout.Q == 1 || tabLayout.T == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) o.d(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.Q = 0;
                tabLayout.o(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
