package com.github.rudroid.fileeditor;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: com.github.rudroid.fileeditor.a$a, reason: collision with other inner class name */
    public static final class C0030a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f12887a;

        public C0030a(String str) {
            k71.k.g(str, "targetBranch");
            this.f12887a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0030a) && k71.k.b(this.f12887a, ((C0030a) obj).f12887a);
        }

        public final int hashCode() {
            return this.f12887a.hashCode();
        }

        public final String toString() {
            return f1.e.z("CommitOnDifferentBranch(targetBranch=", this.f12887a, ")");
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12888a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -73209401;
        }

        public final String toString() {
            return "CommitOnSameBranch";
        }
    }
}
