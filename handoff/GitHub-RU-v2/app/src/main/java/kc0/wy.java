package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wy implements aaShadow.v0 {
    public final ez a;
    public final fz b;

    public wy(ez ezVar, fz fzVar) {
        this.a = ezVar;
        this.b = fzVar;
    }

    public static wy a(wy wyVar, ez ezVar, fz fzVar, int i) {
        if ((i & 1) != 0) {
            ezVar = wyVar.a;
        }
        if ((i & 2) != 0) {
            fzVar = wyVar.b;
        }
        wyVar.getClass();
        return new wy(ezVar, fzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) obj;
        return k71.k.b(this.a, wyVar.a) && k71.k.b(this.b, wyVar.b);
    }

    public final int hashCode() {
        ez ezVar = this.a;
        return this.b.hashCode() + ((ezVar == null ? 0 : ezVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Data(repository=" + this.a + ", search=" + this.b + ")";
    }
}
