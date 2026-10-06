package com.github.rudroid.settings.applock;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.github.rudroid.fragments.GitHubFragment;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_AppLockFragment extends GitHubFragment {
    public m61.j A0;
    public boolean B0 = false;
    public boolean C0 = false;

    public final void B4() {
        if (this.A0 == null) {
            this.A0 = new m61.j(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3(), this);
            this.B0 = b4.V(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3());
        }
    }

    public final void N3(Activity activity) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.N3(activity);
        m61.j jVar = this.A0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        B4();
        t4();
    }

    public final void O3(Context context) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.O3(context);
        B4();
        t4();
    }

    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    public final void t4() {
        if (this.C0) {
            return;
        }
        this.C0 = true;
        ((r) w()).z2((AppLockFragment) this);
    }

    public final Context y3() {
        if (super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3() == null && !this.B0) {
            return null;
        }
        B4();
        return this.A0;
    }

    public <T0> T0 w(Object... a) {
        return null;
    }
}
