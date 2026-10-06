package com.google.android.material.internal;

import a5.c1;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.f;
import o31.g;
import p.n;
import p.y;
import q.j3;
import q.s1;
import q4.l;

/* loaded from: /home/user/work/p/classes4.dex */
public class NavigationMenuItemView extends g implements y {
    public static final int[] a0 = {R.attr.state_checked};
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public CheckedTextView Q;
    public FrameLayout R;
    public n S;
    public ColorStateList T;
    public boolean U;
    public Drawable V;
    public f W;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = true;
        f fVar = new f(6, this);
        this.W = fVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131558772, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131165352));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131362223);
        this.Q = checkedTextView;
        c1.p(checkedTextView, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setActionView(View view) {
        if (view != null) {
            if (this.R == null) {
                this.R = (FrameLayout) ((ViewStub) findViewById(2131362222)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.R.removeAllViews();
            this.R.addView(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(n nVar) {
        StateListDrawable stateListDrawable;
        this.S = nVar;
        int i = nVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130968854, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(a0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.q);
        j3.a(this, nVar.r);
        n nVar2 = this.S;
        CharSequence charSequence = nVar2.e;
        CheckedTextView checkedTextView = this.Q;
        if (charSequence == null && nVar2.getIcon() == null && this.S.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.R;
            if (frameLayout != null) {
                s1 layoutParams = frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.R.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.R;
        if (frameLayout2 != null) {
            s1 layoutParams2 = frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.R.setLayoutParams(layoutParams2);
        }
    }

    public n getItemData() {
        return this.S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 1);
        n nVar = this.S;
        if (nVar != null && nVar.isCheckable() && this.S.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, a0);
        }
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.O != z) {
            this.O = z;
            this.W.h(this.Q, 2048);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.Q;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.P) ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.U) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.T);
            }
            int i = this.M;
            drawable.setBounds(0, 0, i, i);
        } else if (this.N) {
            if (this.V == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.a;
                Drawable drawable2 = resources.getDrawable(2131231603, theme);
                this.V = drawable2;
                if (drawable2 != null) {
                    int i2 = this.M;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.V;
        }
        this.Q.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.Q.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.M = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.T = colorStateList;
        this.U = colorStateList != null;
        n nVar = this.S;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.Q.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.N = z;
    }

    public void setTextAppearance(int i) {
        this.Q.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.Q.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.Q.setText(charSequence);
    }


    public static Object setOrientation(Object... a) {
        return null;
    }

    public static Object findViewById(Object... a) {
        return null;
    }

    public static Object setId(Object... a) {
        return null;
    }

    public static Object setVisibility(Object... a) {
        return null;
    }

    public static Object getBackground(Object... a) {
        return null;
    }

    public static Object getContext(Object... a) {
        return null;
    }

    public static Object setBackground(Object... a) {
        return null;
    }

    public static Object setEnabled(Object... a) {
        return null;
    }

    public static Object getPaddingTop(Object... a) {
        return null;
    }

    public static Object getPaddingBottom(Object... a) {
        return null;
    }

    public static Object getResources(Object... a) {
        return null;
    }
    public Object setContentDescription(Object p1) { return null; }
    public Object setPadding(int p1, Object p2, int p3, Object p4) { return null; }
}
