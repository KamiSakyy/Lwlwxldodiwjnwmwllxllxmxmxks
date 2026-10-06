package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import m31.a;
import o31.o;

/* loaded from: /home/user/work/p/classes4.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] r0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final a n0;
    public ColorStateList o0;
    public ColorStateList p0;
    public boolean q0;

    /* JADX WARN: Multi-variable type inference failed */
    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130969850, 2132018482), attributeSet, 0);
        Context context2 = getContext();
        this.n0 = new a(context2);
        o.a(context2, attributeSet, 2130969850, 2132018482);
        int[] iArr = x21.a.L;
        o.b(context2, attributeSet, iArr, 2130969850, 2132018482, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130969850, 2132018482);
        this.q0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.o0 == null) {
            int n = a.a.n(this, 2130968896);
            int n2 = a.a.n(this, 2130968853);
            float dimension = getResources().getDimension(2131166238);
            a aVar = this.n0;
            if (aVar.a) {
                float f = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    f += ((View) parent).getElevation();
                }
                dimension += f;
            }
            int a = aVar.a(n, dimension);
            this.o0 = new ColorStateList(r0, new int[]{a.a.q(n, 1.0f, n2), a, a.a.q(n, 0.38f, n2), a});
        }
        return this.o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.p0 == null) {
            int n = a.a.n(this, 2130968896);
            int n2 = a.a.n(this, 2130968853);
            int n3 = a.a.n(this, 2130968873);
            this.p0 = new ColorStateList(r0, new int[]{a.a.q(n, 0.54f, n2), a.a.q(n, 0.32f, n3), a.a.q(n, 0.12f, n2), a.a.q(n, 0.12f, n3)});
        }
        return this.p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (this.q0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.q0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.q0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList((ColorStateList) null);
            setTrackTintList((ColorStateList) null);
        }
    }

    public <T0> T0 setOnCheckedChangeListener(Object... a) {
        return null;
    }

    public <T0> T0 getResources(Object... a) {
        return null;
    }

    public <T0> T0 getParent(Object... a) {
        return null;
    }

    public <T0> T0 getThumbTintList(Object... a) {
        return null;
    }

    public <T0> T0 setThumbTintList(Object... a) {
        return null;
    }

    public <T0> T0 getTrackTintList(Object... a) {
        return null;
    }

    public <T0> T0 setTrackTintList(Object... a) {
        return null;
    }

    public <T0> T0 setChecked(Object... a) {
        return null;
    }
}
