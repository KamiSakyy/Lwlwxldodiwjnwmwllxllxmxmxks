package y41;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 extends i2 {
    public final List a;

    public g1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.a.equals(((g1) ((i2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return x.i.l(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}
