package com.google.firebase.sessions;

import a61.d1Shadow;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class SessionLifecycleService extends Service {
    public final HandlerThread r = new HandlerThread("FirebaseSessions_HandlerThread");
    public d1Shadow s;
    public Messenger t;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            d1Shadow d1Var = this.s;
            if (d1Var != null) {
                d1Var.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.t;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.r;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        k.f(looper, "handlerThread.looper");
        this.s = new d1Shadow(looper);
        this.t = new Messenger(this.s);
        Process.myPid();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.r.quit();
    }
}
