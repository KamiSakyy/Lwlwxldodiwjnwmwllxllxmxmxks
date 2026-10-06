package s3;

import a0.s0;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f31698e = new k(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f31699a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31700b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31701c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31702d;

    public k(int i, int i10, int i11, int i12) {
        this.f31699a = i;
        this.f31700b = i10;
        this.f31701c = i11;
        this.f31702d = i12;
    }

    public final long a() {
        return (((b() / 2) + this.f31700b) & 4294967295L) | (((d() / 2) + this.f31699a) << 32);
    }

    public final int b() {
        return this.f31702d - this.f31700b;
    }

    public final long c() {
        return (this.f31699a << 32) | (this.f31700b & 4294967295L);
    }

    public final int d() {
        return this.f31701c - this.f31699a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f31699a == kVar.f31699a && this.f31700b == kVar.f31700b && this.f31701c == kVar.f31701c && this.f31702d == kVar.f31702d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31702d) + s0.b(this.f31701c, s0.b(this.f31700b, Integer.hashCode(this.f31699a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f31699a);
        sb2.append(", ");
        sb2.append(this.f31700b);
        sb2.append(", ");
        sb2.append(this.f31701c);
        sb2.append(", ");
        return x.i.j(sb2, this.f31702d, ')');
    }
}
