package l11;

import com.github.rudroid.m0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m extends w {
    public final ArrayList a;

    public m(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return this.a.equals(((m) ((w) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return m0.j("}", new StringBuilder("BatchedLogRequest{logRequests="), this.a);
    }
}
