package com.github.rudroid.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class BottomSheetViewPager extends androidx.viewpager.widget.k {
    public final Field t0;

    public static final class a extends androidx.viewpager.widget.j {
        public a() {
        }

        public final void b(int i) {
            BottomSheetViewPager.this.requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k71.k.g(context, "context");
        Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
        declaredField.setAccessible(true);
        this.t0 = declaredField;
        a aVar = new a();
        if (((androidx.viewpager.widget.k) this).l0 == null) {
            ((androidx.viewpager.widget.k) this).l0 = new ArrayList();
        }
        ((androidx.viewpager.widget.k) this).l0.add(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getCurrentView() {
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                return null;
            }
            View childAt = super/*android.view.ViewGroup*/.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewPager.LayoutParams layoutParams2 = layoutParams instanceof ViewPager.LayoutParams ? (ViewPager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                int i2 = this.t0.getInt(layoutParams2);
                if (!layoutParams2.a && getCurrentItem() == i2) {
                    return childAt;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View getChildAt(int i) {
        Boolean bool;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        k71.k.d(stackTrace);
        StackTraceElement stackTraceElement = (StackTraceElement) x61.l.P(1, stackTrace);
        if (stackTraceElement != null) {
            bool = Boolean.valueOf(k71.k.b(stackTraceElement.getClassName(), "com.google.android.material.bottomsheet.BottomSheetBehavior") && k71.k.b(stackTraceElement.getMethodName(), "findScrollingChild"));
        } else {
            bool = null;
        }
        if (!k71.k.b(bool, Boolean.TRUE)) {
            View childAt = super/*android.view.ViewGroup*/.getChildAt(i);
            k71.k.f(childAt, "getChildAt(...)");
            return childAt;
        }
        View currentView = getCurrentView();
        if (currentView == null) {
            View childAt2 = super/*android.view.ViewGroup*/.getChildAt(i);
            k71.k.f(childAt2, "getChildAt(...)");
            return childAt2;
        }
        if (i == 0) {
            return currentView;
        }
        View childAt3 = super/*android.view.ViewGroup*/.getChildAt(i);
        if (k71.k.b(childAt3, currentView)) {
            childAt3 = super/*android.view.ViewGroup*/.getChildAt(0);
        }
        k71.k.d(childAt3);
        return childAt3;
    }

    public <T0> T0 requestLayout(Object... a) {
        return null;
    }

    public <T0> T0 getChildCount(Object... a) {
        return null;
    }

    public <T0> T0 getCurrentItem(Object... a) {
        return null;
    }
}
