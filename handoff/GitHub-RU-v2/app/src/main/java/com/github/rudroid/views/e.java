package com.github.rudroid.views;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.rudroid.common.b0;
import com.github.service.models.response.Avatar;
import ic.o1;

/* loaded from: /home/user/work/p/classes3.dex */
public class e extends FrameLayout {
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            k71.k.d(childAt);
            if (childAt.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                k71.k.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((int) 0.0f) * i13;
                int i15 = layoutParams2.gravity;
                if (i15 == -1) {
                    i15 = 0;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection());
                int i16 = i15 & 112;
                int i17 = absoluteGravity & 7;
                if (i17 == 1) {
                    i5 = (((((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                } else if (i17 != 8388613) {
                    i5 = layoutParams2.leftMargin + paddingLeft + layoutParams2.rightMargin;
                } else {
                    i6 = (((paddingRight - measuredWidth) - layoutParams2.rightMargin) - i12) + i14;
                    if (i16 == 16) {
                        if (i16 == 48) {
                            i11 = layoutParams2.topMargin;
                        } else if (i16 != 80) {
                            i11 = layoutParams2.topMargin;
                        } else {
                            i7 = paddingBottom - measuredHeight;
                            i8 = layoutParams2.bottomMargin;
                        }
                        i9 = i11 + paddingTop;
                        i12 += measuredWidth;
                        childAt.layout(i6, i9, measuredWidth + i6, measuredHeight + i9);
                    } else {
                        i7 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams2.topMargin;
                        i8 = layoutParams2.bottomMargin;
                    }
                    i9 = i7 - i8;
                    i12 += measuredWidth;
                    childAt.layout(i6, i9, measuredWidth + i6, measuredHeight + i9);
                }
                i6 = (i5 + i12) - i14;
                if (i16 == 16) {
                }
                i9 = i7 - i8;
                i12 += measuredWidth;
                childAt.layout(i6, i9, measuredWidth + i6, measuredHeight + i9);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            k71.k.d(childAt);
            if (childAt.getVisibility() == 8) {
                i3 = i;
                i4 = i2;
            } else {
                i3 = i;
                i4 = i2;
                measureChildWithMargins(childAt, i3, i6, i4, i7);
                i6 += (i5 == 0 || i5 == childCount) ? childAt.getMeasuredWidth() : childAt.getMeasuredWidth() - ((int) 0.0f);
                i7 = Math.max(i7, getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
            }
            i5++;
            i = i3;
            i2 = i4;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i6, i7);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void setAvatars(b0<Avatar> b0Var) {
        k71.k.g(b0Var, "avatars");
        int i = b0Var.b;
        removeAllViews();
        for (Avatar avatar : x61.m.x0((Iterable) b0Var.a, 0)) {
            o1 b = k5.b.b(LayoutInflater.from(getContext()), 2131558776, this, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            o1 o1Var = b;
            o1Var.P0(avatar);
            addView(((k5.f) o1Var).A);
        }
        if (i > 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(2131558777, (ViewGroup) this, false);
            k71.k.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) inflate).setText(getContext().getString(2131953411, Integer.valueOf(i)));
            addView(inflate);
        }
    }
}
