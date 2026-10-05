package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n2 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ Bundle s;
    public final /* synthetic */ t2 t;

    public /* synthetic */ n2(t2 t2Var, Bundle bundle, int i) {
        this.r = i;
        this.s = bundle;
        this.t = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.r) {
            case 0:
                t2 t2Var = this.t;
                t2Var.z();
                t2Var.A();
                Bundle bundle2 = this.s;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                c21.u.d(string);
                c21.u.d(string2);
                c21.u.g(bundle2.get("value"));
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                if (!o1Var.e()) {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.F.a("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    q4 q4Var = new q4(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        t4 t4Var = o1Var.z;
                        o1.k(t4Var);
                        bundle2.getString("app_id");
                        w c0 = t4Var.c0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        o1.k(t4Var);
                        bundle2.getString("app_id");
                        w c02 = t4Var.c0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        o1Var.p().S(new f(bundle2.getString("app_id"), string2, q4Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), c02, bundle2.getLong("trigger_timeout"), c0, bundle2.getLong("time_to_live"), t4Var.c0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                t2 t2Var2 = this.t;
                t2Var2.z();
                t2Var2.A();
                Bundle bundle3 = this.s;
                String string3 = bundle3.getString("name");
                c21.u.d(string3);
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var2).s;
                if (!o1Var2.e()) {
                    s0 s0Var2 = o1Var2.w;
                    o1.m(s0Var2);
                    s0Var2.F.a("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    q4 q4Var2 = new q4(0L, null, string3, "");
                    try {
                        t4 t4Var2 = o1Var2.z;
                        o1.k(t4Var2);
                        bundle3.getString("app_id");
                        o1Var2.p().S(new f(bundle3.getString("app_id"), "", q4Var2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), t4Var2.c0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                t2 t2Var3 = this.t;
                y51.c cVar = t2Var3.O;
                o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var3).s;
                Bundle bundle4 = this.s;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    c1 c1Var = o1Var3.v;
                    t4 t4Var3 = o1Var3.z;
                    h hVar = o1Var3.u;
                    s0 s0Var3 = o1Var3.w;
                    o1.k(c1Var);
                    bundle = new Bundle(c1Var.Q.U());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            o1.k(t4Var3);
                            if (t4.I0(obj)) {
                                t4.P(cVar, null, 27, null, null, 0);
                            }
                            o1.m(s0Var3);
                            s0Var3.C.c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (t4.Y(str)) {
                            o1.m(s0Var3);
                            s0Var3.C.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            o1.k(t4Var3);
                            hVar.getClass();
                            if (t4Var3.J0("param", str, 500, obj)) {
                                t4Var3.O(bundle, str, obj);
                            }
                        }
                    }
                    o1.k(t4Var3);
                    t4 t4Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) hVar).s).z;
                    o1.k(t4Var4);
                    int i = t4Var4.f0(201500000) ? 100 : 25;
                    if (bundle.size() > i) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i2++;
                            if (i2 > i) {
                                bundle.remove(str2);
                            }
                        }
                        o1.k(t4Var3);
                        t4.P(cVar, null, 26, null, null, 0);
                        o1.m(s0Var3);
                        s0Var3.C.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                c1 c1Var2 = o1Var3.v;
                o1.k(c1Var2);
                c1Var2.Q.Y(bundle);
                if (!bundle4.isEmpty() || o1Var3.u.J(null, c0.W0)) {
                    o1Var3.p().E(bundle);
                    break;
                }
                break;
        }
    }
}
