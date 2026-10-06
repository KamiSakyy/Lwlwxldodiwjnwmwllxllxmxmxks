package e21;

import a5.s;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b21.j;
import c21.e;
import c21.g0;
import c21.m;
import c21.uShadow;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends e implements a21.a {
    public Set y;
    public m z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Context context, Looper looper, s sVar, m mVar, j jVar, j jVar2) {
        super(context, looper, r3, r4, 270, new y51.c(19, jVar), new y51.c(20, jVar2), (String) sVar.u);
        g0 a = g0.a(context);
        z11.e eVar = z11.e.d;
        uShadow.g(jVar);
        uShadow.g(jVar2);
        Set set = (Set) sVar.t;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.y = set;
        this.z = mVar;
    }

    @Override // a21.a
    public final Set a() {
        return l() ? this.y : Collections.EMPTY_SET;
    }

    @Override // c21.e
    public final int h() {
        return 203400000;
    }

    @Override // c21.e
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // c21.e
    public final Account q() {
        return null;
    }

    @Override // c21.e
    public final z11.d[] r() {
        return m21.b.b;
    }

    @Override // c21.e
    public final Bundle s() {
        m mVar = this.z;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String str = mVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // c21.e
    public final Set t() {
        return this.y;
    }

    @Override // c21.e
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // c21.e
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // c21.e
    public final boolean x() {
        return true;
    }

}
