package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 extends w1 {
    public static final Pair R = new Pair("", 0L);
    public boolean A;
    public long B;
    public a1 C;
    public z0 D;
    public androidx.compose.foundation.lazy.layout.t1 E;
    public w51.r F;
    public z0 G;
    public a1 H;
    public a1 I;
    public boolean J;
    public z0 K;
    public z0 L;
    public a1 M;
    public androidx.compose.foundation.lazy.layout.t1 N;
    public androidx.compose.foundation.lazy.layout.t1 O;
    public a1 P;
    public w51.r Q;
    public SharedPreferences u;
    public SharedPreferences v;
    public b1 w;
    public a1 x;
    public androidx.compose.foundation.lazy.layout.t1 y;
    public String z;

    public c1(o1 o1Var) {
        super(o1Var);
        this.C = new a1(this, "session_timeout", 1800000L);
        this.D = new z0(this, "start_new_session", true);
        this.H = new a1(this, "last_pause_time", 0L);
        this.I = new a1(this, "session_id", 0L);
        this.E = new androidx.compose.foundation.lazy.layout.t1(this, "non_personalized_ads");
        this.F = new w51.r(this, "last_received_uri_timestamps_by_source");
        this.G = new z0(this, "allow_remote_dynamite", false);
        this.x = new a1(this, "first_open_time", 0L);
        c21.u.d("app_install_time");
        this.y = new androidx.compose.foundation.lazy.layout.t1(this, "app_instance_id");
        this.K = new z0(this, "app_backgrounded", false);
        this.L = new z0(this, "deep_link_retrieval_complete", false);
        this.M = new a1(this, "deep_link_retrieval_attempts", 0L);
        this.N = new androidx.compose.foundation.lazy.layout.t1(this, "firebase_feature_rollouts");
        this.O = new androidx.compose.foundation.lazy.layout.t1(this, "deferred_attribution_cache");
        this.P = new a1(this, "deferred_attribution_cache_timestamp", 0L);
        this.Q = new w51.r(this, "default_event_parameters");
    }

    @Override // com.google.android.gms.measurement.internal.w1
    public final boolean A() {
        return true;
    }

    public final SharedPreferences D() {
        z();
        B();
        c21.u.g(this.u);
        return this.u;
    }

    public final SharedPreferences E() {
        z();
        B();
        if (this.v == null) {
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            String valueOf = String.valueOf(o1Var.r.getPackageName());
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            q0 q0Var = s0Var.F;
            String concat = valueOf.concat("_preferences");
            q0Var.b(concat, "Default prefs file");
            this.v = o1Var.r.getSharedPreferences(concat, 0);
        }
        return this.v;
    }

    public final SparseArray F() {
        Bundle U = this.F.U();
        int[] intArray = U.getIntArray("uriSources");
        long[] longArray = U.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.x.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final b2 G() {
        z();
        return b2.c(D().getString("consent_settings", "G1"), D().getInt("consent_source", 100));
    }

    public final boolean H(z3 z3Var) {
        z();
        String string = D().getString("stored_tcf_param", "");
        String a = z3Var.a();
        if (a.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = D().edit();
        edit.putString("stored_tcf_param", a);
        edit.apply();
        return true;
    }

    public final void I(boolean z) {
        z();
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
        o1.m(s0Var);
        s0Var.F.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = D().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean J(long j) {
        return j - this.C.a() > this.H.a();
    }
}
