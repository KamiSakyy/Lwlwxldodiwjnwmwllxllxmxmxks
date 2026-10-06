package com.github.developersettings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.a0;
import androidx.lifecycle.o1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import ii.e;
import m61.f;
import m61.j;
import o61.b;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_DeveloperSettingsFragment extends a0 implements b {
    public j t0;
    public boolean u0;
    public volatile f v0;
    public Object w0;
    public boolean x0;

    public Hilt_DeveloperSettingsFragment() {
        super(2131558789);
        this.u0 = false;
        this.w0 = new Object();
        this.x0 = false;
    }

    public final void N3(Activity activity) {
        ((a0) this).Y = true;
        j jVar = this.t0;
        i4.S(jVar == null || f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s4();
        if (this.x0) {
            return;
        }
        this.x0 = true;
        ((e) w()).getClass();
    }

    public final void O3(Context context) {
        super.O3(context);
        s4();
        if (this.x0) {
            return;
        }
        this.x0 = true;
        ((e) w()).getClass();
    }

    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super.V3(bundle);
        return V3.cloneInContext(new j(V3, this));
    }

    public final o1 f0() {
        return z3.s(this, super.f0());
    }

    public final void s4() {
        if (this.t0 == null) {
            this.t0 = new j(super.y3(), this);
            this.u0 = b4.V(super.y3());
        }
    }

    public final Object w() {
        if (this.v0 == null) {
            synchronized (this.w0) {
                try {
                    if (this.v0 == null) {
                        this.v0 = new f(this);
                    }
                } finally {
                }
            }
        }
        return this.v0.w();
    }

    public final Context y3() {
        if (super.y3() == null && !this.u0) {
            return null;
        }
        s4();
        return this.t0;
    }
}
