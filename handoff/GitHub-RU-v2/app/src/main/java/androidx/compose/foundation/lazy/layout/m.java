package androidx.compose.foundation.lazy.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f1434a;

    /* renamed from: b, reason: collision with root package name */
    public int f1435b;

    public m(int i, int i10) {
        this.f1434a = i;
        this.f1435b = i10;
        if (!(i >= 0)) {
            k0.b.a("negative start index");
        }
        if (i10 >= i) {
            return;
        }
        k0.b.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1434a == mVar.f1434a && this.f1435b == mVar.f1435b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1435b) + (Integer.hashCode(this.f1434a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f1434a);
        sb2.append(", end=");
        return x.i.j(sb2, this.f1435b, ')');
    }
}
