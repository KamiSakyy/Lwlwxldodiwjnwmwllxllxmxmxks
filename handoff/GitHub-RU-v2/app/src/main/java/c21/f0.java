package c21;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import com.google.android.gms.cloudmessaging.zzt;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 implements Handler.Callback {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ f0(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        View.OnLongClickListener onLongClickListener;
        switch (this.r) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    g0 g0Var = (g0) this.s;
                    synchronized (g0Var.a) {
                        try {
                            d0 d0Var = (d0) message.obj;
                            e0 e0Var = (e0) g0Var.a.get(d0Var);
                            if (e0Var != null && e0Var.r.isEmpty()) {
                                if (e0Var.t) {
                                    d0 d0Var2 = e0Var.v;
                                    g0 g0Var2 = e0Var.x;
                                    g0Var2.c.removeMessages(1, d0Var2);
                                    g0Var2.d.c(g0Var2.b, e0Var);
                                    e0Var.t = false;
                                    e0Var.s = 2;
                                }
                                g0Var.a.remove(d0Var);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i != 1) {
                        return false;
                    }
                    g0 g0Var3 = (g0) this.s;
                    synchronized (g0Var3.a) {
                        try {
                            d0 d0Var3 = (d0) message.obj;
                            e0 e0Var2 = (e0) g0Var3.a.get(d0Var3);
                            if (e0Var2 != null && e0Var2.s == 3) {
                                new StringBuilder(String.valueOf(d0Var3).length() + 47);
                                new Exception();
                                ComponentName componentName = e0Var2.w;
                                if (componentName == null) {
                                    d0Var3.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = d0Var3.b;
                                    u.g(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                e0Var2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
            case 1:
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.s;
                if (message.what == 1 && (onLongClickListener = subsamplingScaleImageView.v0) != null) {
                    subsamplingScaleImageView.d0 = 0;
                    super/*android.view.View*/.setOnLongClickListener(onLongClickListener);
                    subsamplingScaleImageView.performLongClick();
                    super/*android.view.View*/.setOnLongClickListener(null);
                }
                return true;
            case 2:
                if (message.what != 0) {
                    return false;
                }
                w51.r rVar = (w51.r) this.s;
                w31.m mVar = (w31.m) message.obj;
                synchronized (rVar.s) {
                    if (((w31.m) rVar.u) == mVar || ((w31.m) rVar.v) == mVar) {
                        rVar.n(mVar, 2);
                    }
                }
                return true;
            default:
                int i2 = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                y11.j jVar = (y11.j) this.s;
                synchronized (jVar) {
                    try {
                        y11.k kVar = (y11.k) jVar.v.get(i2);
                        if (kVar == null) {
                            return true;
                        }
                        jVar.v.remove(i2);
                        jVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            kVar.b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (kVar.e) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    kVar.b(new zzt("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    kVar.toString();
                                }
                                kVar.b.a(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    kVar.toString();
                                    String.valueOf(bundle);
                                }
                                kVar.b.a(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
