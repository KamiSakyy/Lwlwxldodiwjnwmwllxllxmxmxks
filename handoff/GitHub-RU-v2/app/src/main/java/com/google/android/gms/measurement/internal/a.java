package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ long t;
    public final /* synthetic */ z u;

    public /* synthetic */ a(z zVar, String str, long j, int i) {
        this.r = i;
        this.s = str;
        this.t = j;
        this.u = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                z zVar = this.u;
                zVar.z();
                String str = this.s;
                c21.u.d(str);
                x.e eVar = zVar.u;
                boolean isEmpty = eVar.isEmpty();
                long j = this.t;
                if (isEmpty) {
                    zVar.v = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num == null) {
                    if (((x.q0) eVar).t < 100) {
                        eVar.put(str, 1);
                        zVar.t.put(str, Long.valueOf(j));
                        break;
                    } else {
                        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) zVar).s).w;
                        o1.m(s0Var);
                        s0Var.A.a("Too many ads visible");
                        break;
                    }
                } else {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                z zVar2 = this.u;
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) zVar2).s;
                zVar2.z();
                String str2 = this.s;
                c21.u.d(str2);
                x.e eVar2 = zVar2.u;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.x.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    f3 f3Var = o1Var.C;
                    s0 s0Var3 = o1Var.w;
                    o1.l(f3Var);
                    b3 F = f3Var.F(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        eVar2.put(str2, Integer.valueOf(intValue));
                        break;
                    } else {
                        eVar2.remove(str2);
                        x.e eVar3 = zVar2.t;
                        Long l = (Long) eVar3.get(str2);
                        long j2 = this.t;
                        if (l == null) {
                            o1.m(s0Var3);
                            s0Var3.x.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = j2 - l.longValue();
                            eVar3.remove(str2);
                            zVar2.E(str2, longValue, F);
                        }
                        if (eVar2.isEmpty()) {
                            long j3 = zVar2.v;
                            if (j3 != 0) {
                                zVar2.D(j2 - j3, F);
                                zVar2.v = 0L;
                                break;
                            } else {
                                o1.m(s0Var3);
                                s0Var3.x.a("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
