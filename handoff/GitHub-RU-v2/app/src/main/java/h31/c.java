package h31;

import a5.k1;
import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import e8.d;
import e8.e;
import e8.f;
import e8.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jo.f4;
import l51.h;
import o31.o;
import q.p;
import q4.l;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends p {
    public static final int[] P = {2130969814};
    public static final int[] Q = {2130969813};
    public static final int[][] R = {new int[]{R.attr.state_enabled, 2130969813}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int S = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A;
    public CharSequence B;
    public Drawable C;
    public Drawable D;
    public boolean E;
    public ColorStateList F;
    public ColorStateList G;
    public PorterDuff.Mode H;
    public int I;
    public int[] J;
    public boolean K;
    public CharSequence L;
    public CompoundButton.OnCheckedChangeListener M;
    public final f N;
    public final a O;
    public final LinkedHashSet v;
    public final LinkedHashSet w;
    public ColorStateList x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130968776, 2132018480), attributeSet, 2130968776);
        this.v = new LinkedHashSet();
        this.w = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = l.a;
        Drawable drawable = resources.getDrawable(2131231568, theme);
        ((g) fVar).r = drawable;
        drawable.setCallback(fVar.w);
        new e(((g) fVar).r.getConstantState());
        this.N = fVar;
        this.O = new a(this);
        Context context3 = getContext();
        this.C = getButtonDrawable();
        this.F = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        o.a(context3, attributeSet, 2130968776, 2132018480);
        int[] iArr = x21.a.w;
        o.b(context3, attributeSet, iArr, 2130968776, 2132018480, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, 2130968776, 2132018480);
        h hVar = new h(context3, obtainStyledAttributes);
        this.D = hVar.s(2);
        if (this.C != null && b4.d0(2130969285, context3, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == S && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.C = s.o(context3, 2131231567);
                this.E = true;
                if (this.D == null) {
                    this.D = s.o(context3, 2131231569);
                }
            }
        }
        this.G = i4.X(context3, hVar, 3);
        this.H = o.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.y = obtainStyledAttributes.getBoolean(10, false);
        this.z = obtainStyledAttributes.getBoolean(6, true);
        this.A = obtainStyledAttributes.getBoolean(9, false);
        this.B = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        hVar.G();
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String getButtonStateDescription() {
        int i = this.I;
        return i == 1 ? getResources().getString(2131953259) : i == 0 ? getResources().getString(2131953261) : getResources().getString(2131953260);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.x == null) {
            int n = a.a.n(this, 2130968853);
            int n2 = a.a.n(this, 2130968856);
            int n3 = a.a.n(this, 2130968896);
            int n4 = a.a.n(this, 2130968873);
            this.x = new ColorStateList(R, new int[]{a.a.q(n3, 1.0f, n2), a.a.q(n3, 1.0f, n), a.a.q(n3, 0.54f, n4), a.a.q(n3, 0.38f, n4), a.a.q(n3, 0.38f, n4)});
        }
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.F;
        return colorStateList != null ? colorStateList : super/*android.widget.CompoundButton*/.getButtonTintList() != null ? super/*android.widget.CompoundButton*/.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.C;
        ColorStateList colorStateList3 = this.F;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.C = drawable;
        Drawable drawable2 = this.D;
        ColorStateList colorStateList4 = this.G;
        PorterDuff.Mode mode = this.H;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.D = drawable2;
        if (this.E) {
            f fVar = this.N;
            if (fVar != null) {
                d dVar = fVar.s;
                Drawable drawable3 = ((g) fVar).r;
                a aVar = this.O;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.a == null) {
                        aVar.a = new e8.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.a);
                }
                ArrayList arrayList = fVar.v;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.v.size() == 0 && (animatorListener = fVar.u) != null) {
                        dVar.b.removeListener(animatorListener);
                        fVar.u = null;
                    }
                }
                Drawable drawable4 = ((g) fVar).r;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.a == null) {
                        aVar.a = new e8.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.a);
                } else if (aVar != null) {
                    if (fVar.v == null) {
                        fVar.v = new ArrayList();
                    }
                    if (!fVar.v.contains(aVar)) {
                        fVar.v.add(aVar);
                        if (fVar.u == null) {
                            fVar.u = new k1(5, fVar);
                        }
                        dVar.b.addListener(fVar.u);
                    }
                }
            }
            Drawable drawable5 = this.C;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(2131362004, 2131363476, fVar, false);
                ((AnimatedStateListDrawable) this.C).addTransition(2131362916, 2131363476, fVar, false);
            }
        }
        Drawable drawable6 = this.C;
        if (drawable6 != null && (colorStateList2 = this.F) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.D;
        if (drawable7 != null && (colorStateList = this.G) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.C;
        Drawable drawable9 = this.D;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.C;
    }

    public Drawable getButtonIconDrawable() {
        return this.D;
    }

    public ColorStateList getButtonIconTintList() {
        return this.G;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.H;
    }

    public ColorStateList getButtonTintList() {
        return this.F;
    }

    public int getCheckedState() {
        return this.I;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.B;
    }

    public final boolean isChecked() {
        return this.I == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (this.y && this.F == null && this.G == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, P);
        }
        if (this.A) {
            View.mergeDrawableStates(onCreateDrawableState, Q);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.J = copyOf;
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.z || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super/*android.view.View*/.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super/*android.view.View*/.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.A) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.B));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super/*android.view.View*/.onSaveInstanceState());
        bVar.r = getCheckedState();
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setButtonDrawable(int i) {
        setButtonDrawable(s.o(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.D = drawable;
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(s.o(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.G == colorStateList) {
            return;
        }
        this.G = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.H == mode) {
            return;
        }
        this.H = mode;
        a();
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.F == colorStateList) {
            return;
        }
        this.F = colorStateList;
        a();
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.z = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.I != i) {
            this.I = i;
            super/*android.widget.CompoundButton*/.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.L == null) {
                super/*android.widget.CheckBox*/.setStateDescription(getButtonStateDescription());
            }
            if (this.K) {
                return;
            }
            this.K = true;
            LinkedHashSet linkedHashSet = this.w;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw f4.g(it);
                }
            }
            if (this.I != 2 && (onCheckedChangeListener = this.M) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.K = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.B = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setErrorShown(boolean z) {
        if (this.A == z) {
            return;
        }
        this.A = z;
        refreshDrawableState();
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw f4.g(it);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.M = onCheckedChangeListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStateDescription(CharSequence charSequence) {
        this.L = charSequence;
        if (charSequence != null) {
            super/*android.widget.CheckBox*/.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super/*android.widget.CheckBox*/.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.y = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.C = drawable;
        this.E = false;
        a();
    }
}
