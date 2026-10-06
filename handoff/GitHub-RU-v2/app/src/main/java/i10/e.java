package i10;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public String a;

    public e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("ApproveMobileAuthDeviceRequest(clientMutationId=", this.a, ")");
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
