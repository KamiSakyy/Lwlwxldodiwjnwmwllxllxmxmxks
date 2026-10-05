package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public final String a;

    public v(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && k71.k.b(this.a, ((v) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a0.s0.m(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}
