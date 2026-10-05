package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class o1 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final w1.i f25398a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25399b;

    public o1(w1.i iVar, int i) {
        this.f25398a = iVar;
        this.f25399b = i;
    }

    @Override // h1.x0
    public final int a(s3.k kVar, long j10, int i) {
        int i10 = (int) (j10 & 4294967295L);
        int i11 = this.f25399b;
        if (i < i10 - (i11 * 2)) {
            return aa1.b.v(this.f25398a.a(i, i10), i11, (i10 - i11) - i);
        }
        return Math.round((1 + 0.0f) * ((i10 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f25398a.equals(o1Var.f25398a) && this.f25399b == o1Var.f25399b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25399b) + (Float.hashCode(this.f25398a.f32938a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f25398a);
        sb2.append(", margin=");
        return x.i.j(sb2, this.f25399b, ')');
    }
}
