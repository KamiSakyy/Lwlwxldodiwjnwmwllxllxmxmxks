package com.github.rudroid.viewmodels;

/* loaded from: /home/user/work/p/classes3.dex */
public interface i7 {

    public static final class a {
        public static final C0013a Companion = new C0013a();
        public static final a c = new a(null, false);
        public boolean a;
        public String b;

        /* renamed from: com.github.rudroid.viewmodels.i7$a$a, reason: collision with other inner class name */
        public static final class C0013a {
        }

        public a(String str, boolean z) {
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && k71.k.b(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return com.github.rudroid.m0.f("Page(hasMorePages=", ", cursor=", this.b, ")", this.a);
        }
    }
}
