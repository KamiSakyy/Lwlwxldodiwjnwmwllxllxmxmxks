package com.github.rudroid.starredreposandlists.bottomsheet;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {

    public static final class a extends i {
        public static final a a = new a();
    }

    public static final class b extends i {
        public final v a;

        public b(v vVar) {
            this.a = vVar;
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
            return "ListItem(listSelectionData=" + this.a + ")";
        }
    }

    public static final class c extends i {
        public static final c a = new c();
    }
}
