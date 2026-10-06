package com.github.rudroid.support;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.github.rudroid.fragments.BindingFragment;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import k5.f;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_SupportFragment<T extends k5.f> extends BindingFragment {
    public m61.j B0;
    public boolean C0 = false;
    public boolean D0 = false;

    public final void H4() {
        if (this.B0 == null) {
            this.B0 = new m61.j(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3(), this);
            this.C0 = b4.V(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3());
        }
    }

    public final void N3(Activity activity) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.N3(activity);
        m61.j jVar = this.B0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        H4();
        t4();
    }

    public final void O3(Context context) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.O3(context);
        H4();
        t4();
    }

    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    public final void t4() {
        if (this.D0) {
            return;
        }
        this.D0 = true;
        ((l) w()).I2((SupportFragment) this);
    }

    public final Context y3() {
        if (super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3() == null && !this.C0) {
            return null;
        }
        H4();
        return this.B0;
    }

    public <T0> T0 w(Object... a) {
        return null;
    }

    public <T0> T0 M3(Object... a) {
        return null;
    }
    public Object M3(Object p1, Object p2, Object p3) { return null; }
}
