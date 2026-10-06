package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aaShadow {
    public final String a;
    public final y9 b;
    public final String c;

    public aa(String str, y9 y9Var, String str2) {
        this.a = str;
        this.b = y9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaShadow)) {
            return false;
        }
        aaShadow aaVar = (aaShadow) obj;
        return k71.k.b(this.a, aaVar.a) && k71.k.b(this.b, aaVar.b) && k71.k.b(this.c, aaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y9 y9Var = this.b;
        return this.c.hashCode() + ((hashCode + (y9Var == null ? 0 : y9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
































































    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m {
        public m() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m0 {
        public m0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class n0 {
        public n0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0 {
        public p0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0 {
        public q0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class u0 {
        public u0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class v0 {
        public v0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w {
        public w() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w0 {
        public w0() {
        }
    }
}
