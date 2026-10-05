package d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f21417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21418b;

    public d(int i, int i10) {
        this.f21417a = i;
        this.f21418b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21417a == dVar.f21417a && this.f21418b == dVar.f21418b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21418b) + (Integer.hashCode(this.f21417a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f21417a);
        sb2.append(", columnCount=");
        return x.i.j(sb2, this.f21418b, ')');
    }
}
