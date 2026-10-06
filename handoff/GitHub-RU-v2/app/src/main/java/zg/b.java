package zg;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public int a;
    public String b;

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
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object B(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public static Object x(Object p1, Object p2) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4) { return null; }
    public Object c(Object p1, Object p2, Object p3, Object p4, int p5, int p6, Object p7, Object p8, int p9, int p10) { return null; }
}
