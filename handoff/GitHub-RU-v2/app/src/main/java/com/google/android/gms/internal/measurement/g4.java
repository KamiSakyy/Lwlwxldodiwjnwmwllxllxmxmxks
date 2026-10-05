package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g4 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        m4.i.incrementAndGet();
    }
}
