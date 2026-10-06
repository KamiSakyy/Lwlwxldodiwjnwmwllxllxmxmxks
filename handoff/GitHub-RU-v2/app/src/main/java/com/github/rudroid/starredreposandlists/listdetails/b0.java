package com.github.rudroid.starredreposandlists.listdetails;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b0 {

    public static final class a extends b0 {
        public y0 a;

        public a(y0 y0Var) {
            this.a = y0Var;
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
            return "Header(listHeaderData=" + this.a + ")";
        }
    }

    public static final class b extends b0 {
        public p01.n a;

        public b(p01.n nVar) {
            k71.k.g(nVar, "repo");
            this.a = nVar;
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
            return "RepoItem(repo=" + this.a + ")";
        }
    }
}
