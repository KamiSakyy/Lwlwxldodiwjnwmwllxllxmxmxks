package androidx.compose.foundation.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1207a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1208b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1210d;

    public o1(int i, int i10, int i11, int i12) {
        this.f1207a = i;
        this.f1208b = i10;
        this.f1209c = i11;
        this.f1210d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f1207a == o1Var.f1207a && this.f1208b == o1Var.f1208b && this.f1209c == o1Var.f1209c && this.f1210d == o1Var.f1210d;
    }

    public final int hashCode() {
        return (((((this.f1207a * 31) + this.f1208b) * 31) + this.f1209c) * 31) + this.f1210d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f1207a);
        sb2.append(", top=");
        sb2.append(this.f1208b);
        sb2.append(", right=");
        sb2.append(this.f1209c);
        sb2.append(", bottom=");
        return x.i.j(sb2, this.f1210d, ')');
    }
}
