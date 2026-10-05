package com.github.rudroid.fileschanged.ui;

/* loaded from: /home/user/work/p/classes.dex */
public interface b0 {

    public static final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f13510a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13511b;

        public a(m0 m0Var, String str) {
            k71.k.g(str, "header");
            this.f13510a = m0Var;
            this.f13511b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13510a == aVar.f13510a && k71.k.b(this.f13511b, aVar.f13511b);
        }

        public final int hashCode() {
            return this.f13511b.hashCode() + (this.f13510a.hashCode() * 31);
        }

        public final String toString() {
            return "Hunk(direction=" + this.f13510a + ", header=" + this.f13511b + ")";
        }
    }

    public static final class b implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final m f13512a;

        public b(m mVar) {
            this.f13512a = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k71.k.b(this.f13512a, ((b) obj).f13512a);
        }

        public final int hashCode() {
            return this.f13512a.hashCode();
        }

        public final String toString() {
            return "Line(diffLine=" + this.f13512a + ")";
        }
    }
}
