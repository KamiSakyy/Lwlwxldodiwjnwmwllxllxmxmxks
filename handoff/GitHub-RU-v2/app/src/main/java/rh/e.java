package rh;

/* loaded from: /home/user/work/p/classes3.dex */
public interface e extends f {

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
            return this.a.hashCode();
        }

        public final String toString() {
            return "ServerVersionError(executionError=" + this.a + ")";
        }
    }

    public static final class b implements e {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return "UnauthorizedError(executionError=" + this.a + ")";
        }
    }
}
