package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 extends y implements n0 {
    public final AtomicReference f;
    public boolean g;

    public i0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f = new AtomicReference();
    }

    public static final Object g(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void c(Bundle bundle) {
        AtomicReference atomicReference = this.f;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.g = true;
                } finally {
                    this.f.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean e(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
        z.d(parcel);
        c(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle f(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f;
        synchronized (atomicReference) {
            if (!this.g) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f.get();
        }
        return bundle;
    }
}
