package com.google.android.material.chip;

import a41.a;
import a5.c1;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.material.chip.Chip;
import i31.b;
import i31.c;
import i31.d;
import i31.e;
import i31.f;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o31.h;
import o31.i;
import o31.m;
import o31.o;
import q.pShadow;
import sy.w;
import u31.n;
import u31.y;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public class Chip extends p implements e, y, i {
    public static final Rect O = new Rect();
    public static final int[] P = {R.attr.state_selected};
    public static final int[] Q = {R.attr.state_checkable};
    public h A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public CharSequence I;
    public final d J;
    public boolean K;
    public final Rect L;
    public final RectF M;
    public final b N;
    public f v;
    public InsetDrawable w;
    public RippleDrawable x;
    public View.OnClickListener y;
    public CompoundButton.OnCheckedChangeListener z;

    /* JADX WARN: Multi-variable type inference failed */
    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130968806, 2132018470), attributeSet, 2130968806);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.L = new Rect();
        this.M = new RectF();
        this.N = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.F0;
        int[] iArr = x21.a.f;
        TypedArray f = o.f(context3, attributeSet, iArr, 2130968806, 2132018470, new int[0]);
        fVar.f1 = f.hasValue(37);
        Context context4 = fVar.F0;
        ColorStateList W = i4.W(context4, f, 24);
        if (fVar.Y != W) {
            fVar.Y = W;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList W2 = i4.W(context4, f, 11);
        if (fVar.Z != W2) {
            fVar.Z = W2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = f.getDimension(19, 0.0f);
        if (fVar.a0 != dimension) {
            fVar.a0 = dimension;
            fVar.invalidateSelf();
            fVar.F();
        }
        if (f.hasValue(12)) {
            fVar.L(f.getDimension(12, 0.0f));
        }
        fVar.Q(i4.W(context4, f, 22));
        fVar.R(f.getDimension(23, 0.0f));
        fVar.b0(i4.W(context4, f, 36));
        String text = f.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(fVar.f0, text);
        m mVar = fVar.L0;
        if (!equals) {
            fVar.f0 = text;
            mVar.e = true;
            fVar.invalidateSelf();
            fVar.F();
        }
        r31.d dVar = (!f.hasValue(0) || (resourceId3 = f.getResourceId(0, 0)) == 0) ? null : new r31.d(context4, resourceId3);
        dVar.l = f.getDimension(1, dVar.l);
        mVar.b(dVar, context4);
        int i = f.getInt(3, 0);
        if (i == 1) {
            fVar.c1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.c1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.c1 = TextUtils.TruncateAt.END;
        }
        fVar.P(f.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.P(f.getBoolean(15, false));
        }
        fVar.M(i4.Y(context4, f, 14));
        if (f.hasValue(17)) {
            fVar.O(i4.W(context4, f, 17));
        }
        fVar.N(f.getDimension(16, -1.0f));
        fVar.Y(f.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.Y(f.getBoolean(26, false));
        }
        fVar.S(i4.Y(context4, f, 25));
        fVar.X(i4.W(context4, f, 30));
        fVar.U(f.getDimension(28, 0.0f));
        fVar.H(f.getBoolean(6, false));
        fVar.K(f.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.K(f.getBoolean(8, false));
        }
        fVar.I(i4.Y(context4, f, 7));
        if (f.hasValue(9)) {
            fVar.J(i4.W(context4, f, 9));
        }
        fVar.v0 = (!f.hasValue(39) || (resourceId2 = f.getResourceId(39, 0)) == 0) ? null : y21.b.a(context4, resourceId2);
        fVar.w0 = (!f.hasValue(33) || (resourceId = f.getResourceId(33, 0)) == 0) ? null : y21.b.a(context4, resourceId);
        float dimension2 = f.getDimension(21, 0.0f);
        if (fVar.x0 != dimension2) {
            fVar.x0 = dimension2;
            fVar.invalidateSelf();
            fVar.F();
        }
        fVar.a0(f.getDimension(35, 0.0f));
        fVar.Z(f.getDimension(34, 0.0f));
        float dimension3 = f.getDimension(41, 0.0f);
        if (fVar.A0 != dimension3) {
            fVar.A0 = dimension3;
            fVar.invalidateSelf();
            fVar.F();
        }
        float dimension4 = f.getDimension(40, 0.0f);
        if (fVar.B0 != dimension4) {
            fVar.B0 = dimension4;
            fVar.invalidateSelf();
            fVar.F();
        }
        fVar.V(f.getDimension(29, 0.0f));
        fVar.T(f.getDimension(27, 0.0f));
        float dimension5 = f.getDimension(13, 0.0f);
        if (fVar.E0 != dimension5) {
            fVar.E0 = dimension5;
            fVar.invalidateSelf();
            fVar.F();
        }
        fVar.e1 = f.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f.recycle();
        o.a(context2, attributeSet, 2130968806, 2132018470);
        o.b(context2, attributeSet, iArr, 2130968806, 2132018470, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130968806, 2132018470);
        this.F = obtainStyledAttributes.getBoolean(32, false);
        TypedValue c0 = b4.c0(context2, 2130969520);
        this.H = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) ((c0 == null || c0.type != 5) ? context2.getResources().getDimension(2131166185) : c0.getDimension(context2.getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.p(getElevation());
        o.a(context2, attributeSet, 2130968806, 2132018470);
        o.b(context2, attributeSet, iArr, 2130968806, 2132018470, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, 2130968806, 2132018470);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.J = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.B);
        setText(fVar.f0);
        setEllipsize(fVar.c1);
        g();
        if (!this.v.d1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.F) {
            setMinHeight(this.H);
        }
        this.G = getLayoutDirection();
        super/*android.widget.CompoundButton*/.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: i31.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = Chip.this;
                kk.a aVar = chip.A;
                if (aVar != null) {
                    o31.a aVar2 = (o31.a) aVar.s;
                    if (!z ? aVar2.e(chip, aVar2.b) : aVar2.a(chip)) {
                        aVar2.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.z;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.M;
        rectF.setEmpty();
        if (c() && this.y != null) {
            f fVar = this.v;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.e0()) {
                float f = fVar.E0 + fVar.D0 + fVar.p0 + fVar.C0 + fVar.B0;
                if (fVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.L;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private r31.d getTextAppearance() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.L0.g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCloseIconHovered(boolean z) {
        if (this.D != z) {
            this.D = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCloseIconPressed(boolean z) {
        if (this.C != z) {
            this.C = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        this.H = i;
        if (!this.F) {
            InsetDrawable insetDrawable = this.w;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.w = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.v.a0));
        int max2 = Math.max(0, i - this.v.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.w;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.w = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.w != null) {
            Rect rect = new Rect();
            this.w.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.w = new InsetDrawable((Drawable) this.v, i2, i3, i2, i3);
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        f fVar = this.v;
        if (fVar == null) {
            return false;
        }
        s4.a aVar = fVar.m0;
        if (aVar != null) {
            if (aVar instanceof s4.a) {
            }
            return aVar == null;
        }
        aVar = null;
        if (aVar == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        f fVar;
        if (!c() || (fVar = this.v) == null || !fVar.l0 || this.y == null) {
            c1.p(this, (a5.b) null);
            this.K = false;
        } else {
            c1.p(this, this.J);
            this.K = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.K) {
            return super/*android.view.View*/.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.J;
        AccessibilityManager accessibilityManager = ((j5.b) dVar).y;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = dVar.H;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = ((j5.b) dVar).D;
                if (i3 != i2) {
                    ((j5.b) dVar).D = i2;
                    dVar.r(i2, 128);
                    dVar.r(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = ((j5.b) dVar).D) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    ((j5.b) dVar).D = Integer.MIN_VALUE;
                    dVar.r(Integer.MIN_VALUE, 128);
                    dVar.r(i, 256);
                    return true;
                }
            }
        }
        return super/*android.view.View*/.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, com.google.android.material.chip.Chip] */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.K) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.J;
        dVar.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && dVar.m(i2, (Rect) null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = ((j5.b) dVar).C;
                    if (i3 != Integer.MIN_VALUE) {
                        com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) (dVar.H);
                        if (i3 == 0) {
                            r5.performClick();
                        } else if (i3 == 1) {
                            r5.playSoundEffect(0);
                            View.OnClickListener onClickListener = r5.y;
                            if (onClickListener != 0) {
                                onClickListener.onClick(r5);
                            }
                            if (r5.K) {
                                r5.J.r(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = dVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                z = dVar.m(1, (Rect) null);
            }
        }
        if (!z || ((j5.b) dVar).C == Integer.MIN_VALUE) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.v;
        boolean z = false;
        int i = 0;
        z = false;
        if (fVar != null && f.E(fVar.m0)) {
            f fVar2 = this.v;
            Object isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.E) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.D) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.C) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.E) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.D) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.C) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = fVar2.W(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        this.x = new RippleDrawable(s31.a.b(this.v.e0), getBackgroundDrawable(), null);
        this.v.getClass();
        setBackground(this.x);
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.v) == null) {
            return;
        }
        int B = (int) (fVar.B() + fVar.E0 + fVar.B0);
        f fVar2 = this.v;
        int A = (int) (fVar2.A() + fVar2.x0 + fVar2.A0);
        if (this.w != null) {
            Rect rect = new Rect();
            this.w.getPadding(rect);
            A += rect.left;
            B += rect.right;
        }
        setPaddingRelative(A, getPaddingTop(), B, getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.v;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        r31.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.N);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.I)) {
            return this.I;
        }
        f fVar = this.v;
        if (fVar == null || !fVar.r0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).y.a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.w;
        return insetDrawable == null ? this.v : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.t0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.u0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.Z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.v;
        if (fVar != null) {
            return Math.max(0.0f, fVar.C());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.v;
    }

    public float getChipEndPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.E0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        s4.a aVar;
        f fVar = this.v;
        if (fVar == null || (aVar = fVar.h0) == null || (aVar instanceof s4.a)) {
            return null;
        }
        return aVar;
    }

    public float getChipIconSize() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.j0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.i0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.a0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.x0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.c0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        s4.a aVar;
        f fVar = this.v;
        if (fVar == null || (aVar = fVar.m0) == null || (aVar instanceof s4.a)) {
            return null;
        }
        return aVar;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.q0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.D0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.p0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.C0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.o0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.c1;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getFocusedRect(Rect rect) {
        if (this.K) {
            d dVar = this.J;
            if (((j5.b) dVar).C == 1 || ((j5.b) dVar).B == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super/*android.view.View*/.getFocusedRect(rect);
    }

    public y21.b getHideMotionSpec() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.w0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.z0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.y0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.e0;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        return this.v.s.a;
    }

    public y21.b getShowMotionSpec() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.v0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.B0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.v;
        if (fVar != null) {
            return fVar.A0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        w.u(this, this.v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, P);
        }
        f fVar = this.v;
        if (fVar != null && fVar.r0) {
            View.mergeDrawableStates(onCreateDrawableState, Q);
        }
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super/*android.view.View*/.onFocusChanged(z, i, rect);
        if (this.K) {
            d dVar = this.J;
            int i2 = ((j5.b) dVar).C;
            if (i2 != Integer.MIN_VALUE) {
                dVar.j(i2);
            }
            if (z) {
                dVar.m(i, rect);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super/*android.view.View*/.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.v;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.r0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.t) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    Object childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(2131363275);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b5.e.b(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super/*android.view.View*/.onResolvePointerIcon(motionEvent, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRtlPropertiesChanged(int i) {
        super/*android.view.View*/.onRtlPropertiesChanged(i);
        if (this.G != i) {
            this.G = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.C) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.C) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.y;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.K) {
                    this.J.r(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.I = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.x) {
            super/*android.view.View*/.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.x) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.H(z);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.H(fVar.F0.getResources().getBoolean(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        f fVar = this.v;
        if (fVar == null) {
            this.B = z;
        } else if (fVar.r0) {
            super/*android.widget.CompoundButton*/.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.I(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.I(s.o(fVar.F0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.J(o4.b.c(fVar.F0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.K(fVar.F0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.v;
        if (fVar == null || fVar.Z == colorStateList) {
            return;
        }
        fVar.Z = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList c;
        f fVar = this.v;
        if (fVar == null || fVar.Z == (c = o4.b.c(fVar.F0, i))) {
            return;
        }
        fVar.Z = c;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.L(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.L(fVar.F0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.v;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.b1 = new WeakReference(null);
            }
            this.v = fVar;
            fVar.d1 = false;
            fVar.b1 = new WeakReference(this);
            b(this.H);
        }
    }

    public void setChipEndPadding(float f) {
        f fVar = this.v;
        if (fVar == null || fVar.E0 == f) {
            return;
        }
        fVar.E0 = f;
        fVar.invalidateSelf();
        fVar.F();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            float dimension = fVar.F0.getResources().getDimension(i);
            if (fVar.E0 != dimension) {
                fVar.E0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.M(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.M(s.o(fVar.F0, i));
        }
    }

    public void setChipIconSize(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.N(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.N(fVar.F0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.O(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.O(o4.b.c(fVar.F0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.P(fVar.F0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        f fVar = this.v;
        if (fVar == null || fVar.a0 == f) {
            return;
        }
        fVar.a0 = f;
        fVar.invalidateSelf();
        fVar.F();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            float dimension = fVar.F0.getResources().getDimension(i);
            if (fVar.a0 != dimension) {
                fVar.a0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setChipStartPadding(float f) {
        f fVar = this.v;
        if (fVar == null || fVar.x0 == f) {
            return;
        }
        fVar.x0 = f;
        fVar.invalidateSelf();
        fVar.F();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            float dimension = fVar.F0.getResources().getDimension(i);
            if (fVar.x0 != dimension) {
                fVar.x0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.Q(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.Q(o4.b.c(fVar.F0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.R(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.R(fVar.F0.getResources().getDimension(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.S(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.v;
        if (fVar == null || fVar.q0 == charSequence) {
            return;
        }
        String str = y4.b.b;
        y4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? y4.b.e : y4.b.d;
        bVar.getClass();
        n4 n4Var = y4.f.a;
        fVar.q0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.T(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.T(fVar.F0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.S(s.o(fVar.F0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.U(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.U(fVar.F0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.V(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.V(fVar.F0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.X(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.X(o4.b.c(fVar.F0, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super/*android.widget.TextView*/.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super/*android.widget.TextView*/.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        f fVar = this.v;
        if (fVar != null) {
            fVar.p(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.v == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super/*android.widget.TextView*/.setEllipsize(truncateAt);
        f fVar = this.v;
        if (fVar != null) {
            fVar.c1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.F = z;
        b(this.H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super/*android.widget.TextView*/.setGravity(i);
    }

    public void setHideMotionSpec(y21.b bVar) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.w0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.w0 = y21.b.a(fVar.F0, i);
        }
    }

    public void setIconEndPadding(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.Z(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.Z(fVar.F0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.a0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.a0(fVar.F0.getResources().getDimension(i));
        }
    }

    @Override // o31.i
    public void setInternalOnCheckedChangeListener(h hVar) {
        this.A = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLayoutDirection(int i) {
        if (this.v == null) {
            return;
        }
        super/*android.view.View*/.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.TextView*/.setLines(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.TextView*/.setMaxLines(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxWidth(int i) {
        super/*android.widget.TextView*/.setMaxWidth(i);
        f fVar = this.v;
        if (fVar != null) {
            fVar.e1 = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.TextView*/.setMinLines(i);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.z = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.y = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.b0(colorStateList);
        }
        this.v.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.b0(o4.b.c(fVar.F0, i));
            this.v.getClass();
            e();
        }
    }

    @Override // u31.y
    public void setShapeAppearanceModel(n nVar) {
        this.v.setShapeAppearanceModel(nVar);
    }

    public void setShowMotionSpec(y21.b bVar) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.v0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.v0 = y21.b.a(fVar.F0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.TextView*/.setSingleLine(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.v;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super/*android.widget.TextView*/.setText(fVar.d1 ? null : charSequence, bufferType);
        f fVar2 = this.v;
        if (fVar2 == null || TextUtils.equals(fVar2.f0, charSequence)) {
            return;
        }
        fVar2.f0 = charSequence;
        fVar2.L0.e = true;
        fVar2.invalidateSelf();
        fVar2.F();
    }

    public void setTextAppearance(r31.d dVar) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.L0.b(dVar, fVar.F0);
        }
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        f fVar = this.v;
        if (fVar == null || fVar.B0 == f) {
            return;
        }
        fVar.B0 = f;
        fVar.invalidateSelf();
        fVar.F();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            float dimension = fVar.F0.getResources().getDimension(i);
            if (fVar.B0 != dimension) {
                fVar.B0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextSize(int i, float f) {
        super/*android.widget.TextView*/.setTextSize(i, f);
        f fVar = this.v;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            m mVar = fVar.L0;
            r31.d dVar = mVar.g;
            if (dVar != null) {
                dVar.l = applyDimension;
                mVar.a.setTextSize(applyDimension);
                fVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        f fVar = this.v;
        if (fVar == null || fVar.A0 == f) {
            return;
        }
        fVar.A0 = f;
        fVar.invalidateSelf();
        fVar.F();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.v;
        if (fVar != null) {
            float dimension = fVar.F0.getResources().getDimension(i);
            if (fVar.A0 != dimension) {
                fVar.A0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.Y(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.K(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        f fVar = this.v;
        if (fVar != null) {
            fVar.P(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super/*android.widget.TextView*/.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super/*android.widget.TextView*/.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextAppearance(Context context, int i) {
        super/*android.widget.TextView*/.setTextAppearance(context, i);
        f fVar = this.v;
        if (fVar != null) {
            Context context2 = fVar.F0;
            fVar.L0.b(new r31.d(context2, i), context2);
        }
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(int i) {
        super/*android.widget.TextView*/.setTextAppearance(i);
        f fVar = this.v;
        if (fVar != null) {
            Context context = fVar.F0;
            fVar.L0.b(new r31.d(context, i), context);
        }
        g();
    }

    public static Object getElevation(Object... a) {
        return null;
    }

    public static Object setOutlineProvider(Object... a) {
        return null;
    }

    public static Object setHorizontallyScrolling(Object... a) {
        return null;
    }

    public static Object setMinHeight(Object... a) {
        return null;
    }

    public static Object getLayoutDirection(Object... a) {
        return null;
    }

    public static Object refreshDrawableState(Object... a) {
        return null;
    }

    public static Object setMinWidth(Object... a) {
        return null;
    }

    public static Object getMinHeight(Object... a) {
        return null;
    }

    public static Object getMinWidth(Object... a) {
        return null;
    }

    public static Object performClick(Object... a) {
        return null;
    }

    public static Object playSoundEffect(Object... a) {
        return null;
    }

    public static Object getText(Object... a) {
        return null;
    }

    public static Object isClickable(Object... a) {
        return null;
    }

    public static Object isEnabled(Object... a) {
        return null;
    }

    public static Object getResources(Object... a) {
        return null;
    }

    public static Object getContext(Object... a) {
        return null;
    }

    public static Object setOnClickListener(Object... a) {
        return null;
    }

    public static Object setTag(Object... a) {
        return null;
    }

    public static Object setOnTouchListener(Object... a) {
        return null;
    }

    public static Object sendAccessibilityEvent(Object... a) {
        return null;
    }

    public static Object requestLayout(Object... a) {
        return null;
    }

    public static Object invalidate(Object... a) {
        return null;
    }

    public static Object invalidateOutline(Object... a) {
        return null;
    }
}
