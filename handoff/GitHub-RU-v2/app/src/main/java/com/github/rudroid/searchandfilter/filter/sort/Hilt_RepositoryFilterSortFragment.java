package com.github.rudroid.searchandfilter.filter.sort;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.github.rudroid.fragments.BindingFragment;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import k5.f;
import m61.j;
import wf.q;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_RepositoryFilterSortFragment<T extends f> extends BindingFragment<T> {
    public j B0;
    public boolean C0 = false;
    public boolean D0 = false;

    public final void H4() {
        if (this.B0 == null) {
            this.B0 = new j(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3(), this);
            this.C0 = b4.V(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3());
        }
    }

    public final void N3(Activity activity) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.N3(activity);
        j jVar = this.B0;
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
        return V3.cloneInContext(new j(V3, this));
    }

    public final void t4() {
        if (this.D0) {
            return;
        }
        this.D0 = true;
        ((q) w()).i1((RepositoryFilterSortFragment) this);
    }

    public final Context y3() {
        if (super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3() == null && !this.C0) {
            return null;
        }
        H4();
        return this.B0;
    }
}
