package com.github.rudroid.shortcuts;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q implements le.z {
    public static final a Companion = new a();
    public int r;
    public String s;

    public static final class a {
    }

    public static final class b extends q {
        public static final b t = new b("Create", 0);
    }

    public static final class c extends q {
        public static final c t = new c("Empty", 1);
    }

    public static final class d extends q {
        public int t;

        public d(int i) {
            super(no.a.k("Header", i), 2);
            this.t = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.t == ((d) obj).t;
        }

        public final int hashCode() {
            return Integer.hashCode(this.t);
        }

        public final String toString() {
            return a0.s0.i("Header(titleRes=", this.t, ")");
        }
    }

    public static final class e extends q {
        public wm.b t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wm.b bVar) {
            super("SavedShortcut" + bVar.g(), 3);
            k71.k.g(bVar, "shortcut");
            this.t = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.t, ((e) obj).t);
        }

        public final int hashCode() {
            return this.t.hashCode();
        }

        public final String toString() {
            return "SavedShortcut(shortcut=" + this.t + ")";
        }
    }

    public static final class f extends q {
        public wm.b t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(wm.b bVar) {
            super("SuggestedShortcut" + bVar.g(), 4);
            k71.k.g(bVar, "suggestion");
            this.t = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && k71.k.b(this.t, ((f) obj).t);
        }

        public final int hashCode() {
            return this.t.hashCode();
        }

        public final String toString() {
            return "SuggestedShortcut(suggestion=" + this.t + ")";
        }
    }

    public q(String str, int i) {
        this.r = i;
        this.s = str;
    }

    public final String E() {
        return this.s;
    }
}
