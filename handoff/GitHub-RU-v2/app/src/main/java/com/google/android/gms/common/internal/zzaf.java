package com.google.android.gms.common.internal;

import c21.uShadow;
import z11.b;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zzaf extends Exception {
    public b r;

    public zzaf(b bVar) {
        uShadow.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.s == 0 || bVar.t == null) ? false : true);
        this.r = bVar;
    }
}
