package a61;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 implements ServiceConnection {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ c1(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = 1;
        com.google.android.gms.internal.play_billing.g gVar = null;
        Object[] objArr = 0;
        switch (this.r) {
            case 0:
                w51.r rVar = (w51.r) this.s;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) rVar.u;
                linkedBlockingDeque.size();
                rVar.t = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                v71.b0.z(v71.b0.c((a71.h) rVar.s), (a71.h) null, (v71.a0Shadow) null, new n0(rVar, arrayList, objArr == true ? 1 : 0, i), 3);
                break;
            case 1:
                c41.o oVar = (c41.o) this.s;
                oVar.b.g("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
                oVar.a().post(new c41.n(this, iBinder));
                break;
            case 2:
                h41.h hVar = (h41.h) this.s;
                hVar.b.f("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
                hVar.a().post(new g41.d(this, iBinder));
                break;
            default:
                com.google.android.gms.internal.play_billing.t.g("BillingClientTesting", "Billing Override Service connected.");
                x9.w wVar = (x9.w) this.s;
                int i2 = com.google.android.gms.internal.play_billing.f.g;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g ? (com.google.android.gms.internal.play_billing.g) queryLocalInterface : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                }
                wVar.G = gVar;
                wVar.F = 2;
                wVar.J(26);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 1;
        switch (this.r) {
            case 0:
                w51.r rVar = (w51.r) this.s;
                rVar.t = null;
                rVar.getClass();
                break;
            case 1:
                c41.o oVar = (c41.o) this.s;
                oVar.b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
                oVar.a().post(new c41.m(1, this));
                break;
            case 2:
                h41.h hVar = (h41.h) this.s;
                hVar.b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
                hVar.a().post(new h41.g(i, this));
                break;
            default:
                int i2 = com.google.android.gms.internal.play_billing.t.a;
                Log.isLoggable("BillingClientTesting", 5);
                x9.w wVar = (x9.w) this.s;
                wVar.G = null;
                wVar.F = 0;
                break;
        }
    }
}
