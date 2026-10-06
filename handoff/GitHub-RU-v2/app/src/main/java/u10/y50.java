package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y50 {
    public List a;

    public y50(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y50) && k71.k.b(this.a, ((y50) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("TimelineItems(nodes=", ")", this.a);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }
}
