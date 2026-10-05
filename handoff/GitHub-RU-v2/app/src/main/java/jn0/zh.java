package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zh {
    public final int a;
    public final List b;

    public zh(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) obj;
        return this.a == zhVar.a && k71.k.b(this.b, zhVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Organizations(userCount=", ", nodes=", ")", this.b);
    }
}
