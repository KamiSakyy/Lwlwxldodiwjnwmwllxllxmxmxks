package com.github.service.auth;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import k71.k;
import tn.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AuthenticatorService extends Service {
    public b r;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        k.g(intent, "intent");
        b bVar = this.r;
        if (bVar != null) {
            return bVar.getIBinder();
        }
        k.m("authenticator");
        throw null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.r = new b(this);
    }
}
