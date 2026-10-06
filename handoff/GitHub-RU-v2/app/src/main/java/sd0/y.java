package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y {
    public u a;
    public String b;

    public y(u uVar, String str) {
        this.a = uVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b);
    }

    public final int hashCode() {
        u uVar = this.a;
        return this.b.hashCode() + ((uVar == null ? 0 : uVar.hashCode()) * 31);
    }

    public final String toString() {
        return "OnCommit(file=" + this.a + ", id=" + this.b + ")";
    }
}
