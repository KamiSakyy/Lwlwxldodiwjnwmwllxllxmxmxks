package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 extends k1 {
    public byte[] t;
    public int u;
    public int v;

    public j1(byte[] bArr, int i, int i2) {
        k1.j(i, i + i2, bArr.length);
        this.t = bArr;
        this.u = i;
        this.v = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final byte a(int i) {
        int i2 = this.v;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.t[this.u + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(no.a.k("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(no.a.j(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final byte b(int i) {
        return this.t[this.u + i];
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final int d(int i, int i2) {
        return z1.a(i, this.t, this.u, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final int e() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final k1 f(int i, int i2) {
        int j = k1.j(i, i2, this.v);
        if (j == 0) {
            return k1.s;
        }
        return new j1(this.t, this.u + i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final void g(m1 m1Var) {
        m1Var.n0(this.t, this.u, this.v);
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final boolean i(k1 k1Var) {
        boolean z = k1Var instanceof l1;
        if (!z && !(k1Var instanceof j1)) {
            return k1Var.i(this);
        }
        int e = k1Var.e();
        int i = this.v;
        if (i > e) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > k1Var.e()) {
            throw new IllegalArgumentException(no.a.j(i, k1Var.e(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.t;
        int i2 = this.u;
        if (z) {
            return k1.l(i2, 0, i, bArr, ((l1) k1Var).t);
        }
        if (!(k1Var instanceof j1)) {
            return k1Var.f(0, i).equals(f(i2, i + i2));
        }
        j1 j1Var = (j1) k1Var;
        return k1.l(i2, j1Var.u, i, bArr, j1Var.t);
    }
}
