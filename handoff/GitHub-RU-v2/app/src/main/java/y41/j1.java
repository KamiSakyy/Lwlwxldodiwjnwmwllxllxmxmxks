package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 extends l2 {
    public String a;

    public j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        return this.a.equals(((j1) ((l2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(new StringBuilder("User{identifier="), this.a, "}");
    }
}
