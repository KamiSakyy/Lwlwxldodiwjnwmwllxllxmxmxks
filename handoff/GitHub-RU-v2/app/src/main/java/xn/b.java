package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public String a;
    public Long b;
    public String c;
    public String d;
    public String e;

    public b(String str, Long l, String str2, String str3, String str4) {
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentTaskArtifactData(globalId=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", type=");
        f1.e.x(sb, this.c, ", baseRef=", this.d, ", headRef=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
    public static Object B(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
}
