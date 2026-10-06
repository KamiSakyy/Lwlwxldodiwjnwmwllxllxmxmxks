package gy0;

import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 {
    public List a;

    public a0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && k71.k.b(this.a, ((a0) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return m0.h("Groups(nodes=", ")", this.a);
    }
}
