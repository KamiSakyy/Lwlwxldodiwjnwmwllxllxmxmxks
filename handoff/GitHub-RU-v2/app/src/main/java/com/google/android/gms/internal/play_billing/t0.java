package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 {
    public final n a = new n();
    public String b;
    public volatile Logger c;

    public t0(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
