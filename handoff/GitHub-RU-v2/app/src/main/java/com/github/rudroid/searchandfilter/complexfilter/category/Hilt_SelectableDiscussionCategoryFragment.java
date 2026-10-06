package com.github.rudroid.searchandfilter.complexfilter.category;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_SelectableDiscussionCategoryFragment<T> extends SearchAndFilterBaseFragment<T> {
    public m61.j E0;
    public boolean F0 = false;
    public boolean G0 = false;

    public final void J4() {
        if (this.E0 == null) {
            this.E0 = new m61.j(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3(), this);
            this.F0 = b4.V(super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3());
        }
    }

    public final void N3(Activity activity) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.N3(activity);
        m61.j jVar = this.E0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        J4();
        t4();
    }

    public final void O3(Context context) {
        super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.O3(context);
        J4();
        t4();
    }

    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    public final void t4() {
        if (this.G0) {
            return;
        }
        this.G0 = true;
        ((f) w()).V2((SelectableDiscussionCategoryFragment) this);
    }

    public final Context y3() {
        if (super/*com.github.rudroid.fragments.Hilt_GitHubFragment*/.y3() == null && !this.F0) {
            return null;
        }
        J4();
        return this.E0;
    }

    public static Object w(Object... a) {
        return null;
    }
}
