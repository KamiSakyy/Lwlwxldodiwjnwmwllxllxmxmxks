package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 extends ContentObserver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b51.dShadow dVar) {
        super(null);
        Objects.requireNonNull(dVar);
        this.b = dVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 3:
                ((x71.hShadow) this.b).j(w61.a0.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(e4 e4Var) {
        super(null);
        this.b = e4Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                ((AtomicBoolean) ((b51.dShadow) this.b).a).set(true);
                return;
            case 1:
                e4 e4Var = (e4) this.b;
                synchronized (e4Var.f) {
                    e4Var.g = null;
                    e4Var.c.run();
                }
                synchronized (e4Var) {
                    try {
                        Iterator it = e4Var.h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                q.t2 t2Var = (q.t2) this.b;
                if (!((g5.a) t2Var).s || (cursor = ((g5.a) t2Var).t) == null || cursor.isClosed()) {
                    return;
                }
                ((g5.a) t2Var).r = ((g5.a) t2Var).t.requery();
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(x71.hShadow hVar, Handler handler) {
        super(handler);
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(q.t2 t2Var) {
        super(new Handler());
        this.b = t2Var;
    }
}
