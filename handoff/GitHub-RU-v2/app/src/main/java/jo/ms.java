package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ms {
    public int a;
    public List b;

    public ms(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return this.a == msVar.a && k71.k.b(this.b, msVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Mentioned(issueCount=", ", nodes=", ")", this.b);
    }





























    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d0 {
        public d0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i {
        public i() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class o {
        public o() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class v {
        public v() {
        }
    }
}
