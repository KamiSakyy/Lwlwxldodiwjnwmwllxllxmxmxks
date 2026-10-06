package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aa.v0 {
    public g a;

    public e(g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        g gVar = this.a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
