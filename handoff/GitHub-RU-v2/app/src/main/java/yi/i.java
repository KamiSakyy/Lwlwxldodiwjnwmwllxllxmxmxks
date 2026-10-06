package yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public int a;
    public String b;

    public i(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && k71.k.b(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "IDPair(id=" + this.a + ", gid=" + this.b + ")";
    }
}
