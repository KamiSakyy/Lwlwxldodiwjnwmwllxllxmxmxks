package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 extends k1 {
    public byte[] t;

    public l1(byte[] bArr) {
        bArr.getClass();
        this.t = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final byte a(int i) {
        return this.t[i];
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final byte b(int i) {
        return this.t[i];
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final int d(int i, int i2) {
        return z1.a(i, this.t, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final int e() {
        return this.t.length;
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final k1 f(int i, int i2) {
        byte[] bArr = this.t;
        int j = k1.j(0, i2, bArr.length);
        return j == 0 ? k1.s : new j1(bArr, 0, j);
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final void g(m1 m1Var) {
        byte[] bArr = this.t;
        m1Var.n0(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final boolean i(k1 k1Var) {
        boolean z = k1Var instanceof l1;
        byte[] bArr = this.t;
        if (z) {
            return Arrays.equals(bArr, ((l1) k1Var).t);
        }
        boolean z2 = k1Var instanceof j1;
        if (!z2) {
            return k1Var.i(this);
        }
        j1 j1Var = (j1) k1Var;
        int i = j1Var.v;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            throw new IllegalArgumentException(no.a.j(length, i, "Ran off end of other: 0, ", ", "));
        }
        if (z) {
            return k1.l(0, 0, length, bArr, ((l1) k1Var).t);
        }
        if (!z2) {
            return k1Var.f(0, length).equals(f(0, length));
        }
        return k1.l(0, j1Var.u, length, bArr, j1Var.t);
    }
}
