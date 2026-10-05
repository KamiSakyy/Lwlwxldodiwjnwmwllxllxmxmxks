package h91;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public f0 f;
    public f0 g;

    public f0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final f0 a() {
        f0 f0Var = this.f;
        if (f0Var == this) {
            f0Var = null;
        }
        f0 f0Var2 = this.g;
        k71.k.d(f0Var2);
        f0Var2.f = this.f;
        f0 f0Var3 = this.f;
        k71.k.d(f0Var3);
        f0Var3.g = this.g;
        this.f = null;
        this.g = null;
        return f0Var;
    }

    public final void b(f0 f0Var) {
        k71.k.g(f0Var, "segment");
        f0Var.g = this;
        f0Var.f = this.f;
        f0 f0Var2 = this.f;
        k71.k.d(f0Var2);
        f0Var2.g = f0Var;
        this.f = f0Var;
    }

    public final f0 c() {
        this.d = true;
        return new f0(this.a, this.b, this.c, true, false);
    }

    public final void d(f0 f0Var, int i) {
        k71.k.g(f0Var, "sink");
        byte[] bArr = f0Var.a;
        if (!f0Var.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = f0Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (f0Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = f0Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            x61.l.v(0, i4, i2, bArr, bArr);
            f0Var.c -= f0Var.b;
            f0Var.b = 0;
        }
        int i5 = f0Var.c;
        int i6 = this.b;
        x61.l.v(i5, i6, i6 + i, this.a, bArr);
        f0Var.c += i;
        this.b += i;
    }

    public f0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        k71.k.g(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
