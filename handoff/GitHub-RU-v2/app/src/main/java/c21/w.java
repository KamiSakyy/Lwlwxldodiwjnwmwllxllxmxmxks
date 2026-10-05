package c21;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w extends com.google.android.gms.internal.measurement.h0 {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e eVar, Looper looper) {
        super(looper, 3);
        this.a = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        p pVar;
        e eVar = this.a;
        if (eVar.w.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (pVar = (p) message.obj) != null) {
                synchronized (pVar) {
                    pVar.a = null;
                }
                e eVar2 = pVar.c;
                synchronized (eVar2.l) {
                    eVar2.l.remove(pVar);
                }
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !eVar.c()) {
            p pVar2 = (p) message.obj;
            if (pVar2 != null) {
                synchronized (pVar2) {
                    pVar2.a = null;
                }
                e eVar3 = pVar2.c;
                synchronized (eVar3.l) {
                    eVar3.l.remove(pVar2);
                }
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            eVar.t = new z11.b(message.arg2, null, null);
            if (!eVar.u && !TextUtils.isEmpty(eVar.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.v());
                    if (!eVar.u) {
                        eVar.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            z11.b bVar = eVar.t;
            if (bVar == null) {
                bVar = new z11.b(8, null, null);
            }
            eVar.j.d(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 5) {
            z11.b bVar2 = eVar.t;
            if (bVar2 == null) {
                bVar2 = new z11.b(8, null, null);
            }
            eVar.j.d(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            eVar.j.d(new z11.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i3 == 6) {
            eVar.z(5, null);
            b bVar3 = eVar.o;
            if (bVar3 != null) {
                bVar3.e(message.arg2);
            }
            System.currentTimeMillis();
            eVar.y(5, 1, null);
            return;
        }
        if (i3 == 2 && !eVar.g()) {
            p pVar3 = (p) message.obj;
            if (pVar3 != null) {
                synchronized (pVar3) {
                    pVar3.a = null;
                }
                e eVar4 = pVar3.c;
                synchronized (eVar4.l) {
                    eVar4.l.remove(pVar3);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i4);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        p pVar4 = (p) message.obj;
        synchronized (pVar4) {
            try {
                bool = pVar4.a;
                if (pVar4.b) {
                    new StringBuilder(pVar4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            e eVar5 = pVar4.f;
            int i5 = pVar4.d;
            if (i5 != 0) {
                eVar5.z(1, null);
                Bundle bundle = pVar4.e;
                pVar4.b(new z11.b(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!pVar4.a()) {
                eVar5.z(1, null);
                pVar4.b(new z11.b(8, null, null));
            }
        }
        synchronized (pVar4) {
            pVar4.b = true;
        }
        synchronized (pVar4) {
            pVar4.a = null;
        }
        e eVar6 = pVar4.c;
        synchronized (eVar6.l) {
            eVar6.l.remove(pVar4);
        }
    }
}
