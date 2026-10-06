package com.github.rudroid.utilities;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 {
    public final t71.n a = new t71.n("(^[a-zA-Z\\-\\d]+)(/[\\w\\-\\d.]+)?(#\\d+)?$");

    public static abstract class a {

        /* renamed from: com.github.rudroid.utilities.j2$a$a, reason: collision with other inner class name */
        public static final class C0011a extends a {
            public final String a;
            public final String b;
            public final int c;

            public C0011a(String str, int i, String str2) {
                k71.k.g(str, "owner");
                this.a = str;
                this.b = str2;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0011a)) {
                    return false;
                }
                C0011a c0011a = (C0011a) obj;
                return k71.k.b(this.a, c0011a.a) && k71.k.b(this.b, c0011a.b) && this.c == c0011a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
            }

            public final String toString() {
                return a0.s0.l(a0.s0.o("Issue(owner=", this.a, ", repo=", this.b, ", number="), this.c, ")");
            }
        }

        public static final class b extends a {
            public final String a;
            public final String b;

            public b(String str, String str2) {
                k71.k.g(str, "owner");
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return x.i.g("Repo(owner=", this.a, ", repo=", this.b, ")");
            }
        }

        public static final class c extends a {
            public final String a;

            public c(String str) {
                k71.k.g(str, "username");
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return f1.e.z("User(username=", this.a, ")");
            }
        }
    }
}
