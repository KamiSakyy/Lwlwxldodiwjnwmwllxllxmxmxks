package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class di {
    public int a;
    public List b;

    public di(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return this.a == diVar.a && k71.k.b(this.b, diVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "Users(userCount=", ", nodes=", ")", this.b);
    }
}
