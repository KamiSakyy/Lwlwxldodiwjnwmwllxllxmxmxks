package r2;

import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f31095a;

    /* renamed from: b, reason: collision with root package name */
    public float f31096b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f31095a == aVar.f31095a && Float.compare(this.f31096b, aVar.f31096b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31096b) + (Long.hashCode(this.f31095a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f31095a);
        sb2.append(", dataPoint=");
        return i.i(sb2, this.f31096b, ')');
    }
}
