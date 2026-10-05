package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g1 {
    protected transient int zza;

    public abstract void a(m1 m1Var);

    public final byte[] b() {
        try {
            int d = d();
            byte[] bArr = new byte[d];
            m1 m1Var = new m1(d, bArr);
            a(m1Var);
            if (d - m1Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(f1.e.z("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int c(o2 o2Var);

    public abstract int d();
}
