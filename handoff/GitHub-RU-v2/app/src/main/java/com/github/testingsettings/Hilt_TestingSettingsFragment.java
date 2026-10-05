package com.github.testingsettings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.a0;
import androidx.lifecycle.o1;
import com.github.rudroid.e;
import com.github.rudroid.r;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import gi.c;
import h11.k;
import m61.f;
import m61.j;
import o61.b;
import oa.m;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class Hilt_TestingSettingsFragment extends a0 implements b {
    public j t0;
    public boolean u0;
    public volatile f v0;
    public final Object w0;
    public boolean x0;

    public Hilt_TestingSettingsFragment() {
        super(2131558814);
        this.u0 = false;
        this.w0 = new Object();
        this.x0 = false;
    }

    public final void N3(Activity activity) {
        boolean z = true;
        ((a0) this).Y = true;
        j jVar = this.t0;
        if (jVar != null && f.c(jVar) != activity) {
            z = false;
        }
        i4.S(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s4();
        t4();
    }

    public final void O3(Context context) {
        super.O3(context);
        s4();
        t4();
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

    public final void t4() {
        if (this.x0) {
            return;
        }
        this.x0 = true;
        TestingSettingsFragment testingSettingsFragment = (TestingSettingsFragment) this;
        e eVar = (k) w();
        testingSettingsFragment.y0 = (c) eVar.c.e.get();
        r rVar = eVar.a;
        testingSettingsFragment.z0 = (m) rVar.p.get();
        testingSettingsFragment.A0 = (oa.e) rVar.l.get();
        testingSettingsFragment.B0 = (n5.f) rVar.K1.get();
        testingSettingsFragment.C0 = (n5.f) rVar.L1.get();
    }

    @Override // o61.b
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
