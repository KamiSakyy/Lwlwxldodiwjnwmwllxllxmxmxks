package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.SystemClock;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w3 extends p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Object obj, x1 x1Var, int i) {
        super(x1Var);
        this.e = i;
        this.f = obj;
    }

    @Override // com.google.android.gms.measurement.internal.p
    public final void a() {
        switch (this.e) {
            case 0:
                a0.o2 o2Var = (a0.o2) this.f;
                y3 y3Var = (y3) o2Var.d;
                y3Var.z();
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var).s;
                o1Var.B.getClass();
                o2Var.o(false, false, SystemClock.elapsedRealtime());
                z zVar = o1Var.E;
                o1.j(zVar);
                o1Var.B.getClass();
                zVar.C(SystemClock.elapsedRealtime());
                break;
            case 1:
                d4 d4Var = (d4) this.f;
                d4Var.D();
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) d4Var).s).w;
                o1.m(s0Var);
                s0Var.F.a("Starting upload from DelayedRunnable");
                d4Var.t.q();
                break;
            default:
                o4 o4Var = (o4) this.f;
                o4Var.b().z();
                String str = (String) o4Var.H.pollFirst();
                if (str != null) {
                    o4Var.f().getClass();
                    o4Var.Z = SystemClock.elapsedRealtime();
                    o4Var.a().F.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    o4.S(o4Var.C.r, intent);
                }
                o4Var.H();
                break;
        }
    }


}
