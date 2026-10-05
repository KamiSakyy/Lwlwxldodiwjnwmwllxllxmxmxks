package com.github.rudroid.settings.privacy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.a0;
import androidx.lifecycle.o1;
import com.github.rudroid.settings.ToolBarPreferenceFragmentCompat;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_SettingsPrivacyAnalyticsFragment extends ToolBarPreferenceFragmentCompat implements o61.b {
    public m61.j B0;
    public volatile m61.f D0;
    public boolean C0 = false;
    public final Object E0 = new Object();
    public boolean F0 = false;

    public final void N3(Activity activity) {
        ((a0) this).Y = true;
        m61.j jVar = this.B0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        z4();
        if (this.F0) {
            return;
        }
        this.F0 = true;
        ((e) w()).z((SettingsPrivacyAnalyticsFragment) this);
    }

    public final void O3(Context context) {
        super/*androidx.fragment.app.a0*/.O3(context);
        z4();
        if (this.F0) {
            return;
        }
        this.F0 = true;
        ((e) w()).z((SettingsPrivacyAnalyticsFragment) this);
    }

    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super/*androidx.fragment.app.a0*/.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    public final o1 f0() {
        return z3.s(this, super/*androidx.fragment.app.a0*/.f0());
    }

    public final Object w() {
        if (this.D0 == null) {
            synchronized (this.E0) {
                try {
                    if (this.D0 == null) {
                        this.D0 = new m61.f(this);
                    }
                } finally {
                }
            }
        }
        return this.D0.w();
    }

    public final Context y3() {
        if (super/*androidx.fragment.app.a0*/.y3() == null && !this.C0) {
            return null;
        }
        z4();
        return this.B0;
    }

    public final void z4() {
        if (this.B0 == null) {
            this.B0 = new m61.j(super/*androidx.fragment.app.a0*/.y3(), this);
            this.C0 = b4.V(super/*androidx.fragment.app.a0*/.y3());
        }
    }
}
