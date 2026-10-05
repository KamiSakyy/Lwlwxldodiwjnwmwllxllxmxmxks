package com.google.android.material.datepicker;

import a5.c1;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.fragment.app.a0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.internal.x3;
import com.google.android.material.button.MaterialButton;
import l7.j0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public RecyclerView A0;
    public View B0;
    public View C0;
    public View D0;
    public View E0;
    public MaterialButton F0;
    public AccessibilityManager G0;
    public int u0;
    public b v0;
    public m w0;
    public int x0;
    public c y0;
    public RecyclerView z0;

    public final void P3(Bundle bundle) {
        super.P3(bundle);
        if (bundle == null) {
            bundle = ((a0) this).x;
        }
        this.u0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.v0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.w0 = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(y3(), this.u0);
        this.y0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.G0 = (AccessibilityManager) i4().getSystemService("accessibility");
        m mVar = this.v0.r;
        if (MaterialDatePicker.C4(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = 2131559324;
            i2 = 1;
        } else {
            i = 2131559319;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = i4().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166131) + resources.getDimensionPixelOffset(2131166133) + resources.getDimensionPixelSize(2131166132);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166116);
        int i3 = n.u;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(2131166130) * (i3 - 1)) + (resources.getDimensionPixelSize(2131166111) * i3) + resources.getDimensionPixelOffset(2131166108));
        GridView gridView = (GridView) inflate.findViewById(2131363050);
        c1.p(gridView, new g(0));
        int i4 = this.v0.v;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(mVar.u);
        gridView.setEnabled(false);
        this.A0 = inflate.findViewById(2131363053);
        this.A0.setLayoutManager(new h(this, i2, i2));
        this.A0.setTag("MONTHS_VIEW_GROUP_TAG");
        q qVar = new q(contextThemeWrapper, this.v0, new x3(1, this));
        this.A0.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(2131427384);
        RecyclerView findViewById = inflate.findViewById(2131363056);
        this.z0 = findViewById;
        if (findViewById != null) {
            findViewById.setHasFixedSize(true);
            this.z0.setLayoutManager(new GridLayoutManager(integer));
            this.z0.setAdapter(new v(this));
            RecyclerView recyclerView = this.z0;
            i iVar = new i();
            t.c(null);
            t.c(null);
            recyclerView.i(iVar);
        }
        View findViewById2 = inflate.findViewById(2131363041);
        b bVar = qVar.d;
        if (findViewById2 != null) {
            ?? r0 = (MaterialButton) inflate.findViewById(2131363041);
            this.F0 = r0;
            r0.setTag("SELECTOR_TOGGLE_TAG");
            c1.p(this.F0, new androidx.viewpager.widget.f(1, this));
            View findViewById3 = inflate.findViewById(2131363043);
            this.B0 = findViewById3;
            findViewById3.setTag("NAVIGATION_PREV_TAG");
            View findViewById4 = inflate.findViewById(2131363042);
            this.C0 = findViewById4;
            findViewById4.setTag("NAVIGATION_NEXT_TAG");
            this.D0 = inflate.findViewById(2131363056);
            this.E0 = inflate.findViewById(2131363049);
            t4(1);
            this.F0.setText(this.w0.j());
            this.A0.j(new j(this, qVar));
            this.F0.setOnClickListener(new k(0, this));
            this.C0.setOnClickListener(new f(this, qVar, 1));
            this.B0.setOnClickListener(new f(this, qVar, 0));
            u4(bVar.r.o(this.w0));
        }
        if (!MaterialDatePicker.C4(contextThemeWrapper, R.attr.windowFullscreen)) {
            new j0().a(this.A0);
        }
        this.A0.l0(bVar.r.o(this.w0));
        c1.p(this.A0, new g(1));
        return inflate;
    }

    public final void Z3(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.u0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.v0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.w0);
    }

    public final void s4(m mVar) {
        q qVar = (q) this.A0.getAdapter();
        int o = qVar.d.r.o(mVar);
        AccessibilityManager accessibilityManager = this.G0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int o2 = o - qVar.d.r.o(this.w0);
            boolean z = Math.abs(o2) > 3;
            boolean z2 = o2 > 0;
            this.w0 = mVar;
            if (z && z2) {
                this.A0.l0(o - 3);
                this.A0.post(new b21.i(this, o, 1));
            } else if (z) {
                this.A0.l0(o + 3);
                this.A0.post(new b21.i(this, o, 1));
            } else {
                this.A0.post(new b21.i(this, o, 1));
            }
        } else {
            this.w0 = mVar;
            this.A0.l0(o);
        }
        u4(o);
    }

    public final void t4(int i) {
        this.x0 = i;
        if (i == 2) {
            this.z0.getLayoutManager().v0(this.w0.t - ((v) this.z0.getAdapter()).d.v0.r.t);
            this.D0.setVisibility(0);
            this.E0.setVisibility(8);
            this.B0.setVisibility(8);
            this.C0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.D0.setVisibility(8);
            this.E0.setVisibility(0);
            this.B0.setVisibility(0);
            this.C0.setVisibility(0);
            s4(this.w0);
        }
    }

    public final void u4(int i) {
        this.C0.setEnabled(i + 1 < this.A0.getAdapter().k());
        this.B0.setEnabled(i - 1 >= 0);
    }
}
