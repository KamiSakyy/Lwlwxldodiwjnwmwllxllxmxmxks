package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.google.android.gms.internal.measurement.i4;
import f31.c;
import o31.o;
import o4.b;
import sy.w;
import u31.h;
import u31.j;
import u31.m;
import u31.n;
import u31.y;
import w.a;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public class MaterialCardView extends a implements Checkable, y {
    public static final int[] C = {R.attr.state_checkable};
    public static final int[] D = {R.attr.state_checked};
    public static final int[] E = {2130969812};
    public boolean A;
    public boolean B;
    public final c y;
    public final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, com.google.android.material.card.MaterialCardView, w.a] */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130969471, 2132018468), attributeSet);
        this.A = false;
        this.B = false;
        this.z = true;
        TypedArray f = o.f(getContext(), attributeSet, x21.a.v, 2130969471, 2132018468, new int[0]);
        c cVar = new c(this, attributeSet);
        this.y = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        j jVar = cVar.c;
        jVar.q(cardBackgroundColor);
        cVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        ?? r2 = cVar.a;
        ColorStateList W = i4.W(r2.getContext(), f, 11);
        cVar.n = W;
        if (W == null) {
            cVar.n = ColorStateList.valueOf(-1);
        }
        cVar.h = f.getDimensionPixelSize(12, 0);
        boolean z = f.getBoolean(0, false);
        cVar.s = z;
        r2.setLongClickable(z);
        cVar.l = i4.W(r2.getContext(), f, 6);
        cVar.g(i4.Y(r2.getContext(), f, 2));
        cVar.f = f.getDimensionPixelSize(5, 0);
        cVar.e = f.getDimensionPixelSize(4, 0);
        cVar.g = f.getInteger(3, 8388661);
        ColorStateList W2 = i4.W(r2.getContext(), f, 7);
        cVar.k = W2;
        if (W2 == null) {
            cVar.k = ColorStateList.valueOf(a.a.n((View) r2, 2130968854));
        }
        ColorStateList W3 = i4.W(r2.getContext(), f, 1);
        W3 = W3 == null ? ColorStateList.valueOf(0) : W3;
        j jVar2 = cVar.d;
        jVar2.q(W3);
        RippleDrawable rippleDrawable = cVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.k);
        }
        jVar.p(r2.getCardElevation());
        float f2 = cVar.h;
        ColorStateList colorStateList = cVar.n;
        jVar2.s.k = f2;
        jVar2.invalidateSelf();
        h hVar = jVar2.s;
        if (hVar.e != colorStateList) {
            hVar.e = colorStateList;
            jVar2.onStateChange(jVar2.getState());
        }
        r2.setBackgroundInternal(cVar.d(jVar));
        Drawable c = cVar.j() ? cVar.c() : jVar2;
        cVar.i = c;
        r2.setForeground(cVar.d(c));
        f.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.y.c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.y).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        cVar.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        cVar.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    public ColorStateList getCardBackgroundColor() {
        return this.y.c.s.d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.y.d.s.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.y.j;
    }

    public int getCheckedIconGravity() {
        return this.y.g;
    }

    public int getCheckedIconMargin() {
        return this.y.e;
    }

    public int getCheckedIconSize() {
        return this.y.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.y.l;
    }

    public int getContentPaddingBottom() {
        return this.y.b.bottom;
    }

    public int getContentPaddingLeft() {
        return this.y.b.left;
    }

    public int getContentPaddingRight() {
        return this.y.b.right;
    }

    public int getContentPaddingTop() {
        return this.y.b.top;
    }

    public float getProgress() {
        return this.y.c.s.j;
    }

    public float getRadius() {
        return this.y.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.y.k;
    }

    public n getShapeAppearanceModel() {
        return this.y.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.y.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.y.n;
    }

    public int getStrokeWidth() {
        return this.y.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        c cVar = this.y;
        cVar.k();
        w.u(this, cVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 3);
        c cVar = this.y;
        if (cVar != null && cVar.s) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        if (this.A) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (this.B) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.y;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.y.e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.z) {
            c cVar = this.y;
            if (!cVar.r) {
                cVar.r = true;
            }
            super/*android.view.View*/.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundInternal(Drawable drawable) {
        super/*android.view.View*/.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.y.c.q(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        c cVar = this.y;
        cVar.c.p(cVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        j jVar = this.y.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.q(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.y.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.y.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        c cVar = this.y;
        if (cVar.g != i) {
            cVar.g = i;
            a aVar = cVar.a;
            cVar.e(aVar.getMeasuredWidth(), aVar.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.y.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.y.e = getResources().getDimensionPixelSize(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckedIconResource(int i) {
        this.y.g(s.o(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.y.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.y.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.y;
        cVar.l = colorStateList;
        Drawable drawable = cVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setClickable(boolean z) {
        super/*android.view.View*/.setClickable(z);
        c cVar = this.y;
        if (cVar != null) {
            cVar.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDragged(boolean z) {
        if (this.B != z) {
            this.B = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.y.m();
    }

    public void setOnCheckedChangeListener(f31.a aVar) {
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        c cVar = this.y;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f) {
        c cVar = this.y;
        cVar.c.r(f);
        j jVar = cVar.d;
        if (jVar != null) {
            jVar.r(f);
        }
        j jVar2 = cVar.q;
        if (jVar2 != null) {
            jVar2.r(f);
        }
    }

    public void setRadius(float f) {
        super.setRadius(f);
        c cVar = this.y;
        m g = cVar.m.g();
        g.e = new u31.a(f);
        g.f = new u31.a(f);
        g.g = new u31.a(f);
        g.h = new u31.a(f);
        cVar.h(g.a());
        cVar.i.invalidateSelf();
        if (cVar.i() || (cVar.a.getPreventCornerOverlap() && !cVar.c.n())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.y;
        cVar.k = colorStateList;
        RippleDrawable rippleDrawable = cVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRippleColorResource(int i) {
        ColorStateList c = b.c(getContext(), i);
        c cVar = this.y;
        cVar.k = c;
        RippleDrawable rippleDrawable = cVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u31.y
    public void setShapeAppearanceModel(n nVar) {
        setClipToOutline(nVar.f(getBoundsAsRectF()));
        this.y.h(nVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidth(int i) {
        c cVar = this.y;
        if (i != cVar.h) {
            cVar.h = i;
            j jVar = cVar.d;
            ColorStateList colorStateList = cVar.n;
            jVar.s.k = i;
            jVar.invalidateSelf();
            h hVar = jVar.s;
            if (hVar.e != colorStateList) {
                hVar.e = colorStateList;
                jVar.onStateChange(jVar.getState());
            }
        }
        invalidate();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        c cVar = this.y;
        cVar.m();
        cVar.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.y;
        if (cVar != null && cVar.s && isEnabled()) {
            this.A = !this.A;
            refreshDrawableState();
            b();
            cVar.f(this.A, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.y;
        if (cVar.n != colorStateList) {
            cVar.n = colorStateList;
            j jVar = cVar.d;
            jVar.s.k = cVar.h;
            jVar.invalidateSelf();
            h hVar = jVar.s;
            if (hVar.e != colorStateList) {
                hVar.e = colorStateList;
                jVar.onStateChange(jVar.getState());
            }
        }
        invalidate();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.y.c.q(colorStateList);
    }
}
