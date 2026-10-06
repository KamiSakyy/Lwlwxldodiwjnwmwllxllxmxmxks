package com.github.rudroid.searchandfilter.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_FilterBarFragmentGlobalScope extends FilterBarFragmentBase {
    public m61.j I0;
    public boolean J0 = false;
    public boolean K0 = false;

    public final void J4() {
        if (this.I0 == null) {
            this.I0 = new m61.j(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3(), this);
            this.J0 = b4.V(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3());
        }
    }

    public void N3(Activity activity) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.N3(activity);
        m61.j jVar = this.I0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        J4();
        t4();
    }

    public void O3(Context context) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.O3(context);
        J4();
        t4();
    }

    public LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    public void t4() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        ((f) w()).X0((FilterBarFragmentGlobalScope) this);
    }

    public Context y3() {
        if (super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3() == null && !this.J0) {
            return null;
        }
        J4();
        return this.I0;
    }

    public static Object w(Object... a) {
        return null;
    }
}
