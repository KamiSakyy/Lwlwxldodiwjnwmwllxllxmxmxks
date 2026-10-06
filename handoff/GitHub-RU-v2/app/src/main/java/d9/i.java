package d9;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f21696a;

    /* renamed from: b, reason: collision with root package name */
    public int f21697b;

    public i(String str, int i) {
        k71.k.g(str, "workSpecId");
        this.f21696a = str;
        this.f21697b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.f21696a, iVar.f21696a) && this.f21697b == iVar.f21697b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21697b) + (this.f21696a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f21696a);
        sb2.append(", generation=");
        return x.i.j(sb2, this.f21697b, ')');
    }
    public Object a = null;
    public i(Object p1, Object p2) {
    }
}
