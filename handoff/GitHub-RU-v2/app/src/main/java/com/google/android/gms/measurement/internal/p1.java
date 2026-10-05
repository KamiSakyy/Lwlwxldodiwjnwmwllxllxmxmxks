package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1(v1 v1Var, Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = v1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0096, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Exception exc;
        v2.t z;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        x9.h l;
        int i;
        Exception exc2 = null;
        switch (this.a) {
            case 0:
                v1 v1Var = (v1) this.b;
                v1Var.f.B();
                o oVar = v1Var.f.t;
                o4.U(oVar);
                return oVar.u0((String) this.c);
            case 1:
                v1 v1Var2 = (v1) this.b;
                v1Var2.f.B();
                return new j(v1Var2.f.p0(((v4) this.c).r));
            case 2:
                v4 v4Var = (v4) this.c;
                String str = v4Var.r;
                c21.u.g(str);
                o4 o4Var = (o4) this.b;
                b2 e = o4Var.e(str);
                a2 a2Var = a2.ANALYTICS_STORAGE;
                if (e.i(a2Var) && b2.c(v4Var.J, 100).i(a2Var)) {
                    return o4Var.c0(v4Var).E();
                }
                o4Var.a().F.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                x9.c cVar2 = (x9.c) this.b;
                int i2 = 9;
                if (!cVar2.w()) {
                    x9.h hVar = x9.z.j;
                    cVar2.A(2, 9, hVar);
                    x9.d dVar = (x9.d) this.c;
                    com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.s;
                    dVar.a(hVar, com.google.android.gms.internal.play_billing.v.v);
                } else {
                    if (!TextUtils.isEmpty("subs")) {
                        com.google.android.gms.internal.play_billing.t.g("BillingClient", "Querying owned items, item type: ".concat("subs"));
                        ArrayList arrayList = new ArrayList();
                        boolean z2 = cVar2.n;
                        cVar2.x.getClass();
                        cVar2.x.getClass();
                        long longValue = cVar2.C.longValue();
                        Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.t.b(longValue, bundle, cVar2.c, cVar2.d);
                        int i3 = 1;
                        if (z2) {
                            bundle.putBoolean("enablePendingPurchases", true);
                        }
                        String str2 = null;
                        while (true) {
                            try {
                                synchronized (cVar2.a) {
                                    try {
                                        cVar = cVar2.i;
                                    } catch (Throwable th) {
                                        th = th;
                                        exc = exc2;
                                        while (true) {
                                            try {
                                                try {
                                                    throw th;
                                                } catch (DeadObjectException e2) {
                                                    e = e2;
                                                    z = cVar2.z(x9.z.j, 52, e);
                                                    list = (List) z.s;
                                                    if (list != null) {
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    z = cVar2.z(x9.z.h, 52, e);
                                                    list = (List) z.s;
                                                    if (list != null) {
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                }
                                if (cVar == null) {
                                    z = cVar2.z(x9.z.j, 107, exc2);
                                    break;
                                } else {
                                    Bundle U = cVar2.n ? ((com.google.android.gms.internal.play_billing.a) cVar).U(cVar2.w ? 26 : cVar2.v ? 24 : cVar2.s ? 19 : i2, cVar2.g.getPackageName(), str2, bundle) : ((com.google.android.gms.internal.play_billing.a) cVar).T(cVar2.g.getPackageName(), str2);
                                    x9.h hVar2 = x9.z.h;
                                    if (U == null) {
                                        Log.isLoggable("BillingClient", 5);
                                        i = 54;
                                    } else {
                                        int a = com.google.android.gms.internal.play_billing.t.a("BillingClient", U);
                                        String f = com.google.android.gms.internal.play_billing.t.f("BillingClient", U);
                                        androidx.compose.runtime.i1 a2 = x9.h.a();
                                        a2.r = a;
                                        a2.t = f;
                                        l = a2.l();
                                        if (a != 0) {
                                            Log.isLoggable("BillingClient", 5);
                                            i = 23;
                                        } else if (U.containsKey("INAPP_PURCHASE_ITEM_LIST") && U.containsKey("INAPP_PURCHASE_DATA_LIST") && U.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                            ArrayList<String> stringArrayList = U.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                            ArrayList<String> stringArrayList2 = U.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                            ArrayList<String> stringArrayList3 = U.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                            if (stringArrayList == null) {
                                                Log.isLoggable("BillingClient", 5);
                                                i = 56;
                                            } else if (stringArrayList2 == null) {
                                                Log.isLoggable("BillingClient", 5);
                                                i = 57;
                                            } else if (stringArrayList3 == null) {
                                                Log.isLoggable("BillingClient", 5);
                                                i = 58;
                                            } else {
                                                l = x9.z.i;
                                                i = i3;
                                            }
                                        } else {
                                            Log.isLoggable("BillingClient", 5);
                                            i = 55;
                                        }
                                        if (l == x9.z.i) {
                                            z = cVar2.z(l, i, exc2);
                                            break;
                                        } else {
                                            ArrayList<String> stringArrayList4 = U.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                            ArrayList<String> stringArrayList5 = U.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                            ArrayList<String> stringArrayList6 = U.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                            exc = exc2;
                                            boolean z3 = false;
                                            for (int i4 = 0; i4 < stringArrayList5.size(); i4++) {
                                                String str3 = stringArrayList5.get(i4);
                                                String str4 = stringArrayList6.get(i4);
                                                com.google.android.gms.internal.play_billing.t.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i4))));
                                                try {
                                                    Purchase purchase = new Purchase(str3, str4);
                                                    if (TextUtils.isEmpty(purchase.b())) {
                                                        Log.isLoggable("BillingClient", 5);
                                                        z3 = true;
                                                    }
                                                    arrayList.add(purchase);
                                                } catch (JSONException e4) {
                                                    z = cVar2.z(x9.z.h, 51, e4);
                                                }
                                            }
                                            if (z3) {
                                                i2 = 9;
                                                cVar2.A(26, 9, hVar2);
                                            } else {
                                                i2 = 9;
                                            }
                                            str2 = U.getString("INAPP_CONTINUATION_TOKEN");
                                            com.google.android.gms.internal.play_billing.t.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                                            if (TextUtils.isEmpty(str2)) {
                                                z = new v2.t(x9.z.i, arrayList, false, 18);
                                            } else {
                                                exc2 = exc;
                                                i3 = 1;
                                            }
                                        }
                                    }
                                    l = hVar2;
                                    if (l == x9.z.i) {
                                    }
                                }
                            } catch (DeadObjectException e5) {
                                e = e5;
                                exc = exc2;
                            } catch (Exception e6) {
                                e = e6;
                                exc = exc2;
                            }
                        }
                        list = (List) z.s;
                        if (list != null) {
                            ((x9.d) this.c).a((x9.h) z.t, list);
                            return exc;
                        }
                        x9.d dVar2 = (x9.d) this.c;
                        x9.h hVar3 = (x9.h) z.t;
                        com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.s;
                        dVar2.a(hVar3, com.google.android.gms.internal.play_billing.v.v);
                        return exc;
                    }
                    int i5 = com.google.android.gms.internal.play_billing.t.a;
                    Log.isLoggable("BillingClient", 5);
                    x9.h hVar4 = x9.z.e;
                    cVar2.A(50, 9, hVar4);
                    x9.d dVar3 = (x9.d) this.c;
                    com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.s;
                    dVar3.a(hVar4, com.google.android.gms.internal.play_billing.v.v);
                }
                return null;
        }
    }

    public p1(o4 o4Var, v4 v4Var) {
        this.a = 2;
        this.c = v4Var;
        Objects.requireNonNull(o4Var);
        this.b = o4Var;
    }

    public p1(x9.c cVar, x9.d dVar) {
        this.a = 3;
        this.c = dVar;
        Objects.requireNonNull(cVar);
        this.b = cVar;
    }
}
