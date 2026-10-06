package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c40 implements aaShadow.m0 {
    public final e40 a;

    public c40(e40 e40Var) {
        this.a = e40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c40) && k71.k.b(this.a, ((c40) obj).a);
    }

    public final int hashCode() {
        e40 e40Var = this.a;
        if (e40Var == null) {
            return 0;
        }
        return e40Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c {
        public c() {
        }
    }
}
