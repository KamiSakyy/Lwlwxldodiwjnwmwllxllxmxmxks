package com.github.rudroid.settings;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h extends androidx.lifecycle.k1 {
    public final com.github.rudroid.o0 s;
    public final androidx.lifecycle.p0 t;

    public h(com.github.rudroid.o0 o0Var) {
        k71.k.g(o0Var, "networkInformationProvider");
        this.s = o0Var;
        this.t = new androidx.lifecycle.p0();
    }

    public final void P() {
        Object systemService = this.s.a.getSystemService("connectivity");
        k71.k.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        boolean z = false;
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            z = true;
        }
        this.t.j(Boolean.valueOf(z));
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b<T1,T2,T3,T4> {
        public b() {
        }
    }
}
