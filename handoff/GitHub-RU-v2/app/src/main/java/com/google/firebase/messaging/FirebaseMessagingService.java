package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l51.h;
import s21.a;
import sy.s;
import t.q;
import w51.g;
import y11.b;
import y11.k;
import y11.l;

/* loaded from: /home/user/work/p/classes4.dex */
public class FirebaseMessagingService extends g {
    public static final ArrayDeque x = new ArrayDeque(10);
    public b w;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    @Override // w51.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        b bVar;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                d(intent.getStringExtra("token"));
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = x;
            if (arrayDeque.contains(stringExtra)) {
                Log.isLoggable("FirebaseMessaging", 3);
                if (this.w == null) {
                    this.w = new b(getApplicationContext());
                }
                bVar = this.w;
                if (bVar.c.n() >= 233700000) {
                    q.j(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                String stringExtra2 = intent.getStringExtra("google.message_id");
                if (stringExtra2 == null) {
                    stringExtra2 = intent.getStringExtra("message_id");
                }
                bundle.putString("google.message_id", stringExtra2);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle.putInt("google.product_id", valueOf.intValue());
                }
                l n = l.n(bVar.b);
                synchronized (n) {
                    i = n.a;
                    n.a = i + 1;
                }
                n.o(new k(i, 3, bundle, 0));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra);
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        switch (stringExtra3) {
            case "gcm":
                s.k(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (a.p(extras)) {
                    a aVar = new a(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new h21.a("Firebase-Messaging-Network-Io"));
                    try {
                        if (new h(this, aVar, newSingleThreadExecutor).v()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (s.o(intent)) {
                                s.l("_nf", intent.getExtras());
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                c(new w51.q(extras));
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new SendException(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
        }
        if (this.w == null) {
        }
        bVar = this.w;
        if (bVar.c.n() >= 233700000) {
        }
    }

    public void c(w51.q qVar) {
    }

    public void d(String str) {
    }
}
