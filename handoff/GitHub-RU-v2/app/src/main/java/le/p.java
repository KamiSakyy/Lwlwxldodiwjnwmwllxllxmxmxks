package le;

import yz0.k5;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class p {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public long f28713a;

    /* renamed from: b, reason: collision with root package name */
    public int f28714b;

    public static final class a {
    }

    public static final class b extends p {

        /* renamed from: c, reason: collision with root package name */
        public String f28715c;

        public b(String str) {
            super(1, str.hashCode());
            this.f28715c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k71.k.b(this.f28715c, ((b) obj).f28715c);
        }

        public final int hashCode() {
            return this.f28715c.hashCode();
        }

        public final String toString() {
            return f1.e.z("Divider(id=", this.f28715c, ")");
        }
    }

    public static final class c extends p {

        /* renamed from: c, reason: collision with root package name */
        public k5 f28716c;

        /* renamed from: d, reason: collision with root package name */
        public String f28717d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k5 k5Var, String str) {
            super(0, k5Var.r);
            k71.k.g(k5Var, "template");
            k71.k.g(str, "repoId");
            this.f28716c = k5Var;
            this.f28717d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f28716c, cVar.f28716c) && k71.k.b(this.f28717d, cVar.f28717d);
        }

        public final int hashCode() {
            return this.f28717d.hashCode() + (this.f28716c.hashCode() * 31);
        }

        public final String toString() {
            return "Template(template=" + this.f28716c + ", repoId=" + this.f28717d + ")";
        }
    }

    public p(int i, long j10) {
        this.f28713a = j10;
        this.f28714b = i;
    }
}
