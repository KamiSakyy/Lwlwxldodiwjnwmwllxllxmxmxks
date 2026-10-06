package k81;

import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m0 implements r71.f {
    public r71.f a;

    public m0(r71.f fVar) {
        k71.k.g(fVar, "origin");
        this.a = fVar;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final List b() {
        return this.a.b();
    }

    public final r71.b c() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        m0 m0Var = obj instanceof m0 ? (m0) obj : null;
        r71.f fVar = m0Var != null ? m0Var.a : null;
        r71.f fVar2 = this.a;
        if (!k71.k.b(fVar2, fVar)) {
            return false;
        }
        r71.b c = fVar2.c();
        if (!(c instanceof r71.b)) {
            return false;
        }
        r71.f fVar3 = obj instanceof r71.f ? (r71.f) obj : null;
        r71.b c2 = fVar3 != null ? fVar3.c() : null;
        if (c2 == null || !(c2 instanceof r71.b)) {
            return false;
        }
        return v8.l0.x(c).equals(v8.l0.x(c2));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
