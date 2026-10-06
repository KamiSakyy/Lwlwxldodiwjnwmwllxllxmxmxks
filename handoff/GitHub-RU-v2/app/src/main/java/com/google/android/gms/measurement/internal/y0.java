package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 extends BroadcastReceiver {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public Object d;

    public y0(b21.l lVar, boolean z) {
        this.d = lVar;
        this.c = z;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        o4 o4Var = (o4) this.d;
        o4Var.l0();
        o4Var.b().z();
        o4Var.b().z();
        if (this.b) {
            o4Var.a().F.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                o4Var.C.r.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                o4Var.a().x.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void c(Context context) {
        if (this.b) {
            context.unregisterReceiver(this);
            this.b = false;
        } else {
            int i = com.google.android.gms.internal.play_billing.t.a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    public void d(Bundle bundle, x9.hShadow hVar, int i, com.google.android.gms.internal.play_billing.g3 g3Var, long j, boolean z) {
        b21.l lVar = (b21.l) this.d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                ((x9.y) lVar.u).s(com.google.android.gms.internal.play_billing.y2.t(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((x9.y) lVar.u).s(x9.xShadow.b(23, i, hVar, (String) null, g3Var), j, z);
            }
        } catch (Throwable unused) {
            int i2 = com.google.android.gms.internal.play_billing.t.a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        com.google.android.gms.internal.play_billing.g3 g3Var;
        x9.hShadow e;
        long j;
        com.google.android.gms.internal.play_billing.j3 j3Var;
        int intValue;
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                o4 o4Var = (o4) obj;
                o4Var.l0();
                String action = intent.getAction();
                o4Var.a().F.b(action, "NetworkBroadcastReceiver received action");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    w0 w0Var = o4Var.s;
                    o4.U(w0Var);
                    boolean T = w0Var.T();
                    if (this.c != T) {
                        this.c = T;
                        o4Var.b().I(new androidx.fragment.app.o(this, T));
                        break;
                    }
                } else {
                    o4Var.a().A.b(action, "NetworkBroadcastReceiver received unknown action");
                    break;
                }
                break;
            default:
                b21.l lVar = (b21.l) obj;
                String action2 = intent.getAction();
                int hashCode = action2.hashCode();
                com.google.android.gms.internal.play_billing.g3 g3Var2 = com.google.android.gms.internal.play_billing.g3.u;
                com.google.android.gms.internal.play_billing.g3 g3Var3 = com.google.android.gms.internal.play_billing.g3.t;
                com.google.android.gms.internal.play_billing.g3 g3Var4 = com.google.android.gms.internal.play_billing.g3.v;
                if (hashCode == -1484087650) {
                    if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                        g3Var = g3Var3;
                    }
                    g3Var = com.google.android.gms.internal.play_billing.g3.s;
                } else if (hashCode != -337612916) {
                    if (hashCode == 345207161 && action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                        g3Var = g3Var4;
                    }
                    g3Var = com.google.android.gms.internal.play_billing.g3.s;
                } else {
                    if (action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                        g3Var = g3Var2;
                    }
                    g3Var = com.google.android.gms.internal.play_billing.g3.s;
                }
                int i2 = (g3Var.equals(g3Var2) || g3Var.equals(g3Var4)) ? 2 : g3Var.equals(g3Var3) ? 32 : 1;
                Bundle extras = intent.getExtras();
                ArrayList arrayList = null;
                if (extras == null) {
                    int i3 = com.google.android.gms.internal.play_billing.t.a;
                    Log.isLoggable("BillingBroadcastManager", 5);
                    v2.t tVar = (x9.y) lVar.u;
                    x9.hShadow hVar = x9.z.h;
                    tVar.q(x9.xShadow.b(11, i2, hVar, (String) null, g3Var));
                    com.github.rudroid.copilot.inapppurchase.billingclient.g gVar = (x9.o) lVar.t;
                    if (gVar != null) {
                        gVar.a(hVar, (List) null);
                        break;
                    }
                } else {
                    if (i2 == 2) {
                        int i4 = com.google.android.gms.internal.play_billing.t.a;
                        androidx.compose.runtime.i1 a = x9.hShadow.a();
                        a.r = com.google.android.gms.internal.play_billing.t.a("BillingBroadcastManager", intent.getExtras());
                        Bundle extras2 = intent.getExtras();
                        if (extras2 == null) {
                            Log.isLoggable("BillingBroadcastManager", 5);
                        } else {
                            Object obj2 = extras2.get("SUB_RESPONSE_CODE");
                            if (obj2 == null) {
                                com.google.android.gms.internal.play_billing.t.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                            } else if (obj2 instanceof Integer) {
                                intValue = ((Integer) obj2).intValue();
                                a.s = intValue;
                                a.t = com.google.android.gms.internal.play_billing.t.f("BillingBroadcastManager", intent.getExtras());
                                e = a.l();
                            } else {
                                "Unexpected type for bundle sub response code: ".concat(obj2.getClass().getName());
                                Log.isLoggable("BillingBroadcastManager", 5);
                            }
                        }
                        intValue = 0;
                        a.s = intValue;
                        a.t = com.google.android.gms.internal.play_billing.t.f("BillingBroadcastManager", intent.getExtras());
                        e = a.l();
                    } else {
                        e = com.google.android.gms.internal.play_billing.t.e(intent, "BillingBroadcastManager");
                    }
                    long j2 = extras.getLong("billingClientTransactionId", 0L);
                    boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
                    if (g3Var.equals(g3Var3) || g3Var.equals(g3Var2)) {
                        x9.hShadow hVar2 = e;
                        int i5 = i2;
                        com.google.android.gms.internal.play_billing.g3 g3Var5 = g3Var;
                        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        ArrayList arrayList2 = new ArrayList();
                        if (stringArrayList == null || stringArrayList2 == null) {
                            j = 0;
                            Purchase i6 = com.google.android.gms.internal.play_billing.t.i(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                            if (i6 == null) {
                                com.google.android.gms.internal.play_billing.t.g("BillingHelper", "Couldn't find single purchase data as well.");
                                if (hVar2.a != 0) {
                                    v2.t tVar2 = (x9.y) lVar.u;
                                    com.google.android.gms.internal.play_billing.b3 c = x9.xShadow.c(i5, g3Var5);
                                    v2.t tVar3 = tVar2;
                                    tVar3.getClass();
                                    try {
                                        com.google.android.gms.internal.play_billing.z2 z2Var = (com.google.android.gms.internal.play_billing.z2) c.l();
                                        com.google.android.gms.internal.play_billing.m3 m3Var = (com.google.android.gms.internal.play_billing.m3) c.r().l();
                                        m3Var.c();
                                        com.google.android.gms.internal.play_billing.o3.q((com.google.android.gms.internal.play_billing.o3) m3Var.s, z);
                                        z2Var.c();
                                        com.google.android.gms.internal.play_billing.b3.t((com.google.android.gms.internal.play_billing.b3) z2Var.s, (com.google.android.gms.internal.play_billing.o3) m3Var.a());
                                        com.google.android.gms.internal.play_billing.b3 b3Var = (com.google.android.gms.internal.play_billing.b3) z2Var.a();
                                        if (j2 == j) {
                                            j3Var = (com.google.android.gms.internal.play_billing.j3) tVar3.s;
                                        } else {
                                            com.google.android.gms.internal.play_billing.i3 i3Var = (com.google.android.gms.internal.play_billing.i3) ((com.google.android.gms.internal.play_billing.j3) tVar3.s).l();
                                            i3Var.c();
                                            com.google.android.gms.internal.play_billing.j3.E((com.google.android.gms.internal.play_billing.j3) i3Var.s, j2);
                                            j3Var = (com.google.android.gms.internal.play_billing.j3) i3Var.a();
                                        }
                                        tVar3.w(b3Var, j3Var);
                                    } catch (Throwable unused) {
                                        com.google.android.gms.internal.play_billing.t.h("BillingLogger");
                                    }
                                } else {
                                    d(extras, hVar2, i5, g3Var5, j2, z);
                                }
                                ((x9.o) lVar.t).a(hVar2, arrayList);
                                break;
                            } else {
                                arrayList2.add(i6);
                            }
                        } else {
                            j = 0;
                            com.google.android.gms.internal.play_billing.t.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                            for (int i7 = 0; i7 < stringArrayList.size() && i7 < stringArrayList2.size(); i7++) {
                                Purchase i8 = com.google.android.gms.internal.play_billing.t.i(stringArrayList.get(i7), stringArrayList2.get(i7));
                                if (i8 != null) {
                                    arrayList2.add(i8);
                                }
                            }
                        }
                        arrayList = arrayList2;
                        if (hVar2.a != 0) {
                        }
                        ((x9.o) lVar.t).a(hVar2, arrayList);
                    } else if (g3Var.equals(g3Var4)) {
                        if (e.a != 0) {
                            x9.hShadow hVar3 = e;
                            d(extras, hVar3, i2, g3Var, j2, z);
                            com.github.rudroid.copilot.inapppurchase.billingclient.g gVar2 = (x9.o) lVar.t;
                            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.s;
                            gVar2.a(hVar3, com.google.android.gms.internal.play_billing.v.v);
                        } else {
                            com.google.android.gms.internal.play_billing.g3 g3Var6 = g3Var;
                            lVar.getClass();
                            Log.isLoggable("BillingBroadcastManager", 5);
                            v2.t tVar4 = (x9.y) lVar.u;
                            x9.hShadow hVar4 = x9.z.h;
                            tVar4.s(x9.xShadow.b(141, i2, hVar4, (String) null, g3Var6), j2, z);
                            com.github.rudroid.copilot.inapppurchase.billingclient.g gVar3 = (x9.o) lVar.t;
                            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.s;
                            gVar3.a(hVar4, com.google.android.gms.internal.play_billing.v.v);
                        }
                    }
                }
                break;
        }
    }

    public y0(o4 o4Var) {
        c21.uShadow.g(o4Var);
        this.d = o4Var;
    }
}
