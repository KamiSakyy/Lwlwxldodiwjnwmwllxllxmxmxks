package rh;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends f {

    public static final class a implements e {
        public final fl.b a;

        public a(fl.b bVar) {
            k71.k.g(bVar, "executionError");
            this.a = bVar;
        }

        @Override // rh.f
        public final fl.b a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && k71.k.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(2131952512) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "InsufficientScopesError(executionError=" + this.a + ", message=2131952512)";
        }
    }

    public static final class b implements d {
        public final fl.b a;

        public b(fl.b bVar) {
            k71.k.g(bVar, "executionError");
            this.a = bVar;
        }

        @Override // rh.f
        public final fl.b a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k71.k.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(2131952512) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SAMLError(executionError=" + this.a + ", message=2131952512)";
        }
    }

    public static final class c implements d {
        public final fl.b a;

        public c(fl.b bVar) {
            k71.k.g(bVar, "executionError");
            this.a = bVar;
        }

        @Override // rh.f
        public final fl.b a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(2131952512) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UserSwitchError(executionError=" + this.a + ", message=2131952512)";
        }
    }
    public d() {
    }

    public d(Object p1) {
    }

    public d(Object p1, Object p2) {
    }

    public d(Object p1, Object p2, Object p3) {
    }

    public d(Object p1, Object p2, Object p3, Object p4) {
    }

    public d(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
    }

    public d(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10) {
    }
}
