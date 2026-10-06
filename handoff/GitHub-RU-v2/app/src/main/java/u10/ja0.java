package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ja0 {
    public final boolean a;
    public final String b;
    public final String c;

    public ja0(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        return this.a == ja0Var.a && k71.k.b(this.b, ja0Var.b) && k71.k.b(this.c, ja0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.copilot.h1.t("Viewer(isEmployee=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }
}
