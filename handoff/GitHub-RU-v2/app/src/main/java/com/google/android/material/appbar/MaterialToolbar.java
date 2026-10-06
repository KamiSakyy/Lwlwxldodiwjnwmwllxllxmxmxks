package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b6.a2;
import java.util.ArrayList;
import java.util.Collections;
import o31.o;
import sy.w;
import u31.j;

/* loaded from: /home/user/work/p/classes4.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] t0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer o0;
    public boolean p0;
    public boolean q0;
    public ImageView.ScaleType r0;
    public Boolean s0;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130970021, 2132018556), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f = o.f(context2, attributeSet, x21.a.D, 2130970021, 2132018556, new int[0]);
        if (f.hasValue(2)) {
            setNavigationIconTint(f.getColor(2, -1));
        }
        this.p0 = f.getBoolean(4, false);
        this.q0 = f.getBoolean(3, false);
        int i = f.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = t0;
            if (i < scaleTypeArr.length) {
                this.r0 = scaleTypeArr[i];
            }
        }
        if (f.hasValue(0)) {
            this.s0 = Boolean.valueOf(f.getBoolean(0, false));
        }
        f.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : a2.c(background);
        if (valueOf != null) {
            j jVar = new j();
            jVar.q(valueOf);
            jVar.m(context2);
            jVar.p(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.r0;
    }

    public Integer getNavigationIconTint() {
        return this.o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            w.u(this, (j) background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        androidx.viewpager.widget.b bVar = o.c;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.p0 || this.q0) {
            ArrayList e = o.e(this, getTitle());
            TextView textView = e.isEmpty() ? null : (TextView) Collections.min(e, bVar);
            ArrayList e2 = o.e(this, getSubtitle());
            TextView textView2 = e2.isEmpty() ? null : (TextView) Collections.max(e2, bVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.p0 && textView != null) {
                    x(textView, pair);
                }
                if (this.q0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.s0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.r0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).p(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.s0;
        if (bool == null || bool.booleanValue() != z) {
            this.s0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.r0 != scaleType) {
            this.r0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.o0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.o0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.o0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSubtitleCentered(boolean z) {
        if (this.q0 != z) {
            this.q0 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitleCentered(boolean z) {
        if (this.p0 != z) {
            this.p0 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public <T0> T0 getBackground(Object... a) {
        return null;
    }

    public <T0> T0 getElevation(Object... a) {
        return null;
    }

    public <T0> T0 setBackground(Object... a) {
        return null;
    }

    public <T0> T0 getTitle(Object... a) {
        return null;
    }

    public <T0> T0 getSubtitle(Object... a) {
        return null;
    }

    public <T0> T0 getMeasuredWidth(Object... a) {
        return null;
    }

    public <T0> T0 getPaddingLeft(Object... a) {
        return null;
    }

    public <T0> T0 getPaddingRight(Object... a) {
        return null;
    }

    public <T0> T0 getChildCount(Object... a) {
        return null;
    }

    public <T0> T0 getChildAt(Object... a) {
        return null;
    }

    public <T0> T0 getLogo(Object... a) {
        return null;
    }

    public <T0> T0 requestLayout(Object... a) {
        return null;
    }

    public <T0> T0 getNavigationIcon(Object... a) {
        return null;
    }
}
