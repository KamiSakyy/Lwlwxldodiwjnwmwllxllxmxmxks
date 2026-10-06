package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 {
    public static final Object f = new Object();
    public String a;
    public x b;
    public Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ b0(String str, Object obj, x xVar) {
        this.a = str;
        this.c = obj;
        this.b = xVar;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (c2.k == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (w80.w3.e()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (b0 b0Var : c0.a) {
                        if (w80.w3.e()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            x xVar = b0Var.b;
                            if (xVar != null) {
                                obj2 = xVar.c();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            b0Var.e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                x xVar2 = this.b;
                if (xVar2 != null) {
                    try {
                        return xVar2.c();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } finally {
            }
        }
    }
}
