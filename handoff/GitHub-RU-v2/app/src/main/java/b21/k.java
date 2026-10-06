package b21;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kShadow {
    public a a;
    public z11.d b;

    public /* synthetic */ k(a aVar, z11.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof kShadow)) {
            kShadow kVar = (kShadow) obj;
            if (c21.uShadow.j(this.a, kVar.a) && c21.uShadow.j(this.b, kVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        b1.m mVar = new b1.m(this);
        mVar.a(this.a, "key");
        mVar.a(this.b, "feature");
        return mVar.toString();
    }


















































    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b {
        public b() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c {
        public c() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d {
        public d() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e {
        public e() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g {
        public g() {
        }
    }
}
