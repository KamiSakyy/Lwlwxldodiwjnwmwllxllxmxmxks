package zg;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final int a;
    public final String b;

    public b(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && k71.k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CommitDetails(commitsCount=" + this.a + ", lastCommitDate=" + this.b + ")";
    }
}
