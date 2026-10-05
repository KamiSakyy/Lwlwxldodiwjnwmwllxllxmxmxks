package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p4 {
    public static final x.e a = new x.e(0);

    public static synchronized void a() {
        synchronized (p4.class) {
            x.e eVar = a;
            Iterator it = eVar.values().iterator();
            if (it.hasNext()) {
                ((p4) it.next()).getClass();
                throw null;
            }
            eVar.clear();
        }
    }
}
