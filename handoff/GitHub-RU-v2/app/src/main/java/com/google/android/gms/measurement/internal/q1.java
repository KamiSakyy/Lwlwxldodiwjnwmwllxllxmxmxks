package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ v4 s;
    public final /* synthetic */ v1 t;

    public /* synthetic */ q1(v1 v1Var, v4 v4Var, int i) {
        this.r = i;
        this.s = v4Var;
        this.t = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                v1 v1Var = this.t;
                v1Var.f.B();
                v1Var.f.Y(this.s);
                break;
            case 1:
                v1 v1Var2 = this.t;
                v1Var2.f.B();
                o4 o4Var = v1Var2.f;
                o4Var.b().z();
                o4Var.l0();
                v4 v4Var = this.s;
                c21.u.g(v4Var);
                String str = v4Var.r;
                c21.u.d(str);
                int i = 0;
                if (o4Var.e0().J(null, c0.z0)) {
                    o4Var.f().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int H = o4Var.e0().H(null, c0.i0);
                    o4Var.e0();
                    long longValue = currentTimeMillis - ((Long) c0.e.a(null)).longValue();
                    while (i < H && o4Var.I(null, longValue)) {
                        i++;
                    }
                } else {
                    o4Var.e0();
                    long intValue = ((Integer) c0.l.a(null)).intValue();
                    while (i < intValue && o4Var.I(str, 0L)) {
                        i++;
                    }
                }
                if (o4Var.e0().J(null, c0.A0)) {
                    o4Var.b().z();
                    o4Var.H();
                }
                k4 k4Var = o4Var.A;
                int a = com.github.rudroid.copilot.h1.a(v4Var.V);
                k4Var.z();
                if (a == 2 && !k4.C(str)) {
                    i1 i1Var = k4Var.t.r;
                    o4.U(i1Var);
                    com.google.android.gms.internal.measurement.f2 L = i1Var.L(str);
                    if (L != null && L.D() && !L.E().q().isEmpty()) {
                        o4Var.a().F.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        o4Var.f().getClass();
                        o4Var.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                v1 v1Var3 = this.t;
                v1Var3.f.B();
                o4 o4Var2 = v1Var3.f;
                o4Var2.b().z();
                o4Var2.l0();
                v4 v4Var2 = this.s;
                c21.u.d(v4Var2.r);
                o4Var2.c0(v4Var2);
                break;
            case 3:
                v1 v1Var4 = this.t;
                v1Var4.f.B();
                o4 o4Var3 = v1Var4.f;
                if (o4Var3.P != null) {
                    ArrayList arrayList = new ArrayList();
                    o4Var3.Q = arrayList;
                    arrayList.addAll(o4Var3.P);
                }
                o oVar = o4Var3.t;
                o4.U(oVar);
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
                v4 v4Var3 = this.s;
                String str2 = v4Var3.r;
                c21.u.g(str2);
                c21.u.d(str2);
                oVar.z();
                oVar.A();
                try {
                    SQLiteDatabase o0 = oVar.o0();
                    String[] strArr = {str2};
                    int delete = o0.delete("apps", "app_id=?", strArr) + o0.delete("events", "app_id=?", strArr) + o0.delete("events_snapshot", "app_id=?", strArr) + o0.delete("user_attributes", "app_id=?", strArr) + o0.delete("conditional_properties", "app_id=?", strArr) + o0.delete("raw_events", "app_id=?", strArr) + o0.delete("raw_events_metadata", "app_id=?", strArr) + o0.delete("queue", "app_id=?", strArr) + o0.delete("audience_filter_values", "app_id=?", strArr) + o0.delete("main_event_params", "app_id=?", strArr) + o0.delete("default_event_params", "app_id=?", strArr) + o0.delete("trigger_uris", "app_id=?", strArr) + o0.delete("upload_queue", "app_id=?", strArr);
                    if (o1Var.u.J(null, c0.h1)) {
                        delete += o0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (delete > 0) {
                        s0 s0Var = o1Var.w;
                        o1.m(s0Var);
                        s0Var.F.c("Reset analytics data. app, records", str2, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e) {
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.x.c("Error resetting analytics data. appId, error", s0.H(str2), e);
                }
                if (v4Var3.y) {
                    o4Var3.Y(v4Var3);
                    break;
                }
                break;
            case 4:
                v1 v1Var5 = this.t;
                v1Var5.f.B();
                o4 o4Var4 = v1Var5.f;
                o4Var4.b().z();
                o4Var4.l0();
                v4 v4Var4 = this.s;
                c21.u.d(v4Var4.r);
                o4Var4.m0(v4Var4);
                o4Var4.n0(v4Var4);
                break;
            case 5:
                o4 o4Var5 = this.t.f;
                o4Var5.B();
                o4Var5.n0(this.s);
                break;
            default:
                o4 o4Var6 = this.t.f;
                o4Var6.B();
                o4Var6.m0(this.s);
                break;
        }
    }
}
