package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w80 {
    public u80 a;
    public String b;
    public String c;

    public w80(u80 u80Var, String str, String str2) {
        this.a = u80Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return k71.k.b(this.a, w80Var.a) && k71.k.b(this.b, w80Var.b) && k71.k.b(this.c, w80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(contributionsCollection=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }


















































    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a2 {
        public a2() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c1 {
        public c1() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h {
        public h() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h0 {
        public h0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m3 {
        public m3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q3 {
        public q3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class v3 {
        public v3() {
        }
    }
}
