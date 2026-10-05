package g41;

import a61.c1;
import a81.t;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h41.h;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends h41.e {
    public final /* synthetic */ int s = 1;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public d(c1 c1Var, IBinder iBinder) {
        this.t = iBinder;
        this.u = c1Var;
    }

    @Override // h41.e
    public final void a() {
        HashMap hashMap;
        h41.d dVar = null;
        int i = 0;
        switch (this.s) {
            case 0:
                try {
                    f fVar = (f) this.u;
                    h41.d dVar2 = fVar.a.m;
                    String str = fVar.b;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = g.a;
                    synchronized (g.class) {
                        hashMap = g.a;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    f fVar2 = (f) this.u;
                    w21.g gVar = (w21.g) this.t;
                    String str2 = fVar2.b;
                    e eVar = new e(fVar2, gVar);
                    h41.b bVar = (h41.b) dVar2;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i2 = h41.a.a;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(eVar);
                    try {
                        bVar.f.transact(2, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    f fVar3 = (f) this.u;
                    t tVar = f.c;
                    Object[] objArr = {fVar3.b};
                    tVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        t.h(tVar.s, "error requesting in-app review for %s", objArr);
                    }
                    ((w21.g) this.t).b(new RuntimeException(e));
                    return;
                }
            default:
                h hVar = (h) ((c1) this.u).s;
                IBinder iBinder = (IBinder) this.t;
                int i3 = h41.c.g;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    dVar = queryLocalInterface instanceof h41.d ? (h41.d) queryLocalInterface : new h41.b(iBinder);
                }
                hVar.m = dVar;
                t tVar2 = hVar.b;
                tVar2.f("linkToDeath", new Object[0]);
                try {
                    hVar.m.asBinder().linkToDeath(hVar.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    tVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        t.h(tVar2.s, "linkToDeath failed", objArr2);
                    }
                }
                hVar.g = false;
                ArrayList arrayList = hVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                hVar.d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, w21.g gVar, w21.g gVar2) {
        super(gVar);
        this.t = gVar2;
        this.u = fVar;
    }
}
