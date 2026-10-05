package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.measurement.internal.x3;
import e31.a;
import e31.b;
import e31.c;
import e31.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jo.f4;
import q.o;
import sy.w;
import t5.e;
import t5.f;
import u31.a0;
import u31.b0;
import u31.c0;
import u31.j;
import u31.m;
import u31.n;
import u31.y;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public class MaterialButton extends o implements Checkable, y {
    public static final int[] W = {R.attr.state_checkable};
    public static final int[] a0 = {R.attr.state_checked};
    public static final a b0 = new a();
    public String A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public int K;
    public int L;
    public LinearLayout.LayoutParams M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public c0 R;
    public int S;
    public float T;
    public float U;
    public e V;
    public final e31.e u;
    public final LinkedHashSet v;
    public b w;
    public PorterDuff.Mode x;
    public ColorStateList y;
    public Drawable z;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a41.a.b(context, attributeSet, 2130969450, 2132018456, new int[]{2130969486}), attributeSet, 2130969450);
        this.v = new LinkedHashSet();
        this.F = false;
        this.G = false;
        this.I = -1;
        this.J = -1.0f;
        this.K = -1;
        this.L = -1;
        this.Q = -1;
        Context context2 = getContext();
        TypedArray f = o31.o.f(context2, attributeSet, x21.a.q, 2130969450, 2132018456, new int[0]);
        this.E = f.getDimensionPixelSize(13, 0);
        int i = f.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.x = o31.o.g(i, mode);
        this.y = i4.W(getContext(), f, 15);
        this.z = i4.Y(getContext(), f, 11);
        this.H = f.getInteger(12, 1);
        this.B = f.getDimensionPixelSize(14, 0);
        a0 b = a0.b(context2, f, 19);
        n c = b != null ? b.c() : n.c(context2, attributeSet, 2130969450, 2132018456).a();
        boolean z = f.getBoolean(17, false);
        e31.e eVar = new e31.e(this, c);
        this.u = eVar;
        eVar.f = f.getDimensionPixelOffset(2, 0);
        eVar.g = f.getDimensionPixelOffset(3, 0);
        eVar.h = f.getDimensionPixelOffset(4, 0);
        eVar.i = f.getDimensionPixelOffset(5, 0);
        if (f.hasValue(9)) {
            int dimensionPixelSize = f.getDimensionPixelSize(9, -1);
            eVar.j = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            m g = eVar.b.g();
            g.e = new u31.a(f2);
            g.f = new u31.a(f2);
            g.g = new u31.a(f2);
            g.h = new u31.a(f2);
            eVar.b = g.a();
            eVar.c = null;
            eVar.d();
            eVar.s = true;
        }
        eVar.k = f.getDimensionPixelSize(22, 0);
        eVar.l = o31.o.g(f.getInt(8, -1), mode);
        eVar.m = i4.W(getContext(), f, 7);
        eVar.n = i4.W(getContext(), f, 21);
        eVar.o = i4.W(getContext(), f, 18);
        eVar.t = f.getBoolean(6, false);
        eVar.w = f.getDimensionPixelSize(10, 0);
        eVar.u = f.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f.hasValue(0)) {
            eVar.r = true;
            setSupportBackgroundTintList(eVar.m);
            setSupportBackgroundTintMode(eVar.l);
        } else {
            eVar.c();
        }
        setPaddingRelative(paddingStart + eVar.f, paddingTop + eVar.h, paddingEnd + eVar.g, paddingBottom + eVar.i);
        setCheckedInternal(f.getBoolean(1, false));
        if (b != null) {
            eVar.d = d();
            if (eVar.c != null) {
                eVar.d();
            }
            eVar.c = b;
            eVar.d();
        }
        setOpticalCenterEnabled(z);
        f.recycle();
        setCompoundDrawablePadding(this.E);
        h(this.z != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.O = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j a;
        if (this.N && this.P && (a = this.u.a(false)) != null) {
            return (int) (a.i() * 0.11f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCheckedInternal(boolean z) {
        e31.e eVar = this.u;
        if (eVar == null || !eVar.t || this.F == z) {
            return;
        }
        this.F = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.F;
            if (!materialButtonToggleGroup.C) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.G) {
            return;
        }
        this.G = true;
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw f4.g(it);
        }
        this.G = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.T != f) {
            this.T = f;
            j();
            invalidate();
            if (getParent() instanceof d) {
                d dVar = (d) getParent();
                int i = (int) this.T;
                int indexOfChild = dVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                int i2 = indexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (dVar.c(i2)) {
                            materialButton2 = (MaterialButton) dVar.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = dVar.getChildCount();
                while (true) {
                    indexOfChild++;
                    if (indexOfChild >= childCount) {
                        break;
                    } else if (dVar.c(indexOfChild)) {
                        materialButton = (MaterialButton) dVar.getChildAt(indexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f d() {
        Context context = getContext();
        TypedValue c0 = b4.c0(context, 2130969572);
        int[] iArr = x21.a.A;
        TypedArray obtainStyledAttributes = c0 == null ? context.obtainStyledAttributes(null, iArr, 0, 2132017565) : context.obtainStyledAttributes(c0.resourceId, iArr);
        f fVar = new f();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            fVar.b(f);
            fVar.a(f2);
            return fVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        e31.e eVar = this.u;
        return (eVar == null || eVar.r) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z) {
        int i;
        if (this.R == null) {
            return;
        }
        if (this.V == null) {
            e eVar = new e(this, b0);
            this.V = eVar;
            eVar.m = d();
        }
        if (this.P) {
            int i2 = this.S;
            c0 c0Var = this.R;
            int[] drawableState = getDrawableState();
            int[][] iArr = c0Var.c;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= c0Var.a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = c0Var.c;
                int i5 = 0;
                while (true) {
                    if (i5 >= c0Var.a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                i4 = i;
            }
            b0 b0Var = (b0) (i4 < 0 ? c0Var.b : c0Var.d[i4]).s;
            int width = getWidth();
            float f = b0Var.b;
            int i6 = b0Var.a;
            if (i6 == 1) {
                f *= width;
            }
            i3 = (int) f;
            this.V.a(Math.min(i2, i3));
            if (z) {
                this.V.d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        int i = this.H;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.z, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.z, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.z, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.A)) {
            return this.A;
        }
        e31.e eVar = this.u;
        return ((eVar == null || !eVar.t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.Q;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.u.j;
        }
        return 0;
    }

    public f getCornerSpringForce() {
        return this.u.d;
    }

    public Drawable getIcon() {
        return this.z;
    }

    public int getIconGravity() {
        return this.H;
    }

    public int getIconPadding() {
        return this.E;
    }

    public int getIconSize() {
        return this.B;
    }

    public ColorStateList getIconTint() {
        return this.y;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.x;
    }

    public int getInsetBottom() {
        return this.u.i;
    }

    public int getInsetTop() {
        return this.u.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.u.o;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        if (e()) {
            return this.u.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public a0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.u.c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.u.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.u.k;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.u.m : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.u.l : super.getSupportBackgroundTintMode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(boolean z) {
        Drawable drawable = this.z;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.z = mutate;
            mutate.setTintList(this.y);
            PorterDuff.Mode mode = this.x;
            if (mode != null) {
                this.z.setTintMode(mode);
            }
            int i = this.B;
            if (i == 0) {
                i = this.z.getIntrinsicWidth();
            }
            int i2 = this.B;
            if (i2 == 0) {
                i2 = this.z.getIntrinsicHeight();
            }
            Drawable drawable2 = this.z;
            int i3 = this.C;
            int i4 = this.D;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.z.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.H;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.z) || (((i5 == 3 || i5 == 4) && drawable5 != this.z) || ((i5 == 16 || i5 == 32) && drawable4 != this.z))) {
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i, int i2) {
        if (this.z == null || getLayout() == null) {
            return;
        }
        int i3 = this.H;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.C = 0;
                if (i3 == 16) {
                    this.D = 0;
                    h(false);
                    return;
                }
                int i4 = this.B;
                if (i4 == 0) {
                    i4 = this.z.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.E) - getPaddingBottom()) / 2);
                if (this.D != max) {
                    this.D = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.D = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.H;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.C = 0;
            h(false);
            return;
        }
        int i6 = this.B;
        if (i6 == 0) {
            i6 = this.z.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i6) - this.E) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.H == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.C != textLayoutWidth) {
            this.C = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        int i = (int) (this.T - this.U);
        int i2 = (i / 2) + this.O;
        getLayoutParams().width = (int) (this.J + i);
        setPaddingRelative(this.K + i2, getPaddingTop(), (this.L + i) - i2, getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (e()) {
            w.u(this, this.u.a(false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 2);
        e31.e eVar = this.u;
        if (eVar != null && eVar.t) {
            View.mergeDrawableStates(onCreateDrawableState, W);
        }
        if (this.F) {
            View.mergeDrawableStates(onCreateDrawableState, a0);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        e31.e eVar = this.u;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.t);
        accessibilityNodeInfo.setChecked(this.F);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.I != i6) {
            this.I = i6;
            this.J = -1.0f;
        }
        if (this.J == -1.0f) {
            this.J = getMeasuredWidth();
            if (this.M == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.M = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.M);
                layoutParams.width = (int) this.J;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.Q == -1) {
            if (this.z == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.B;
                if (i7 == 0) {
                    i7 = this.z.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.Q = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.K == -1) {
            this.K = getPaddingStart();
        }
        if (this.L == -1) {
            this.L = getPaddingEnd();
        }
        if ((getParent() instanceof d) && ((d) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.P = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(((i5.b) cVar).r);
        setChecked(cVar.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, e31.c, i5.b] */
    public final Parcelable onSaveInstanceState() {
        ?? cVar = new c(super/*android.view.View*/.onSaveInstanceState());
        cVar.t = this.F;
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performClick() {
        if (isEnabled() && this.u.u) {
            toggle();
        }
        return super/*android.view.View*/.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshDrawableState() {
        super/*android.view.View*/.refreshDrawableState();
        if (this.z != null) {
            if (this.z.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.A = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i) {
        if (!e()) {
            super/*android.view.View*/.setBackgroundColor(i);
            return;
        }
        e31.e eVar = this.u;
        if (eVar.a(false) != null) {
            eVar.a(false).setTint(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        e31.e eVar = this.u;
        eVar.r = true;
        MaterialButton materialButton = eVar.a;
        materialButton.setSupportBackgroundTintList(eVar.m);
        materialButton.setSupportBackgroundTintMode(eVar.l);
        super.setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? s.o(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.u.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            e31.e eVar = this.u;
            if (eVar.s && eVar.j == i) {
                return;
            }
            eVar.j = i;
            eVar.s = true;
            float f = i;
            m g = eVar.b.g();
            g.e = new u31.a(f);
            g.f = new u31.a(f);
            g.g = new u31.a(f);
            g.h = new u31.a(f);
            eVar.b = g.a();
            eVar.c = null;
            eVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(f fVar) {
        e31.e eVar = this.u;
        eVar.d = fVar;
        if (eVar.c != null) {
            eVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDisplayedWidthDecrease(int i) {
        this.U = Math.min(i, this.Q);
        j();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        if (e()) {
            this.u.a(false).p(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(Drawable drawable) {
        if (this.z != drawable) {
            this.z = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconGravity(int i) {
        if (this.H != i) {
            this.H = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconPadding(int i) {
        if (this.E != i) {
            this.E = i;
            setCompoundDrawablePadding(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconResource(int i) {
        setIcon(i != 0 ? s.o(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.B != i) {
            this.B = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.x != mode) {
            this.x = mode;
            h(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconTintResource(int i) {
        setIconTint(o4.b.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        e31.e eVar = this.u;
        eVar.b(eVar.h, i);
    }

    public void setInsetTop(int i) {
        e31.e eVar = this.u;
        eVar.b(i, eVar.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.w = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOpticalCenterEnabled(boolean z) {
        if (this.N != z) {
            this.N = z;
            e31.e eVar = this.u;
            if (z) {
                c5.b bVar = new c5.b(12, this);
                eVar.e = bVar;
                j a = eVar.a(false);
                if (a != null) {
                    a.V = bVar;
                }
            } else {
                eVar.e = null;
                j a2 = eVar.a(false);
                if (a2 != null) {
                    a2.V = null;
                }
            }
            post(new androidx.fragment.app.s(15, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        b bVar = this.w;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((x3) bVar).s).invalidate();
        }
        super/*android.view.View*/.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            e31.e eVar = this.u;
            o oVar = eVar.a;
            if (eVar.o != colorStateList) {
                eVar.o = colorStateList;
                if (oVar.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) oVar.getBackground()).setColor(s31.a.b(colorStateList));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(o4.b.c(getContext(), i));
        }
    }

    @Override // u31.y
    public void setShapeAppearanceModel(n nVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        e31.e eVar = this.u;
        eVar.b = nVar;
        eVar.c = null;
        eVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            e31.e eVar = this.u;
            eVar.q = z;
            eVar.e();
        }
    }

    public void setSizeChange(c0 c0Var) {
        if (this.R != c0Var) {
            this.R = c0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(a0 a0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        e31.e eVar = this.u;
        if (eVar.d == null && a0Var.d()) {
            eVar.d = d();
            if (eVar.c != null) {
                eVar.d();
            }
        }
        eVar.c = a0Var;
        eVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            e31.e eVar = this.u;
            if (eVar.n != colorStateList) {
                eVar.n = colorStateList;
                eVar.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(o4.b.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            e31.e eVar = this.u;
            if (eVar.k != i) {
                eVar.k = i;
                eVar.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        e31.e eVar = this.u;
        if (eVar.m != colorStateList) {
            eVar.m = colorStateList;
            if (eVar.a(false) != null) {
                eVar.a(false).setTintList(eVar.m);
            }
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        e31.e eVar = this.u;
        if (eVar.l != mode) {
            eVar.l = mode;
            if (eVar.a(false) == null || eVar.l == null) {
                return;
            }
            eVar.a(false).setTintMode(eVar.l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAlignment(int i) {
        super/*android.view.View*/.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.u.u = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWidth(int i) {
        this.J = -1.0f;
        super/*android.widget.TextView*/.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.S != i) {
            this.S = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.F);
    }
}
