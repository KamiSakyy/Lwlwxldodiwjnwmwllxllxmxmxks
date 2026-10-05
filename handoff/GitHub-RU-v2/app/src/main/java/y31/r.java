package y31;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import q.i0;
import q.y1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r extends q.n {
    public ColorStateList A;
    public int B;
    public ColorStateList C;
    public final y1 v;
    public final AccessibilityManager w;
    public final Rect x;
    public final int y;
    public final float z;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130968650, 0), attributeSet);
        this.x = new Rect();
        Context context2 = getContext();
        TypedArray f = o31.o.f(context2, attributeSet, x21.a.p, 2130968650, 2132018158, new int[0]);
        if (f.hasValue(0) && f.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.y = f.getResourceId(3, 2131559315);
        this.z = f.getDimensionPixelOffset(1, 2131166154);
        if (f.hasValue(2)) {
            this.A = ColorStateList.valueOf(f.getColor(2, 0));
        }
        this.B = f.getColor(4, 0);
        this.C = i4.W(context2, f, 5);
        this.w = (AccessibilityManager) context2.getSystemService("accessibility");
        y1 y1Var = new y1(context2, (AttributeSet) null, 2130969423, 0);
        this.v = y1Var;
        y1Var.P = true;
        y1Var.Q.setFocusable(true);
        y1Var.F = this;
        y1Var.Q.setInputMethodMode(2);
        y1Var.p(getAdapter());
        y1Var.G = new i0(2, this);
        if (f.hasValue(6)) {
            setSimpleItems(f.getResourceId(6, 0));
        }
        f.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.w;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dismissDropDown() {
        if (c()) {
            this.v.dismiss();
        } else {
            super/*android.widget.AutoCompleteTextView*/.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.W) ? super/*android.widget.TextView*/.getHint() : b.getHint();
    }

    public float getPopupElevation() {
        return this.z;
    }

    public int getSimpleItemSelectedColor() {
        return this.B;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.W && super/*android.widget.TextView*/.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.v.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i3 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                y1 y1Var = this.v;
                int min = Math.min(adapter.getCount(), Math.max(0, !y1Var.Q.isShowing() ? -1 : y1Var.t.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = y1Var.Q.getBackground();
                if (background != null) {
                    Rect rect = this.x;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super/*android.view.View*/.onWindowFocusChanged(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super/*android.widget.AutoCompleteTextView*/.setAdapter(t);
        this.v.p(getAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super/*android.widget.AutoCompleteTextView*/.setDropDownBackgroundDrawable(drawable);
        y1 y1Var = this.v;
        if (y1Var != null) {
            y1Var.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.A = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof u31.j) {
            ((u31.j) dropDownBackground).q(this.A);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super/*android.widget.AutoCompleteTextView*/.setOnItemSelectedListener(onItemSelectedListener);
        this.v.H = getOnItemSelectedListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRawInputType(int i) {
        super/*android.widget.TextView*/.setRawInputType(i);
        TextInputLayout b = b();
        if (b != null) {
            b.u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItemSelectedColor(int i) {
        this.B = i;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showDropDown() {
        if (c()) {
            this.v.g();
        } else {
            super/*android.widget.AutoCompleteTextView*/.showDropDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItems(String[] strArr) {
        setAdapter(new q(this, getContext(), this.y, strArr));
    }
}
