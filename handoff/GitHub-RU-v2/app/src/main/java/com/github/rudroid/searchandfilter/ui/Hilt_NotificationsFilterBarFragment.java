package com.github.rudroid.searchandfilter.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_NotificationsFilterBarFragment extends FilterBarFragmentGlobalScope {
    public m61.j L0;
    public boolean M0 = false;
    public boolean N0 = false;

    public final void K4() {
        if (this.L0 == null) {
            this.L0 = new m61.j(super.y3(), this);
            this.M0 = b4.V(super.y3());
        }
    }

    @Override // com.github.rudroid.searchandfilter.ui.Hilt_FilterBarFragmentGlobalScope
    public final void N3(Activity activity) {
        super.N3(activity);
        m61.j jVar = this.L0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        K4();
        t4();
    }

    @Override // com.github.rudroid.searchandfilter.ui.Hilt_FilterBarFragmentGlobalScope
    public final void O3(Context context) {
        super.O3(context);
        K4();
        t4();
    }

    @Override // com.github.rudroid.searchandfilter.ui.Hilt_FilterBarFragmentGlobalScope
    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    @Override // com.github.rudroid.searchandfilter.ui.Hilt_FilterBarFragmentGlobalScope
    public final void t4() {
        if (this.N0) {
            return;
        }
        this.N0 = true;
        ((f0) w()).y1((NotificationsFilterBarFragment) this);
    }

    @Override // com.github.rudroid.searchandfilter.ui.Hilt_FilterBarFragmentGlobalScope
    public final Context y3() {
        if (super.y3() == null && !this.M0) {
            return null;
        }
        K4();
        return this.L0;
    }

    public static Object w(Object... a) {
        return null;
    }
}
