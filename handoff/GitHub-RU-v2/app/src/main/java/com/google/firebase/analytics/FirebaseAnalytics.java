package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c21.u;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.measurement.internal.u2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k41.g;
import l41.b;
import q51.c;
import q51.d;
import t.q;

/* loaded from: /home/user/work/p/classes4.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final k1 a;

    public FirebaseAnalytics(k1 k1Var) {
        u.g(k1Var);
        this.a = k1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(k1.c(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static u2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        k1 c = k1.c(context, bundle);
        if (c == null) {
            return null;
        }
        return new b(c);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = c.m;
            return (String) q.d(((c) g.c().b(d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        w0 j = w0.j(activity);
        k1 k1Var = this.a;
        k1Var.getClass();
        k1Var.a(new y0(k1Var, j, str, str2));
    }
}
