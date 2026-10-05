package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class h1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i;
        switch (this.a) {
            case 0:
                return new com.google.android.gms.internal.measurement.j4(((i1) this.b).C);
            case 1:
                v1 v1Var = (v1) this.b;
                v1Var.f.B();
                w0 w0Var = v1Var.f.y;
                o4.U(w0Var);
                w0Var.z();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                x9.u uVar = (x9.u) this.b;
                x9.c cVar2 = uVar.v;
                synchronized (cVar2.a) {
                    try {
                        if (cVar2.b != 3) {
                            boolean z = true;
                            boolean z2 = cVar2.b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.t.b(cVar2.C.longValue(), bundle, cVar2.c, cVar2.d);
                            }
                            synchronized (cVar2.a) {
                                cVar = cVar2.i;
                            }
                            if (cVar == null) {
                                x9.c cVar3 = uVar.v;
                                cVar3.t(0);
                                int i2 = uVar.u;
                                x9.h hVar = x9.z.j;
                                cVar3.s(107, i2, hVar);
                                uVar.c(hVar);
                            } else {
                                x9.c cVar4 = uVar.v;
                                String packageName = cVar4.g.getPackageName();
                                int i3 = 3;
                                int i4 = 27;
                                while (true) {
                                    if (i4 >= 3) {
                                        try {
                                            com.google.android.gms.internal.play_billing.t.g("BillingClient", "trying subs apiVersion: " + i4);
                                            if (bundle == null) {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel N = aVar.N();
                                                N.writeInt(i4);
                                                N.writeString(packageName);
                                                N.writeString("subs");
                                                Parcel O = aVar.O(N, 1);
                                                int readInt = O.readInt();
                                                O.recycle();
                                                i3 = readInt;
                                            } else {
                                                i3 = ((com.google.android.gms.internal.play_billing.a) cVar).P(i4, packageName, "subs", bundle);
                                            }
                                            if (i3 == 0) {
                                                com.google.android.gms.internal.play_billing.t.g("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                            } else {
                                                i4--;
                                            }
                                        } catch (Exception e) {
                                            com.google.android.gms.internal.play_billing.t.h("BillingClient");
                                            boolean z3 = e instanceof DeadObjectException;
                                            int i5 = z3 ? 91 : e instanceof RemoteException ? 90 : e instanceof SecurityException ? 92 : 42;
                                            String a = y3.a.a(i5, 42) ? x9.x.a(e) : null;
                                            uVar.v.t(0);
                                            uVar.b(z3 ? x9.z.j : x9.z.h, i5, a, z2);
                                            uVar.c(z3 ? x9.z.j : x9.z.h);
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                }
                                cVar4.k = i4 >= 3;
                                if (i4 < 3) {
                                    com.google.android.gms.internal.play_billing.t.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i = 9;
                                } else {
                                    i = 1;
                                }
                                int i6 = i3;
                                int i7 = 27;
                                while (true) {
                                    if (i7 >= 3) {
                                        com.google.android.gms.internal.play_billing.t.g("BillingClient", "trying inapp apiVersion: " + i7);
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel N2 = aVar2.N();
                                            N2.writeInt(i7);
                                            N2.writeString(packageName);
                                            N2.writeString("inapp");
                                            Parcel O2 = aVar2.O(N2, 1);
                                            i6 = O2.readInt();
                                            O2.recycle();
                                        } else {
                                            i6 = ((com.google.android.gms.internal.play_billing.a) cVar).P(i7, packageName, "inapp", bundle);
                                        }
                                        if (i6 == 0) {
                                            cVar4.l = i7;
                                            com.google.android.gms.internal.play_billing.t.g("BillingClient", "mHighestLevelSupportedForInApp: " + i7);
                                        } else {
                                            i7--;
                                        }
                                    }
                                }
                                int i8 = cVar4.l;
                                cVar4.l = i8;
                                cVar4.w = i8 >= 26;
                                cVar4.v = i8 >= 24;
                                cVar4.u = i8 >= 21;
                                cVar4.t = i8 >= 20;
                                cVar4.s = i8 >= 19;
                                cVar4.r = i8 >= 17;
                                cVar4.q = i8 >= 16;
                                cVar4.p = i8 >= 15;
                                cVar4.o = i8 >= 14;
                                cVar4.n = i8 >= 9;
                                cVar4.m = i8 >= 6;
                                if (i8 < 3) {
                                    int i9 = com.google.android.gms.internal.play_billing.t.a;
                                    Log.isLoggable("BillingClient", 5);
                                    i = 36;
                                }
                                x9.c.k(cVar4, i6);
                                if (i6 != 0) {
                                    x9.h hVar2 = x9.z.b;
                                    uVar.b(hVar2, i, (String) null, z2);
                                    uVar.c(hVar2);
                                } else {
                                    try {
                                        Long a2 = uVar.a(z2);
                                        if (z2) {
                                            com.google.android.gms.internal.play_billing.z2 q = com.google.android.gms.internal.play_billing.b3.q();
                                            q.c();
                                            com.google.android.gms.internal.play_billing.b3.p((com.google.android.gms.internal.play_billing.b3) q.s, 6);
                                            com.google.android.gms.internal.play_billing.v3 p = com.google.android.gms.internal.play_billing.w3.p();
                                            int i10 = uVar.u;
                                            if (i10 <= 0) {
                                                z = false;
                                            }
                                            p.d(z);
                                            p.e(i10);
                                            p.c();
                                            com.google.android.gms.internal.play_billing.w3.t((com.google.android.gms.internal.play_billing.w3) p.s);
                                            if (a2 != null) {
                                                long longValue = a2.longValue();
                                                p.c();
                                                com.google.android.gms.internal.play_billing.w3.s((com.google.android.gms.internal.play_billing.w3) p.s, longValue);
                                            }
                                            x9.c cVar5 = uVar.v;
                                            q.c();
                                            com.google.android.gms.internal.play_billing.b3.u((com.google.android.gms.internal.play_billing.b3) q.s, (com.google.android.gms.internal.play_billing.w3) p.a());
                                            cVar5.r((com.google.android.gms.internal.play_billing.b3) q.a());
                                        } else {
                                            com.google.android.gms.internal.play_billing.s3 p2 = com.google.android.gms.internal.play_billing.t3.p();
                                            com.google.android.gms.internal.play_billing.c3 q2 = com.google.android.gms.internal.play_billing.d3.q();
                                            q2.c();
                                            com.google.android.gms.internal.play_billing.d3.p((com.google.android.gms.internal.play_billing.d3) q2.s, 0);
                                            q2.c();
                                            com.google.android.gms.internal.play_billing.d3.t((com.google.android.gms.internal.play_billing.d3) q2.s);
                                            p2.c();
                                            com.google.android.gms.internal.play_billing.t3.q((com.google.android.gms.internal.play_billing.t3) p2.s, (com.google.android.gms.internal.play_billing.d3) q2.a());
                                            if (a2 != null) {
                                                long longValue2 = a2.longValue();
                                                p2.c();
                                                com.google.android.gms.internal.play_billing.t3.r((com.google.android.gms.internal.play_billing.t3) p2.s, longValue2);
                                            }
                                            uVar.v.h.u((com.google.android.gms.internal.play_billing.t3) p2.a());
                                        }
                                    } catch (Throwable unused) {
                                        com.google.android.gms.internal.play_billing.t.h("BillingClient");
                                    }
                                    uVar.c(x9.z.i);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
        }
    }

    public h1(v1 v1Var, w wVar, String str) {
        this.a = 1;
        this.b = v1Var;
    }
}
