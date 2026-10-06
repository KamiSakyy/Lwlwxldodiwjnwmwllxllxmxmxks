package i60;

import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final List a;

    public a(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k71.k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return m0.h("AllClosingIssueReferences(nodes=", ")", this.a);
    }
}
