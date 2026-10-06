package x11;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import c21.h0;
import c21.u;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l21.c;
import l21.d;
import z11.f;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public z11.a a;
    public d b;
    public boolean c;
    public final Object d = new Object();
    public b e;
    public Context f;
    public long g;

    public a(Context context) {
        u.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static h0 a(Context context) {
        a aVar = new a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            h0 e = aVar.e();
            d(e, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e;
        } finally {
        }
    }

    public static void d(h0 h0Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (h0Var != null) {
                hashMap.put("limit_ad_tracking", true != h0Var.c ? "0" : "1");
                String str = h0Var.b;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new t61.d(1, hashMap).start();
        }
    }

    public final void b() {
        u.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        f21.a.b().c(this.f, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        u.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = f.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    z11.a aVar = new z11.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!f21.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a = aVar.a();
                            int i = c.f;
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = queryLocalInterface instanceof d ? (d) queryLocalInterface : new l21.b(a);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final h0 e() {
        h0 h0Var;
        u.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        b bVar = this.e;
                        if (bVar == null || !bVar.u) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                u.g(this.a);
                u.g(this.b);
                try {
                    l21.b bVar2 = (l21.b) this.b;
                    bVar2.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel e2 = bVar2.e(obtain, 1);
                    String readString = e2.readString();
                    e2.recycle();
                    l21.b bVar3 = (l21.b) this.b;
                    bVar3.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = l21.a.a;
                    obtain2.writeInt(1);
                    Parcel e3 = bVar3.e(obtain2, 2);
                    if (e3.readInt() == 0) {
                        z = false;
                    }
                    e3.recycle();
                    h0Var = new h0(3, readString, z);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            b bVar4 = this.e;
            if (bVar4 != null) {
                bVar4.t.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused2) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new b(this, j);
            }
        }
        return h0Var;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
