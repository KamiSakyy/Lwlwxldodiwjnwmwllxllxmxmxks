package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public interface j {

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7655a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -5145742;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final p4 f7656a;

        public b(p4 p4Var) {
            this.f7656a = p4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f7656a == ((b) obj).f7656a;
        }

        public final int hashCode() {
            return this.f7656a.hashCode();
        }

        public final String toString() {
            return "NotSteerable(reason=" + this.f7656a + ")";
        }
    }

    public static final class c implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7657a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1538786275;
        }

        public final String toString() {
            return "Steerable";
        }
    }
}
