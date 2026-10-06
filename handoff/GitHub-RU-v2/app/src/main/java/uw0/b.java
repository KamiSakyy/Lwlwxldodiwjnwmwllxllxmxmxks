package uw0;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k71.k.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        d dVar = this.a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "CreateUserList(list=" + this.a + ")";
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
