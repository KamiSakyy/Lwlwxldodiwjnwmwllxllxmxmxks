package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 extends f2 {
    public final String a;

    public c1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.a.equals(((c1) ((f2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(new StringBuilder("Log{content="), this.a, "}");
    }
}
