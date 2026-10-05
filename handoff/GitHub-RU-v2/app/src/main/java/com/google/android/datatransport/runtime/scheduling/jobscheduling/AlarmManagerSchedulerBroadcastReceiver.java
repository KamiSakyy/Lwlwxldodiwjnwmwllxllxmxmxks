package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Base64;
import com.github.rudroid.fragments.i4;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import d51.d;
import java.util.concurrent.Executor;
import l51.h;
import m11.j;
import m11.s;
import w11.a;
import w2.f0;
import w2.t;
import x.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        h a2 = j.a();
        a2.J(queryParameter);
        a2.u = a.b(intValue);
        if (queryParameter2 != null) {
            a2.t = Base64.decode(queryParameter2, 0);
        }
        d dVar = s.a().d;
        final int i2 = 0;
        ((Executor) dVar.e).execute(new i4(dVar, a2.i(), i, new Runnable() { // from class: s11.a
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        int i3 = AlarmManagerSchedulerBroadcastReceiver.a;
                        return;
                    default:
                        d0 d0Var = t.e1;
                        synchronized (d0Var) {
                            try {
                                int i4 = 0;
                                if (Build.VERSION.SDK_INT < 30) {
                                    Object[] objArr = d0Var.a;
                                    int i5 = d0Var.b;
                                    while (i4 < i5) {
                                        t tVar = (t) objArr[i4];
                                        boolean showLayoutBounds = tVar.getShowLayoutBounds();
                                        Class cls = t.b1;
                                        tVar.setShowLayoutBounds(f0.u());
                                        if (showLayoutBounds != tVar.getShowLayoutBounds()) {
                                            t.l(tVar.getRoot());
                                        }
                                        i4++;
                                    }
                                } else {
                                    Object[] objArr2 = d0Var.a;
                                    int i6 = d0Var.b;
                                    while (i4 < i6) {
                                        t.l(((t) objArr2[i4]).getRoot());
                                        i4++;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                }
            }
        }));
    }
}
