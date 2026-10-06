package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1 extends w1Shadow {
    public final Object a;

    public u1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && this.a.equals(((u1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.l(this.a, "StringListValue(value=", ")");
    }
}
