package a61;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    public d1(Looper looper) {
        super(looper);
        this.c = new ArrayList();
    }

    public final void a() {
        t0 t0Var = (t0) ((i) ((s) k41.g.c().b(s.class))).k.get();
        q0 q0Var = ((y0) ((i) ((s) k41.g.c().b(s.class))).m.get()).e;
        if (q0Var == null) {
            k71.k.m("currentSession");
            throw null;
        }
        w0 w0Var = (w0) t0Var;
        w0Var.getClass();
        v71.b0.z(v71.b0.c(w0Var.e), (a71.h) null, (v71.a0) null, new u0(w0Var, q0Var, null), 3);
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Messenger messenger = (Messenger) obj;
            k71.k.f(messenger, "it");
            b(messenger);
        }
    }

    public final void b(Messenger messenger) {
        try {
            if (this.a) {
                q0 q0Var = ((y0) ((i) ((s) k41.g.c().b(s.class))).m.get()).e;
                if (q0Var != null) {
                    d(messenger, q0Var.a);
                    return;
                } else {
                    k71.k.m("currentSession");
                    throw null;
                }
            }
            v vVar = (v) ((o0) ((i) ((s) k41.g.c().b(s.class))).j.get()).c.get();
            String str = vVar != null ? vVar.a : null;
            if (str != null) {
                d(messenger, str);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void c() {
        try {
            y0 y0Var = (y0) ((i) ((s) k41.g.c().b(s.class))).m.get();
            int i = y0Var.d + 1;
            y0Var.d = i;
            String a = i == 0 ? y0Var.c : y0Var.a();
            String str = y0Var.c;
            int i2 = y0Var.d;
            y0Var.a.getClass();
            y0Var.e = new q0(a, str, i2, System.currentTimeMillis() * 1000);
            a();
            o0 o0Var = (o0) ((i) ((s) k41.g.c().b(s.class))).j.get();
            q0 q0Var = ((y0) ((i) ((s) k41.g.c().b(s.class))).m.get()).e;
            a71.c cVar = null;
            if (q0Var == null) {
                k71.k.m("currentSession");
                throw null;
            }
            String str2 = q0Var.a;
            o0Var.getClass();
            k71.k.g(str2, "sessionId");
            v71.b0.z(v71.b0.c(o0Var.a), (a71.h) null, (v71.a0) null, new n0(o0Var, str2, cVar, 0), 3);
        } catch (IllegalStateException unused) {
        }
    }

    public final void d(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Objects.toString(messenger);
            this.c.remove(messenger);
        } catch (Exception unused2) {
            Objects.toString(messenger);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (kotlin.time.a.f(r6) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (kotlin.time.a.f(r6) == false) goto L36;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        long n;
        k71.k.g(message, "msg");
        if (this.b > message.getWhen()) {
            message.getWhen();
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                message.getWhen();
                this.b = message.getWhen();
                return;
            }
            if (i != 4) {
                message.toString();
                super.handleMessage(message);
                return;
            }
            Messenger messenger = message.replyTo;
            ArrayList arrayList = this.c;
            arrayList.add(messenger);
            Messenger messenger2 = message.replyTo;
            k71.k.f(messenger2, "msg.replyTo");
            b(messenger2);
            Objects.toString(message.replyTo);
            message.getWhen();
            arrayList.size();
            return;
        }
        message.getWhen();
        if (this.a) {
            long when = message.getWhen() - this.b;
            e61.g gVar = (e61.g) ((i) ((s) k41.g.c().b(s.class))).h.get();
            kotlin.time.a b = gVar.a.b();
            if (b != null) {
                n = b.r;
                int i2 = kotlin.time.a.u;
                if (n > 0) {
                }
            }
            kotlin.time.a b2 = gVar.b.b();
            if (b2 != null) {
                n = b2.r;
                int i3 = kotlin.time.a.u;
                if (n > 0) {
                }
            }
            int i4 = kotlin.time.a.u;
            n = kotlin.time.e.n(30, kotlin.time.c.v);
            if (when > kotlin.time.a.d(n)) {
                c();
            }
        } else {
            this.a = true;
            c();
        }
        this.b = message.getWhen();
    }







}
